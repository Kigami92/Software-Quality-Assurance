package library;

public class Book {
	public String title, author;
	public Person person;
	
	public Book(){
		title = "Unknown Title";
		author = "Unknown Author";
		person = null;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		person = null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public String toString(){
			if((person == null))
				return (title + " by " + author + "; Available");
			else
				return (title + " by " + author + "; Not Available");
	}
	
}
