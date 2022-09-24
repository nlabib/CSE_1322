public class Book extends Item{
	private int isbn;
	private String author;

	public int getIsbn(){
		return isbn;
	}

	public void setIsbn(int isbn){
		this.isbn = isbn;
	}

	public String getAuthor(){
		return author;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public Book(){

	}

	public Book(String t, int isb, String au){
		super(t);
		this.isbn = isb;
		this.author = au;
	}

	public String getListing(){
		return "Book Name: " + this.getTitle() + "\n" +
				"Author: " + this.getAuthor() + "\n" +
				"ISBN# " + this.getIsbn()+"\n";
	}
}