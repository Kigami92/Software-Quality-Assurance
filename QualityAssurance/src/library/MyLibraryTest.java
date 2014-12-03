package library;

import junit.framework.TestCase;

public class MyLibraryTest extends TestCase {
	MyLibrary l1;
	Person p1, p2;
	Book b1, b2;
	
	public void testMyLibrary() {
		setUp();
		l1.myBooks.add(b1);
		l1.myPeople.add(p1);
		assertEquals("Library", l1.name);
		assertEquals("TitleTest", l1.getMyBooks().get(0).getTitle());
		assertEquals("John", l1.getMyPeople().get(0).getName());
	}
	
	public void testAddBook(){
		setUp();
		l1.addBook(b2);
		assertEquals("The Hobbit", l1.getMyBooks().get(0).getTitle());
	}
	
	public void testAddPerson(){
		setUp();
		l1.addPerson(p2);
		assertEquals("Phil", l1.getMyPeople().get(0).getName());
	}
	
	public void testRemoveBook(){
		setUp();
		l1.addBook(b1);
		l1.addBook(b2);
		l1.removeBook(b1);
		assertEquals("The Hobbit", l1.getMyBooks().get(0).getTitle());
	}
	
	public void testRemovePerson(){
		setUp();
		l1.addPerson(p1);
		l1.addPerson(p2);
		l1.removePerson(p1);
		assertEquals("Phil", l1.getMyPeople().get(0).getName());
	}
	
	public void testCheckout(){
		setUp();
		p1.setMaximumBooks(2);
		l1.addBook(b1);
		l1.addBook(b2);
		l1.addPerson(p1);
		l1.addPerson(p2);
		assertTrue(l1.checkout(b1, p1));
		assertFalse(l1.checkout(b1,p2));
		
		Book b3 = new Book("title", "author");
		l1.addBook(b3);
		
		assertTrue(l1.checkout(b2, p1));
		assertFalse(l1.checkout(b3, p1));
	}
	
	public void testCheckin(){
		setUp();
		l1.addBook(b1);
		l1.addBook(b2);
		l1.addPerson(p1);
		l1.addPerson(p2);
		
		p1.setMaximumBooks(3);
		
		assertTrue(l1.checkout(b1, p1));
		
		assertTrue(l1.checkin(b1));
		assertFalse(l1.checkin(b1));
		p1.setMaximumBooks(2);
		l1.addPerson(p1);

		l1.checkout(b1, p1);
		assertEquals(1, p1.getTotalBooks());
		l1.checkin(b1);
		assertEquals(0, p1.getTotalBooks());
		
		
	}
	
	public void testGetCountOfBooks(){
		l1.addBook(b1);
		l1.addBook(b2);
		Book b3 = new Book("b3", "a3");
		l1.addBook(b3);
		
		p1.setMaximumBooks(3);
		l1.checkout(b1, p1);
		l1.checkout(b2, p1);
		assertEquals(2, l1.getCountOfBooks(p1));
		l1.checkout(b3, p1);
		assertEquals(3, l1.getCountOfBooks(p1));
		l1.checkin(b3);
		assertEquals(2, l1.getCountOfBooks(p1));
	}
	
	public void testGetAvailableBooks(){
		l1.addBook(b1);
		l1.addBook(b2);
		Book b3, b4, b5, b6;
		b3 = new Book("b3", "a3");
		b4 = new Book("b4", "a4");
		b5 = new Book("b5", "a5");
		b6 = new Book("b6", "a6");
		l1.addBook(b3);
		l1.addBook(b4);
		l1.addBook(b5);
		l1.addBook(b6);
		
		p1.setMaximumBooks(3);
		
		assertEquals(b1, l1.getAvailableBooks().get(0));
		assertEquals(b2, l1.getAvailableBooks().get(1));
		assertEquals(b3, l1.getAvailableBooks().get(2));
		assertEquals(b4, l1.getAvailableBooks().get(3));
		assertEquals(b5, l1.getAvailableBooks().get(4));
		assertEquals(b6, l1.getAvailableBooks().get(5));
		
		l1.checkout(b3, p1); 
		//Checkout a book in the middle of the arraylist to show that the new 
		//arraylist moves other books down the list
		
		assertEquals(b1, l1.getAvailableBooks().get(0));
		assertEquals(b2, l1.getAvailableBooks().get(1));
		assertEquals(b4, l1.getAvailableBooks().get(2));
		assertEquals(b5, l1.getAvailableBooks().get(3));
		assertEquals(b6, l1.getAvailableBooks().get(4));
	}
	
	
	public void setUp(){
		l1 = new MyLibrary("Library");
		p1 = new Person();
		p1.setName("John");
		b1 = new Book("TitleTest", "AuthorTest");
		
		b2 = new Book("The Hobbit", "Tolkien");
		p2 = new Person();
		p2.setName("Phil");
	}

}
