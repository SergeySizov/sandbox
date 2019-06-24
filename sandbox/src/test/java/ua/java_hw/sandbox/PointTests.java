package ua.java_hw.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    //test 8

    @Test
    public void testArea2() {
        //test 3
        Point p1 = new Point(3, 2);
        Point p2 = new Point(7,8);
        Assert.assertEquals(p1.distance2(p2), 7.211102550927978);

    }
}
