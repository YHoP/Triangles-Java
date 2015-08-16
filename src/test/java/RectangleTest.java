import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {

	@Test
	public void newRectangle_instantiatesCorrectly() {
		Rectangle testRectangle = new Rectangle(2, 2);
		assertEquals(true, testRectangle instanceof Rectangle);
	}
	/* 
	instanceof keyword is a binary operator used to test if an object (instance) is a subtype of a given Type.
	It's an operator that returns true if the left side of the expression is an instance of the class name on the right side.
	*/
			
	@Test
	public void isSquare_whenNotASquare_false() {
		Rectangle testRectangle = new Rectangle(2, 4);
		assertEquals(false, testRectangle.isSquare());
	}
	
	@Test
	public void isSquare_whenSquare_true() {
		Rectangle testRectangle = new Rectangle(2, 2);
		assertEquals(true, testRectangle.isSquare());
	}

	@Test
	public void isSquare_allSidesEqual_true() {
	Rectangle testRectangle = new Rectangle(2, 2);
	assertEquals(true, testRectangle.isSquare());
	}

	@Test 
	public void newRectangle_setsLength() { 
		Rectangle testRectangle = new Rectangle(2, 2); 
		assertEquals(2, testRectangle.getLength()); 
	} 
	
	@Test public void newRectangle_setsWidth() {
		Rectangle testRectangle = new Rectangle(2, 2); 
		assertEquals(2, testRectangle.getWidth()); 
	}
}
