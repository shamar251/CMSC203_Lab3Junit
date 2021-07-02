import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTester {
	private GradeBook g1;
	private GradeBook g2;
	@BeforeEach
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(95);
		g1.addScore(80);
		g1.addScore(69);
		g2.addScore(42);
		g2.addScore(30);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("95.0 80.0 69.0"));
		assertTrue(g2.toString().equals("42.0 30.0 "));
	}

	@Test
	void testSum() {
		assertEquals(244, g1.sum(), 0.001);
		assertEquals(72 , g2.sum(), 0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(69, g1.minimum(), 0.001);
		assertEquals(30, g2.minimum(), 0.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(69, g1.finalScore(), 0.001);
		assertEquals(30, g2.finalScore(), 0.001);
	}

}
