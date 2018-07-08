import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Player implements IPlayer {
	
	private PlayerGui playerGui;
	private Controller controller;
	private HashMap<Character, Boolean> characters;
	private int selectedCharacterIndex;
	
	public Player(Controller controller, List<Character> characters) {
		this.controller = controller;
		playerGui = new PlayerGui(this, characters);
	}
	
	public void init(List<Character> characters) {
		selectedCharacterIndex = -1;
		this.characters = new HashMap<Character, Boolean>();
		for (int i=0; i<characters.size(); i++)
			this.characters.put(characters.get(i), true);
		playerGui.init(characters);
	}

	public void selectCharacter() {
		playerGui.selectCharacter();
	}
	
	public void characterSelected(int index) {
		selectedCharacterIndex = index;
		controller.characterSelected();
	}
	
	public void setQuestions(List<String> questions) {
		playerGui.setQuestions(questions);
	}

	public void makeQuestion() {
		playerGui.makeQuestion();
	}
	
	public void questionMade(String question) {
		controller.questionMade(this, question);
	}
	
	public int getSelectedCharacterIndex() {
		return selectedCharacterIndex;
	}
	
	public void setAlive(Boolean[] alive) {
		if (alive == null || characters == null || alive.length != characters.size())
			return;
		
		List<Character> characterList = new ArrayList<Character>(characters.keySet());
		for (int i=0; i<characterList.size(); i++) {
			if (characters.get(characterList.get(i)) && !alive[i])
				characters.put(characterList.get(i), false);
		}
			
		playerGui.setAnswers(characters.values().toArray(new Boolean[0]));
	}
	
	public void answerQuestion(String question) {
		playerGui.answerQuestion(question);
	}
	
	public void questionAnswered(String question, boolean answer) {
		boolean validated = controller.validateAnswer(selectedCharacterIndex, question, answer);
		if (!validated)
			playerGui.answerQuestion(question);
		else
			controller.questionAnswered(this, question, answer);
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
		playerGui.gameOver(youWon, yourCharacter, opponentCharacter);
	}
	
	public void startNewGame() {
		controller.startNewGame();
	}

	public void updateGamesStatistics(int games, int yourWins, int yourDefeats) {
		playerGui.updateGamesStatistics(games, yourWins, yourDefeats);
	}
}
