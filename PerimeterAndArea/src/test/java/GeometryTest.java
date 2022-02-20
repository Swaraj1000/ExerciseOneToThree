import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class GeometryTest {

    @org.junit.Test
    public void area() {
        Geometry geometry = new Geometry();
        assertEquals(25.0,geometry.Area(5),0);
    }

    @org.junit.Test
    public void testArea() {
        Geometry geometry = new Geometry();
        assertEquals(42.0,geometry.Area(6,7),0);
    }

    @org.junit.Test
    public void testArea1() {
        Geometry geometry = new Geometry();
        assertEquals(153.86,geometry.Area(7.0),0);
    }

    @org.junit.Test
    public void perimeter() {
        Geometry geometry = new Geometry();
        assertEquals(20,geometry.Perimeter(5),0);
    }

    @org.junit.Test
    public void testPerimeter() {
        Geometry geometry = new Geometry();
        assertEquals(26.0,geometry.Perimeter(6,7),0);
    }

    @org.junit.Test
    public void testPerimeter1() {
        Geometry geometry = new Geometry();
        assertEquals(43.96,geometry.Perimeter(7.0),0);
    }
}