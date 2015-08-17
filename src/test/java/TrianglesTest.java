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
    Triangles testTriangles = new Triangles(1,2,3);
    assertEquals(false, testTriangles.isTriangle());
  }

  @Test
  public void isEquilateral_whenAllSidesAreEqual_true(){
    Triangles testTriangles = new Triangles(3,3,3);
    assertEquals(true, testTriangles.isEquilateral());
  }

  @Test
  public void isIsosceles_whenTwoSidesAreEqual_true() {
    Triangles testTriangles = new Triangles (2,3,2);
    assertEquals(true, testTriangles.isIsosceles());
  }

  @Test
  public void isScalene_whenNoSidesAreEqual_true() {
    Triangles testTriangles = new Triangles (2,3,4);
    assertEquals(true, testTriangles.isScalene());
  }

  @Test
  public void triangleType_isReturnedCorrectType_Equilateral(){
    Triangles testTriangles = new Triangles (2,2,2);
    assertEquals("Equilateral", testTriangles.triangleType());
  }

  @Test
  public void triangleType_isReturnedCorrectType_Isosceles() {
    Triangles testTriangles = new Triangles (2,2,3);
    assertEquals("Isosceles", testTriangles.triangleType());
  }

  @Test
  public void triangleType_isReturnedCorrectType_Scalene() {
    Triangles testTriangles = new Triangles (2,3,4);
    assertEquals("Scalene", testTriangles.triangleType());
  }

  @Test
  public void triangleType_isReturnedCorrectType_NotATriangle() {
    Triangles testTriangles = new Triangles (1,5,20);
    assertEquals("That's not a triangle! Try again.", testTriangles.triangleType());
  }
}
