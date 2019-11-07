package shapes.quadrangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsoscelesTrapezoidTest {

    IsoscelesTrapezoid isoscelesTrapezoid;

    @Before
    public void setUp() {
        isoscelesTrapezoid = new IsoscelesTrapezoid(3, 4, 2, 5);
    }

    @Test
    public void testToString() {
        String toString = "равнобокая трапеция\nсторона: 2.0\nпервое основание: 3.0\nвторое основание: 4.0\n" +
                "высота: 5.0\nпериметр: 11.0\nплощадь: 17.5";
        assertEquals(toString, isoscelesTrapezoid.toString());
    }

    @Test
    public void getPerimeter() {
        assertEquals(11.0, isoscelesTrapezoid.getPerimeter(), 0);
    }

    @Test
    public void getSquare() {
        assertEquals(17.5, isoscelesTrapezoid.getSquare(), 0);
    }
}