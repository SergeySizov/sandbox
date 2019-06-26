package ua.java_hw.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
    @Test

    public void testArea(){
        Square s = new Square(5);
        Assert.assertEquals( s.area(), 25.0);

    }
 /* @Test
  public void testDistance(){
    Point firstPoint = new Point(3, 2);
    Point secondPoint = new Point(7, 8);
  Assert.assertEquals(Point.distance(firstPoint, secondPoint), 7.211102550927978);
  }*/

    @Test
    public void testArea2() {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(7,8);
        Assert.assertEquals(p1.distance2(p2), 7.211102550927978);
    }
}
