package shapes.quadrangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(3, 4);
    }

    @Test
    public void testToString() {
        String toString = "прямоугольник\nпервая сторона: 3.0\nвторая сторона: 4.0\n" +
                "периметр: 14.0\nплощадь: 12.0";
        assertEquals(toString, rectangle.toString());
    }

    @Test
    public void getPerimeter() {
        assertEquals(14.0, rectangle.getPerimeter(), 0);
    }

    @Test
    public void getSquare() {
        assertEquals(12.0, rectangle.getSquare(), 0);
    }
}