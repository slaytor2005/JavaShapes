package shapes.quadrangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RhombusTest {

    Rhombus rhombus;

    @Before
    public void setUp() throws Exception {
        rhombus = new Rhombus(3, 4, 2);
    }

    @Test
    public void testToString() {
        String toString = "ромб\nсторона: 3.0\nпервая диагональ: 4.0\nвторая диагональ: 2.0\n" +
                "периметр: 12.0\nплощадь: 4.0";
        assertEquals(toString, rhombus.toString());
    }

    @Test
    public void getPerimeter() {
        assertEquals(12.0, rhombus.getPerimeter(), 0);
    }

    @Test
    public void getSquare() {
        assertEquals(4.0, rhombus.getSquare(), 0);
    }
}