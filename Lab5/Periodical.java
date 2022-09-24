public class Periodical extends Item{
	private int issuenum;

	public int getIssuenum(){
		return issuenum;
	}

	public void setIssuenum(int issuenum){
		this.issuenum = issuenum;
	}

	public Periodical(){

	}

	public Periodical(String t, int is){
		super(t);
		this.issuenum = is;
	}


	public String getListing(){
		return "Periodical Title - "+this.getTitle()+"\n"+"Issue # - "+this.getIssuenum()+"\n";
	}
}
