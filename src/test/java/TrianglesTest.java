import org.junit.*;
import static org.junit.Assert.*;

public class TrianglesTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangles testTriangles = new Triangles(2,2,2);
    assertEquals(true, testTriangles instanceof Triangles);
  }

  @Test
  public void isTriangle_whenTwoSidesSumLessThanThird_false() {
    Triangles testTriangles = new Triangles(2,9,16);
    assertEquals(false, testTriangles.isTriangle());
  }

  @Test
  public void isEquilateral_whenAllSidesAreEqual_true(){
    Triangles testTriangles = new Triangles(3,3,3);
    assertEquals(true, testTriangles.isEquilateral());
  }

}
