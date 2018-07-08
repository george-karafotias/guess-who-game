import java.util.List;

public interface IPlayer {
	
	public void init(List<Character> characters);
	
	public void selectCharacter();
		
	public void makeQuestion();
	
	public void setAlive(Boolean[] alive);
	
	public int getRemainingCharactersSize();
	
	public int getSelectedCharacterIndex();
	
	public void gameOver(boolean youWon, String yourCharacter, String opponentCharacter);
	
	public void updateGamesStatistics(int games, int yourWins, int yourDefeats);
}
