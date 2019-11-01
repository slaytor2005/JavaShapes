package shapes.quadrangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrapezoidTest {

    Trapezoid trapezoid;

    @Before
    public void setUp() throws Exception {
        trapezoid = new Trapezoid(2, 3, 4, 5, 6);
    }

    @Test
    public void getPerimeter() {
        assertEquals(14.0, trapezoid.getPerimeter(), 0);
    }

    @Test
    public void getSquare() {
        assertEquals(24, trapezoid.getSquare(), 0);
    }

    @Test
    public void testToString() {
        String toString = "трапеция\nпервая сторона: 2.0\nвторая сторона: 3.0\nтретья сторона: 4.0\n" +
                "четвертая сторона: 5.0\nвысота: 6.0\nпериметр: 14.0\nплощадь: 24.0";
        assertEquals(toString, trapezoid.toString());
    }
}