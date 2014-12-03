package library;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
	Person p1 = new Person();
	public void testPerson() {
		assertEquals("Unknown Name", p1.getName());
		assertEquals(0, p1.getMaximumBooks());
	}

	public void testSetName() {
		p1.setName("Phil");
		assertEquals("Phil", p1.getName());
	}

	public void testSetMaximumBooks() {
		p1.setMaximumBooks(3);
		assertEquals(3, p1.getMaximumBooks());
	}
	
	public void testToString(){
		p1.setName("Fred Flinstone");
		p1.setMaximumBooks(6);
		assertEquals("Fred Flinstone(6 books)", p1.toString());
	}

}
