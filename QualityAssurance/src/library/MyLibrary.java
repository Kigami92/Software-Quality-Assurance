package library;

import java.util.ArrayList;

public class MyLibrary {
	String name;
	ArrayList<Book> myBooks;
	ArrayList<Person> myPeople;
	public MyLibrary(String name){
		this.name = name;
		myBooks = new ArrayList<Book>();
		myPeople = new ArrayList<Person>();
	}
	public String getName() {
		return name;
	}
	public ArrayList<Book> getMyBooks() {
		return myBooks;
	}
	public ArrayList<Person> getMyPeople() {
		return myPeople;
	}
	
	public void addBook(Book b){
		myBooks.add(b);
	}
	
	public void addPerson(Person p){
		myPeople.add(p);
	}
	
	public void removePerson(Person p){
		myPeople.remove(p);
	}
	public void removeBook(Book b) {
		myBooks.remove(b);
	}
	public boolean checkout(Book b1, Person p1) {
		if(b1.getPerson() == null){
			if(p1.getMaximumBooks() > p1.getTotalBooks()){
				p1.setTotalBooks(p1.getTotalBooks() + 1);
				b1.setPerson(p1);
				return true;
			} else 
				return false;
		} else
			return false;
	}
	public boolean checkin(Book b1) {
		if(b1.getPerson() == null){
			return false;
		} else{
			b1.getPerson().setTotalBooks(b1.getPerson().getTotalBooks() - 1);
			b1.setPerson(null);
			return true;
		}
	}
	
	public int getCountOfBooks(Person p1){
		
		return p1.getTotalBooks();
		
		/*int counter = 0;
		for(int i = 0; i < myBooks.size(); i++){
			if(myBooks.get(i).getPerson() == p1)
				counter++;
		}
		return counter;
		*/
		//I originally used the code above, then I remembered I'd already made a count for each person
	}
	
	public ArrayList<Book> getAvailableBooks(){
		ArrayList<Book> availableBooks = myBooks;
		for(int i = 0; i < myBooks.size(); i++){
			if (myBooks.get(i).getPerson() != null)
				availableBooks.remove(myBooks.get(i));
		}
		return availableBooks;
	}
	

	
	
		
}
