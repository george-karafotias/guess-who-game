
public class Question implements Cloneable {
	
	private String text;
	private Boolean[] answers;
	private String[] yesExclude;
	private String[] noExclude;
	
	public Question(String text, Boolean[] answers) {
		this.text = text;
		this.answers = answers;
	}
	
	public void setExclude(String[] yesExclude, String[] noExclude) {
		this.yesExclude = yesExclude;
		this.noExclude = noExclude;
	}

	public String[] getYesExclude() {
		return yesExclude;
	}
	
	public String[] getNoExclude() {
		return noExclude;
	}

	public String getText() {
		return text;
	}
	
	public Boolean[] getAnswers() {
		return answers;
	}
	
	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
