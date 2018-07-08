import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;


public class RobotPlayer implements IPlayer {

	private Controller controller;
	private LinkedHashMap<Character, Boolean> characters;
	private int selectedCharacterIndex;
	private List<Question> questions;
	private Question lastQuestion;
	private int level;
	
	public RobotPlayer(Controller controller) {
		this.controller = controller;
	}
	
	public void init(List<Character> characters) {
		selectedCharacterIndex = -1;
		this.characters = new LinkedHashMap<Character, Boolean>();
		for (int i=0; i<characters.size(); i++)
			this.characters.put(characters.get(i), true);
		lastQuestion = null;
		level = 2;
	}
	
	public void selectCharacter() {
		if (characters != null) {
			Random r = new Random();
			selectedCharacterIndex = r.nextInt(characters.size());
		}
		controller.characterSelected();
	}
	
	public int getSelectedCharacterIndex() {
		return selectedCharacterIndex;
	}
	
	public void questionAnswered(boolean answer) {
		if (lastQuestion!=null && questions!=null && questions.size() > 0) {
			String[] qtextToExclude = null;
			if (answer)
				qtextToExclude = lastQuestion.getYesExclude();
			else
				qtextToExclude = lastQuestion.getNoExclude();
			
			removeExludeQuestions(lastQuestion, qtextToExclude);
		} else {
			lastQuestion = null;
		}
	}
	
	private void removeExludeQuestions(Question q, String[] toExcludeText) {
		List<Question> questionsToExclude = new ArrayList<Question>();
		questionsToExclude.remove(q);
		
		if (toExcludeText != null) {
			for (String questionToExclude : toExcludeText) {
				int i = 0;
				boolean found = false;
				while (!found && i<questions.size()) {
					if (questions.get(i).getText().equals(questionToExclude)) {
						questionsToExclude.add(questions.get(i));
						found = true;
					}
					i++;
				}
			}
		}
		
		for (int i=0; i<questionsToExclude.size(); i++)
			questions.remove(questionsToExclude.get(i));
	}

	public void makeQuestion() {
		if (questions != null && questions.size() > 0) {
			Question q = selectQuestion();
			lastQuestion = q;
			questions.remove(q);
			controller.questionMade(this, q.getText());
		} else {
			controller.questionMade(this, null);
		}
	}
	
	private Question selectQuestion() {
		if (level == 1)
			return selectQuestionRandomly();
		else if (level == 2)
			return controller.selectMinimumAliveQuestion(questions, getCurrentAliveCharacters());
		return null;
	}
	
	private Question selectQuestionRandomly() {
		Random r = new Random();
		Question q = questions.get(r.nextInt(questions.size()));
		return q;
	}
	
	private List<Question> cloneList(List<Question> list) {
	    List<Question> clone = new ArrayList<Question>(list.size());
	    for (Question item : list) clone.add((Question) item.clone());
	    return clone;
	}
	
	public void setQuestions(List<Question> questions) {
		this.questions = cloneList(questions);
	}
	
	public void setAlive(Boolean[] alive) {
		if (alive == null || characters == null || alive.length != characters.size())
			return;
		
		List<Character> characterList = new ArrayList<Character>(characters.keySet());
		for (int i=0; i<characterList.size(); i++)
			if (characters.get(characterList.get(i)) && !alive[i])
				characters.put(characterList.get(i), false);
	}
	
	private List<Integer> getCurrentAliveCharacters() {
		Iterator<Entry<Character, Boolean>> it = characters.entrySet().iterator();
	    List<Integer> currentAliveCharacters = new ArrayList<Integer>();
	    int index = 0;
		while (it.hasNext()) {
	        Map.Entry<Character, Boolean> pair = (Entry<Character, Boolean>)it.next();
	        if (pair.getValue())
	        	currentAliveCharacters.add(index);
	        index++;
		}

		return currentAliveCharacters;
	}

	public int getRemainingCharactersSize() {
		Iterator<Entry<Character, Boolean>> it = characters.entrySet().iterator();
	    int remaining = 0;
		while (it.hasNext()) {
	        Map.Entry<Character, Boolean> pair = (Entry<Character, Boolean>)it.next();
	        if (pair.getValue())
	        	remaining++;
	    }

		return remaining;
	}

	public void gameOver(boolean youWon, String yourCharacter, String opponentCharacter) {
		
	}
	
	public void updateGamesStatistics(int games, int yourWins, int yourDefeats) {
		
	}
}
