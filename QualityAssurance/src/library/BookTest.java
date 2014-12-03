package library;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	Book b1 = new Book("Narnia", "C.S. Lewis");
	
	public void testBook(){
		assertEquals("Narnia", b1.title);
		assertEquals("C.S. Lewis", b1.author);
		assertEquals(null, b1.getPerson());
	}
	
	public void testSetTitle(){
		b1.setTitle("The Hobbit");
		assertEquals("The Hobbit", b1.getTitle());
	}
	
	public void testSetAuthor(){
		b1.setAuthor("J.R.R. Tolkien");
		assertEquals("J.R.R. Tolkien", b1.getAuthor());
	}
	
	public void testSetPerson(){
		Person p1 = new Person();
		p1.setName("Phil Richards");
		p1.setMaximumBooks(4);
		b1.setPerson(p1);
		assertEquals("Phil Richards(4 books)", b1.getPerson().toString());
	}
	
	public void testGetPerson(){
		Person p1 = new Person();
		p1.setName("Phil Richards");
		p1.setMaximumBooks(4);
		b1.setPerson(p1);
		assertEquals(p1, b1.getPerson());
	}
	
	public void testToString(){
		//"Author: " + author + "; Title:" + title + "; Available"
		assertEquals("Narnia by C.S. Lewis; Available", b1.toString());
		
		Person p1 = new Person();
		p1.setName("Phil Richards");
		p1.setMaximumBooks(4);
		b1.setPerson(p1);
		assertEquals("Narnia by C.S. Lewis; Not Available", b1.toString());
	}
}
