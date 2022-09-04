public class Question{
	private String questionText;
	private String questionAnswer;
	private int lvlOfDif;

	public Question(String qt, String qa, int lod){
		questionText = qt;
		questionAnswer = qa;
		lvlOfDif = lod;
	}

	public String getQuestionAnswer(){
		return questionAnswer;
	}

	public String getQuestionText(){
		return questionText;
	}

	public int getLvlOfDif(){
		return lvlOfDif;
	}

	public void setQuestionText(String questionText){
		this.questionText = questionText;
	}

	public void setQuestionAnswer(String questionAnswer){
		this.questionAnswer = questionAnswer;
	}

	public void setLvlOfDif(int lvlOfDif){

			this.lvlOfDif = lvlOfDif;
	}
}