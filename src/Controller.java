import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Controller {
	
	private int characterSelections;
	private IPlayer player1;
	private RobotPlayer player2;
	private List<Question> questions;
	private List<Character> characters;
	private int player1Wins, player2Wins, games;
	
	public static void CreateCharacterArray() {
		List<Character> characters = new ArrayList<Character>();
		
		Character ch1 = new Character();
		ch1.setName("Adam");
		ch1.setPhoto("resources/game1/Adam.png");
		ch1.setSex(Character.Sex.male);
		ch1.setHairColor(Character.HairColor.brown);
		ch1.setHairType(Character.HairType.shorthair);
		ch1.setSkinColor(Character.SkinColor.white);
		ch1.setBeard(false);
		ch1.setHat(true);
		ch1.setGlasses(false);
		ch1.setMoustache(false);
		
		Character ch2 = new Character();
		ch2.setName("Tamsin");
		ch2.setPhoto("resources/game1/Tamsin.png");
		ch2.setSex(Character.Sex.female);
		ch2.setHairColor(Character.HairColor.blond);
		ch2.setHairType(Character.HairType.shorthair);
		ch2.setSkinColor(Character.SkinColor.white);
		ch2.setBeard(false);
		ch2.setHat(false);
		ch2.setGlasses(false);
		ch2.setMoustache(false);
		
		Character ch3 = new Character();
		ch3.setName("David");
		ch3.setPhoto("resources/game1/David.png");
		ch3.setSex(Character.Sex.male);
		ch3.setHairColor(Character.HairColor.black);
		ch3.setHairType(Character.HairType.curly);
		ch3.setSkinColor(Character.SkinColor.black);
		ch3.setBeard(false);
		ch3.setHat(false);
		ch3.setGlasses(false);
		ch3.setMoustache(true);
		
		Character ch4 = new Character();
		ch4.setName("Heidi");
		ch4.setPhoto("resources/game1/Heidi.png");
		ch4.setSex(Character.Sex.female);
		ch4.setHairColor(Character.HairColor.brown);
		ch4.setHairType(Character.HairType.longhair);
		ch4.setSkinColor(Character.SkinColor.white);
		ch4.setBeard(false);
		ch4.setHat(true);
		ch4.setGlasses(true);
		ch4.setMoustache(false);
		
		Character ch5 = new Character();
		ch5.setName("Charlie");
		ch5.setPhoto("resources/game1/Charlie.png");
		ch5.setSex(Character.Sex.male);
		ch5.setHairColor(Character.HairColor.blond);
		ch5.setHairType(Character.HairType.curly);
		ch5.setSkinColor(Character.SkinColor.white);
		ch5.setBeard(true);
		ch5.setHat(false);
		ch5.setGlasses(true);
		ch5.setMoustache(false);
		
		Character ch6 = new Character();
		ch6.setName("Denise");
		ch6.setPhoto("resources/game1/Denise.png");
		ch6.setSex(Character.Sex.female);
		ch6.setHairColor(Character.HairColor.brown);
		ch6.setHairType(Character.HairType.longhair);
		ch6.setSkinColor(Character.SkinColor.white);
		ch6.setBeard(false);
		ch6.setHat(false);
		ch6.setGlasses(true);
		ch6.setMoustache(false);
		
		Character ch7 = new Character();
		ch7.setName("Giselle");
		ch7.setPhoto("resources/game1/Giselle.png");
		ch7.setSex(Character.Sex.female);
		ch7.setHairColor(Character.HairColor.blond);
		ch7.setHairType(Character.HairType.shorthair);
		ch7.setSkinColor(Character.SkinColor.white);
		ch7.setBeard(false);
		ch7.setHat(false);
		ch7.setGlasses(true);
		ch7.setMoustache(false);
		
		Character ch8 = new Character();
		ch8.setName("Kevin");
		ch8.setPhoto("resources/game1/Kevin.png");
		ch8.setSex(Character.Sex.male);
		ch8.setHairColor(Character.HairColor.notapplicable);
		ch8.setHairType(Character.HairType.bald);
		ch8.setSkinColor(Character.SkinColor.white);
		ch8.setBeard(false);
		ch8.setHat(false);
		ch8.setGlasses(true);
		ch8.setMoustache(false);
		
		Character ch9 = new Character();
		ch9.setName("Sophia");
		ch9.setPhoto("resources/game1/Sophia.png");
		ch9.setSex(Character.Sex.female);
		ch9.setHairColor(Character.HairColor.blond);
		ch9.setHairType(Character.HairType.longhair);
		ch9.setSkinColor(Character.SkinColor.white);
		ch9.setBeard(false);
		ch9.setHat(true);
		ch9.setGlasses(false);
		ch9.setMoustache(false);
		
		Character ch10 = new Character();
		ch10.setName("Steven");
		ch10.setPhoto("resources/game1/Steven.png");
		ch10.setSex(Character.Sex.male);
		ch10.setHairColor(Character.HairColor.blond);
		ch10.setHairType(Character.HairType.shorthair);
		ch10.setSkinColor(Character.SkinColor.white);
		ch10.setBeard(false);
		ch10.setHat(true);
		ch10.setGlasses(false);
		ch10.setMoustache(false);
		
		Character ch11 = new Character();
		ch11.setName("Kathy");
		ch11.setPhoto("resources/game1/Kathy.png");
		ch11.setSex(Character.Sex.female);
		ch11.setHairColor(Character.HairColor.brown);
		ch11.setHairType(Character.HairType.longhair);
		ch11.setSkinColor(Character.SkinColor.white);
		ch11.setBeard(false);
		ch11.setHat(false);
		ch11.setGlasses(false);
		ch11.setMoustache(false);
		
		Character ch12 = new Character();
		ch12.setName("Matthew");
		ch12.setPhoto("resources/game1/Matthew.png");
		ch12.setSex(Character.Sex.male);
		ch12.setHairColor(Character.HairColor.black);
		ch12.setHairType(Character.HairType.longhair);
		ch12.setSkinColor(Character.SkinColor.black);
		ch12.setBeard(false);
		ch12.setHat(false);
		ch12.setGlasses(false);
		ch12.setMoustache(false);
		
		Character ch13 = new Character();
		ch13.setName("Frank");
		ch13.setPhoto("resources/game1/Frank.png");
		ch13.setSex(Character.Sex.male);
		ch13.setHairColor(Character.HairColor.notapplicable);
		ch13.setHairType(Character.HairType.bald);
		ch13.setSkinColor(Character.SkinColor.black);
		ch13.setBeard(false);
		ch13.setHat(false);
		ch13.setGlasses(false);
		ch13.setMoustache(false);
		
		Character ch14 = new Character();
		ch14.setName("Brenda");
		ch14.setPhoto("resources/game1/Brenda.png");
		ch14.setSex(Character.Sex.female);
		ch14.setHairColor(Character.HairColor.black);
		ch14.setHairType(Character.HairType.shorthair);
		ch14.setSkinColor(Character.SkinColor.white);
		ch14.setBeard(false);
		ch14.setHat(false);
		ch14.setGlasses(true);
		ch14.setMoustache(false);
		
		Character ch15 = new Character();
		ch15.setName("Raymond");
		ch15.setPhoto("resources/game1/Raymond.png");
		ch15.setSex(Character.Sex.male);
		ch15.setHairColor(Character.HairColor.notapplicable);
		ch15.setHairType(Character.HairType.bald);
		ch15.setSkinColor(Character.SkinColor.white);
		ch15.setBeard(true);
		ch15.setHat(false);
		ch15.setGlasses(true);
		ch15.setMoustache(true);
		
		Character ch16 = new Character();
		ch16.setName("Petra");
		ch16.setPhoto("resources/game1/Petra.png");
		ch16.setSex(Character.Sex.female);
		ch16.setHairColor(Character.HairColor.black);
		ch16.setHairType(Character.HairType.longhair);
		ch16.setSkinColor(Character.SkinColor.white);
		ch16.setBeard(false);
		ch16.setHat(true);
		ch16.setGlasses(false);
		ch16.setMoustache(false);
		
		Character ch17 = new Character();
		ch17.setName("Lucas");
		ch17.setPhoto("resources/game1/Lucas.png");
		ch17.setSex(Character.Sex.male);
		ch17.setHairColor(Character.HairColor.black);
		ch17.setHairType(Character.HairType.shorthair);
		ch17.setSkinColor(Character.SkinColor.white);
		ch17.setBeard(false);
		ch17.setHat(true);
		ch17.setGlasses(false);
		ch17.setMoustache(false);
		
		Character ch18 = new Character();
		ch18.setName("Yvette");
		ch18.setPhoto("resources/game1/Yvette.png");
		ch18.setSex(Character.Sex.female);
		ch18.setHairColor(Character.HairColor.brown);
		ch18.setHairType(Character.HairType.longhair);
		ch18.setSkinColor(Character.SkinColor.black);
		ch18.setBeard(false);
		ch18.setHat(false);
		ch18.setGlasses(false);
		ch18.setMoustache(false);
		
		characters.add(ch1);
		characters.add(ch2);
		characters.add(ch3);
		characters.add(ch4);
		characters.add(ch5);
		characters.add(ch6);
		characters.add(ch7);
		characters.add(ch8);
		characters.add(ch9);
		characters.add(ch10);
		characters.add(ch11);
		characters.add(ch12);
		characters.add(ch13);
		characters.add(ch14);
		characters.add(ch15);
		characters.add(ch16);
		characters.add(ch17);
		characters.add(ch18);
		
		Characters ch = new Characters();
		ch.setCharacters(characters);
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Characters.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(ch, System.out);
			jaxbMarshaller.marshal(ch, new File("resources/game1/game1.xml"));
		} catch(Exception exc) {
			System.out.println(exc);
		}
	}

	public static Characters ReadCharacterArray() throws JAXBException 
	{
		JAXBContext jaxbContext = JAXBContext.newInstance(Characters.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Characters ch = (Characters) jaxbUnmarshaller.unmarshal(new File("resources/game1/game1.xml"));
		return ch;
	}
	
	public static void main(String[] args) {
		Characters characters = null;
		try {
			characters = ReadCharacterArray();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		if (characters != null) {
			Controller controller = new Controller();
			controller.init(characters.getCharacters());
		}
	}
	
	public void init(List<Character> characters) {
		player1Wins = 0;
		player2Wins = 0;
		games = 0;
		
		player1 = new Player(this, characters);
		player2 = new RobotPlayer(this);
		
		startNewGame(characters);
	}
	
	private void startNewGame(List<Character> characters) {
		characterSelections = 0;
		this.characters = characters;
		questions = createQuestions(characters);
		
		player1.init(characters);
		player2.init(characters);
		
		player1.selectCharacter();
		player2.selectCharacter();
	}
	
	public List<Question> createQuestions(List<Character> characters) {
		if (characters == null) return null;
		
		questions = new ArrayList<Question>();
		int numberOfCharacters = characters.size();
		
		Boolean[] maleCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			maleCharacter[i] = characters.get(i).getSex().equals(Character.Sex.male);
		
		Boolean[] femaleCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			femaleCharacter[i] = characters.get(i).getSex().equals(Character.Sex.female);
		
		Boolean[] hatCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			hatCharacter[i] = characters.get(i).wearsHat();
		
		Boolean[] glassCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			glassCharacter[i] = characters.get(i).wearsGlasses();
		
		Boolean[] baldCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			baldCharacter[i] = characters.get(i).getHairType().equals(Character.HairType.bald);
		
		Boolean[] longHairCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			longHairCharacter[i] = characters.get(i).getHairType().equals(Character.HairType.longhair);
		
		Boolean[] shortHairCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			shortHairCharacter[i] = characters.get(i).getHairType().equals(Character.HairType.shorthair);
		
		Boolean[] curlyHairCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			curlyHairCharacter[i] = characters.get(i).getHairType().equals(Character.HairType.curly);
		
		Boolean[] blackSkinCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			blackSkinCharacter[i] = characters.get(i).getSkinColor().equals(Character.SkinColor.black);
		
		Boolean[] whiteSkinCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			whiteSkinCharacter[i] = characters.get(i).getSkinColor().equals(Character.SkinColor.white);
		
		Boolean[] blondHairCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			blondHairCharacter[i] = characters.get(i).getHairColor().equals(Character.HairColor.blond);
		
		Boolean[] blackHairCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			blackHairCharacter[i] = characters.get(i).getHairColor().equals(Character.HairColor.black);
		
		Boolean[] brownHairCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			brownHairCharacter[i] = characters.get(i).getHairColor().equals(Character.HairColor.brown);
		
		Boolean[] beardCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			beardCharacter[i] = characters.get(i).hasBeard();
		
		Boolean[] moustacheCharacter = new Boolean[numberOfCharacters];
		for (int i=0; i<numberOfCharacters; i++)
			moustacheCharacter[i] = characters.get(i).hasMoustache();
		
		Question q1 = new Question("IS YOUR CHARACTER A MALE?", maleCharacter);
		Question q2 = new Question("IS YOUR CHARACTER A FEMALE?", femaleCharacter);
		Question q3 = new Question("IS YOUR CHARACTER WEARING A HAT?", hatCharacter);
		Question q4 = new Question("IS YOUR CHARACTER WEARING GLASSES?", glassCharacter);
		Question q5 = new Question("IS YOUR CHARACTER BALD?", baldCharacter);
		Question q6 = new Question("DOES YOUR CHARACTER HAVE LONG HAIR?", longHairCharacter);
		Question q7 = new Question("DOES YOUR CHARACTER HAVE SHORT HAIR?", shortHairCharacter);
		Question q8 = new Question("DOES YOUR CHARACTER HAVE CURLY HAIR?", curlyHairCharacter);
		Question q9 = new Question("DOES YOUR CHARACTER HAVE BLACK SKIN?", blackSkinCharacter);
		Question q10 = new Question("DOES YOUR CHARACTER HAVE WHITE SKIN?", whiteSkinCharacter);
		Question q11 = new Question("DOES YOUR CHARACTER HAVE BLONDE HAIR?", blondHairCharacter);
		Question q12 = new Question("DOES YOUR CHARACTER HAVE BLACK HAIR?", blackHairCharacter);
		Question q13 = new Question("DOES YOUR CHARACTER HAVE BROWN HAIR?", brownHairCharacter);
		Question q14 = new Question("IS YOUR CHARACTER HAVING A BEARD?", beardCharacter);
		Question q15 = new Question("IS YOUR CHARACTER HAVING A MOUSTACHE?", moustacheCharacter);
		
		questions.add(q1);
		questions.add(q2);
		questions.add(q3);
		questions.add(q4);
		questions.add(q5);
		questions.add(q6);
		questions.add(q7);
		questions.add(q8);
		questions.add(q9);
		questions.add(q10);
		questions.add(q11);
		questions.add(q12);
		questions.add(q13);
		questions.add(q14);
		questions.add(q15);
		
		q1.setExclude(getQuestionsText(new int[] {1}), getQuestionsText(new int[] {1,4,13,14}));
		q2.setExclude(getQuestionsText(new int[] {0,4,13,14}), getQuestionsText(new int[] {0}));
		q3.setExclude(null, null);
		q4.setExclude(null, null);
		q5.setExclude(getQuestionsText(new int[] {1,5,6,7}), null);
		q6.setExclude(getQuestionsText(new int[] {4,6,7}), null);
		q7.setExclude(getQuestionsText(new int[] {4,5,7}), null);
		q8.setExclude(getQuestionsText(new int[] {4,5,6}), null);
		q9.setExclude(getQuestionsText(new int[] {9}), getQuestionsText(new int[] {9}));
		q10.setExclude(getQuestionsText(new int[] {8}), getQuestionsText(new int[] {8}));
		q11.setExclude(getQuestionsText(new int[] {5,11,12}), null);
		q12.setExclude(getQuestionsText(new int[] {5,10,12}), null);
		q13.setExclude(getQuestionsText(new int[] {5,10,11}), null);
		q14.setExclude(getQuestionsText(new int[] {1}), null);
		q15.setExclude(getQuestionsText(new int[] {1}), null);
		
		return questions;
	}
	
	private List<String> getQuestionsText() {
		List<String> texts = new ArrayList<String>();
		for (Question q : questions) {
			texts.add(q.getText());
		}
		
		return texts;
	}
	
	private String[] getQuestionsText(int[] filter) {
		String[] texts = new String[filter.length];
		for (int i=0; i<filter.length; i++) {
			texts[i] = questions.get(filter[i]).getText();
		}
		return texts;
	}
	
	private void setQuestions(IPlayer player) {
		if (isRobotPlayer(player)) {
			((RobotPlayer)player).setQuestions(questions);
		}
		else {
			((Player)player).setQuestions(getQuestionsText());
		}
	}
	
	public synchronized void characterSelected() {
		characterSelections++;
		if (characterSelections == 2) {
			setQuestions(player1);
			setQuestions(player2);
			
			player1.makeQuestion();
		}
	}
	
	private boolean isRobotPlayer(IPlayer player) {
		return (player.getClass().getName().equals("RobotPlayer"));
	}
	
	private boolean checkGameOver(IPlayer player1, IPlayer player2) {
		boolean gameOver = false;
		int remainingCharacters1 = player1.getRemainingCharactersSize();
		int remainingCharacters2 = player2.getRemainingCharactersSize();
		String player1Character = characters.get(player1.getSelectedCharacterIndex()).getName();
		String player2Character = characters.get(player2.getSelectedCharacterIndex()).getName();
		
		if (remainingCharacters1 <= 1) {
			player1.gameOver(true, player1Character, player2Character);
			player2.gameOver(false, player2Character, player1Character);
			player1Wins++;
			games++;
			player1.updateGamesStatistics(games, player1Wins, player2Wins);
			player2.updateGamesStatistics(games, player2Wins, player1Wins);
			gameOver = true;
		} else if (remainingCharacters2 <= 1) {
			player1.gameOver(false, player1Character, player2Character);
			player2.gameOver(true, player2Character, player1Character);
			player2Wins++;
			games++;
			player1.updateGamesStatistics(games, player1Wins, player2Wins);
			player2.updateGamesStatistics(games, player2Wins, player1Wins);
			gameOver = true;
		}
		
		return gameOver;
	}
	
	private Boolean[] getQuestionAnswers(String text) {
		for (Question q : questions) {
			if (q.getText().equals(text))
				return q.getAnswers();
		}
		
		return null;
	}
	
	public boolean validateAnswer(int selectedCharacterIndex, String question, boolean answer) {
		Boolean[] characterAnswers = getQuestionAnswers(question);
		Boolean correctAnswer = characterAnswers[selectedCharacterIndex];
		return (correctAnswer == answer);
	}
	
	public Boolean[] answersToAlive(Boolean[] answers, int selectedCharacterIndex) {
		Boolean[] alive = new Boolean[answers.length];
		
		Boolean hasCharacteristic = answers[selectedCharacterIndex];
		if (hasCharacteristic) {
			alive = answers;
		} else {
			for (int i=0; i<answers.length; i++)
				alive[i] = (answers[i]) ? false : true;
		}
		
		return alive;
	}
	
	public void questionMade(IPlayer player, String question) {
		IPlayer otherPlayer = (player == player1) ? player2 : player1; 
		
		if (isRobotPlayer(otherPlayer)) {
			int selectedCharacterIndex = ((RobotPlayer)otherPlayer).getSelectedCharacterIndex();
			if (selectedCharacterIndex != -1) {
				Boolean[] answers = getQuestionAnswers(question);
				player.setAlive(answersToAlive(answers, selectedCharacterIndex));
				if (!checkGameOver(player, otherPlayer))
					otherPlayer.makeQuestion();
			}
		} else {
			((Player)otherPlayer).answerQuestion(question);
		}
	}
	
	public void questionAnswered(IPlayer player, String question, boolean answer) {
		IPlayer otherPlayer = (player == player1) ? player2 : player1; 
		
		if (isRobotPlayer(otherPlayer)) {
			Boolean[] answers = getQuestionAnswers(question);
			Boolean[] alive = new Boolean[answers.length];
			if (answer) {
				alive = answers;
			} else {
				for (int i=0; i<answers.length; i++)
					alive[i] = (answers[i]) ? false : true;
			}
			otherPlayer.setAlive(alive);
			if (!checkGameOver(player, otherPlayer)) {
				((RobotPlayer)otherPlayer).questionAnswered(answer);
				player.makeQuestion();
			}
		}
	}
	
	public Question selectMinimumAliveQuestion(List<Question> questions, List<Integer> currentAliveCharacters) {
		Question selectedQuestion = null;
		double minimumDifference = 1;
				
		for (Question q : questions) {
			Boolean[] answers = getQuestionAnswers(q.getText());
			List<Boolean> answersForAliveCharacters = new ArrayList<Boolean>(currentAliveCharacters.size());
			for (int i=0; i<currentAliveCharacters.size(); i++)
				answersForAliveCharacters.add(answers[currentAliveCharacters.get(i)]);
			Boolean[] answersForAliveCharactersArr = answersForAliveCharacters.toArray(new Boolean[0]);
			
			Boolean[] yesAlive = answersForAliveCharactersArr;
			int yesAliveNumber = 0;
			for (int i=0; i<yesAlive.length; i++)
				if (yesAlive[i]) yesAliveNumber++;
			
			double questionYesAlivePercentage = (double)yesAliveNumber/currentAliveCharacters.size();
			if ((Math.abs(questionYesAlivePercentage - 0.45) < minimumDifference)) {
				minimumDifference = (Math.abs(questionYesAlivePercentage - 0.45));
				selectedQuestion = q;
			}
		}
		
		return selectedQuestion;
	}
	
	public void startNewGame() {
		startNewGame(characters);
	}
}
