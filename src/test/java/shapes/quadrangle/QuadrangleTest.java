package shapes.quadrangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadrangleTest {
    Quadrangle quadrangle;

    @Before
    public void setUp() throws Exception {
        quadrangle = new Quadrangle(2, 3, 4, 5);
    }

    @Test
    public void getPerimeter() {
        assertEquals(14.0, quadrangle.getPerimeter(), 0); /* 0-точность */
    }

    @Test
    public void toStringTest() {
        String toString = "четырехугольник\nпервая сторона: 2.0\nвторая сторона: 3.0\nтретья сторона: 4.0\n" +
                "четвертая сторона: 5.0\nпериметр: 14.0";
        assertEquals(toString, quadrangle.toString());
    }
}