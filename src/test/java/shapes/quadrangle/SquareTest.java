package shapes.quadrangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    Square square;

    @Before
    public void setUp() throws Exception {
        square = new Square(5);
    }

    @Test
    public void testToString() {
        String toString = "квадрат\nсторона: 5.0\nпериметр: 20.0\nплощадь: 25.0";
        assertEquals(toString, square.toString());
    }

    @Test
    public void getPerimeter() {
        assertEquals(20.0, square.getPerimeter(), 0);
    }

    @Test
    public void getSquare() {
        assertEquals(25.0, square.getSquare(), 0);
    }
}