package juu;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;


public class GradeBookTester {
	
	private GradeBook book1;
	private GradeBook book2;
	
	@Before
	public void setUp() throws Exception {
		book1= new GradeBook(5);
		book2= new GradeBook(5);
		
		book1.addScore(84.5);
		book1.addScore(72.0);
		book1.addScore(50.0);
		book2.addScore(99.5);
		book2.addScore(90.0);
		
	}

	@After
	public void tearDown() throws Exception {
		book1=null;
		book2=null;
		
	}

	@Test
	public void testAddScore() {
		
		assertEquals(3, book1.getScoreSize());
		assertTrue(book1.toString().equals("84.5 72.0 50.0"));
		
		book1.addScore(70.0);
		
		assertEquals(4, book1.getScoreSize());
		assertTrue(book1.toString().equals("84.5 72.0 50.0 70.0"));
	
	}

	@Test
	public void testSum() {
		assertEquals(206.5, book1.sum(), 0.001);
		assertEquals(189.5, book2.sum(), 0.001);
		
	}

	@Test
	public void testMinimum() {
		assertEquals(50.0, book1.minimum(), 0.001);
		assertEquals(90.0, book2.minimum(), 0.001);
		  
        GradeBook emptyBook = new GradeBook(5);
        assertEquals(0.0, emptyBook.finalScore(), 0.001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(156.5, book1.finalScore(), 0.001);
		assertEquals(99.5, book2.finalScore(), 0.001);
		
		GradeBook singleScoreBook = new GradeBook(5);
        singleScoreBook.addScore(70.0);
        assertEquals(70.0, singleScoreBook.finalScore(), 0.001);
        GradeBook emptyBook = new GradeBook(5);
        assertEquals(0.0, emptyBook.finalScore(), 0.001);
	}

	@Test
	public void testGetScoreSize() {
		assertEquals(3, book1.getScoreSize());
        assertEquals(2, book2.getScoreSize());
        book2.addScore(88.0);
        assertEquals(3, book2.getScoreSize());
	}

	@Test
	public void testToString() {
		assertEquals("84.5 72.0 50.0", book1.toString());
		assertEquals("99.5 90.0", book2.toString());
		GradeBook emptyBook = new GradeBook(5);
        assertEquals("", emptyBook.toString());
	}

}
