package library;

public class Person {
	String name;
	int maximumBooks;
	int totalBooks;
	
	public Person(){
		name = "Unknown Name";
		maximumBooks = 0;
		totalBooks = 0;
	}
	
	public int getTotalBooks(){
		return totalBooks;
	}
	
	public void setTotalBooks(int total){
		totalBooks = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String toString(){
		return(name + "(" + maximumBooks + " books)");
	}

	
}
