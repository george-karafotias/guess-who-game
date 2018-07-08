import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;


public class PlayerGui extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private Player player;
	
	private List<JButton> characterButtons;
	private JLabel selectedCharacterIcon;
	private JComboBox<String> questionCombo;
	private JButton askButton;
	private JLabel gamesLabel, winsLabel, defeatsLabel;
	private JButton newGameButton;
	
	public PlayerGui(Player player, List<Character> characters) {
		this.player = player;
		
		JPanel charactersPanel = createCharactersPanel(characters);
		JPanel infoPanel = createInfoPanel();
		JPanel questionPanel = createQuestionPanel();
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(charactersPanel, BorderLayout.CENTER);
		centerPanel.add(questionPanel, BorderLayout.SOUTH);
		
		this.setSize(800, 600);
		this.setLayout(new BorderLayout());
		this.add(infoPanel, BorderLayout.EAST);
		this.add(centerPanel, BorderLayout.CENTER);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void init(List<Character> characters) {
		if (characterButtons.size() == characters.size()) {
			for (int i=0; i<characters.size(); i++) {
				ImageIcon characterIcon = new ImageIcon(characters.get(i).getPhoto());
				Image characterImage = characterIcon.getImage().getScaledInstance(100, 140, java.awt.Image.SCALE_SMOOTH) ;  
				ImageIcon adjustedIcon = new ImageIcon(characterImage);
				JButton characterButton = new JButton(adjustedIcon);
				characterButton.setEnabled(false);
				characterButtons.get(i).addActionListener(this);
				characterButtons.get(i).setIcon(adjustedIcon);
			}
		}
		
		selectedCharacterIcon.setIcon(new ImageIcon("resources/unknown.jpg"));
		questionCombo.removeAllItems();
		questionCombo.setEnabled(false);
		askButton.setEnabled(false);
		newGameButton.setEnabled(false);
	}
	
	private JPanel createCharactersPanel(List<Character> characters) {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(600, 420));
		panel.setLayout(new GridLayout(3,6));
		
		if (characters != null) {
			characterButtons = new ArrayList<JButton>();
			
			for (int i=0; i<characters.size(); i++) {
				ImageIcon characterIcon = new ImageIcon(characters.get(i).getPhoto());
				Image characterImage = characterIcon.getImage().getScaledInstance(100, 140, java.awt.Image.SCALE_SMOOTH) ;  
				ImageIcon adjustedIcon = new ImageIcon(characterImage);
				JButton characterButton = new JButton(adjustedIcon);
				characterButton.setPreferredSize(new Dimension(100, 140));
				characterButton.setEnabled(false);
				characterButton.addActionListener(this);
				characterButtons.add(characterButton);
				panel.add(characterButton);
			}
		}
		
		return panel;
	}
	
	private JPanel createInfoPanel() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JLabel logoLabel = new JLabel(new ImageIcon("resources/logo.jpg"));
		logoLabel.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(logoLabel);
		panel.add(Box.createRigidArea(new Dimension(0, 20)));
		selectedCharacterIcon = new JLabel(new ImageIcon("resources/unknown.jpg"));
		selectedCharacterIcon.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(selectedCharacterIcon);
		
		panel.add(Box.createRigidArea(new Dimension(0, 40)));
		Font labelFont = new Font("Serif", Font.PLAIN, 18);
		
		JPanel statsPanel1 = new JPanel();
		statsPanel1.setBackground(Color.white);
		statsPanel1.setLayout(new BoxLayout(statsPanel1, BoxLayout.X_AXIS));
		JLabel gamesLabel1 = new JLabel("GAMES: ", SwingConstants.RIGHT);
		gamesLabel1.setFont(labelFont);
		statsPanel1.add(gamesLabel1);
		gamesLabel = new JLabel("0");
		gamesLabel.setFont(labelFont);
		statsPanel1.add(gamesLabel);
		panel.add(statsPanel1);
		
		JPanel statsPanel2 = new JPanel();
		statsPanel2.setBackground(Color.white);
		statsPanel2.setLayout(new BoxLayout(statsPanel2, BoxLayout.X_AXIS));
		JLabel winsLabel1 = new JLabel("WINS: ", SwingConstants.RIGHT);
		winsLabel1.setFont(labelFont);
		statsPanel2.add(winsLabel1);
		winsLabel = new JLabel("0");
		winsLabel.setFont(labelFont);
		statsPanel2.add(winsLabel);
		panel.add(statsPanel2);
		
		JPanel statsPanel3 = new JPanel();
		statsPanel3.setBackground(Color.white);
		statsPanel3.setLayout(new BoxLayout(statsPanel3, BoxLayout.X_AXIS));
		JLabel defeatsLabel1 = new JLabel("DEFEATS: ", SwingConstants.RIGHT);
		defeatsLabel1.setFont(labelFont);
		statsPanel3.add(defeatsLabel1);
		defeatsLabel = new JLabel("0");
		defeatsLabel.setFont(labelFont);
		statsPanel3.add(defeatsLabel);
		panel.add(statsPanel3);
		
		panel.add(Box.createRigidArea(new Dimension(0, 30)));
		JPanel newGamePanel = new JPanel();
		newGamePanel.setBackground(Color.white);
		newGameButton = new JButton("New Game");
		newGameButton.setFont(labelFont);
		newGameButton.addActionListener(this);
		newGamePanel.add(newGameButton);
		panel.add(newGamePanel);
		
		return panel;
	}
	
	private JPanel createQuestionPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,15,5,15);
		panel.setPreferredSize(new Dimension(600, 180));
		
		questionCombo = new JComboBox<String>();
		questionCombo.setPreferredSize(new Dimension(300, 30));
		questionCombo.setEnabled(false);
		askButton = new JButton("ASK");
		askButton.setPreferredSize(new Dimension(100, 40));
		askButton.setBackground(Color.orange);
		askButton.setEnabled(false);
		askButton.addActionListener(this);
		panel.add(questionCombo, gbc);
		panel.add(askButton, gbc);
		
		return panel;
	}
	
	public void selectCharacter() {
		enableCharacterSelection();
	}
	
	public void makeQuestion() {
		questionCombo.setEnabled(true);
		askButton.setEnabled(true);
	}
	
	public void setAnswers(Boolean[] answers) {
		if (answers == null || characterButtons == null || answers.length != characterButtons.size())
			return;
		
		for (int i=0; i<characterButtons.size(); i++) {
			characterButtons.get(i).setEnabled(answers[i]);
		}
	}
	
	private void enableCharacterSelection() {
		if (characterButtons != null) {
			for (int i=0; i<characterButtons.size(); i++)
				characterButtons.get(i).setEnabled(true);
		}
	}
	
	private void disableCharacterSelection() {
		if (characterButtons != null) {
			for (int i=0; i<characterButtons.size(); i++)
				characterButtons.get(i).removeActionListener(this);
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void setQuestions(List<String> questions) {
		questionCombo.setModel(new DefaultComboBoxModel(questions.toArray()));
	}
	
	private boolean isCharacterSelection(ActionEvent e) {
		int selectedCharacter = -1;
		for (int i=0; i<characterButtons.size(); i++) {
			if (e.getSource() == characterButtons.get(i)) {
				selectedCharacter = i;
				break;
			}
		}
		
		if (selectedCharacter != -1) {
			disableCharacterSelection();
			selectedCharacterIcon.setIcon(characterButtons.get(selectedCharacter).getIcon());
			player.characterSelected(selectedCharacter);
			return true;
		}
		
		return false;
	}
	
	public void answerQuestion(String question) {
		int reply = JOptionPane.showConfirmDialog(this, question, "Question", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        	player.questionAnswered(question, true);
        else
        	player.questionAnswered(question, false);
	}
	
	public void gameOver(boolean youWon, String yourCharacter, String opponentCharacter) {
		String message = (youWon) ? "YOU WON!" : "GAME OVER. YOUR CHARACTER IS " + yourCharacter + ".";
		JOptionPane.showMessageDialog(this, message);
		
		questionCombo.removeAllItems();
		questionCombo.setEnabled(false);
		askButton.setEnabled(false);
	}

	public void actionPerformed(ActionEvent e) {
		if (isCharacterSelection(e)) 
			return;
		
		if (e.getSource() == askButton) {
			Object selectedQuestion = questionCombo.getSelectedItem();
			if (selectedQuestion != null) {
				player.questionMade(selectedQuestion.toString());
				questionCombo.removeItem(selectedQuestion);
			}
		}
		
		if (e.getSource() == newGameButton) {
			player.startNewGame();
		}
	}
	
	public void updateGamesStatistics(int games, int yourWins, int yourDefeats) {
		gamesLabel.setText(Integer.toString(games));
		winsLabel.setText(Integer.toString(yourWins));
		defeatsLabel.setText(Integer.toString(yourDefeats));
		newGameButton.setEnabled(true);
	}
}
