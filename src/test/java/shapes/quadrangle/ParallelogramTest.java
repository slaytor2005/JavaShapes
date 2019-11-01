package shapes.quadrangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParallelogramTest {

    Parallelogram parallelogram;

    @Before
    public void setUp() throws Exception {
        parallelogram = new Parallelogram(4, 5, 3);
    }

    @Test
    public void testToString() {
        String toString = "параллелограмм\nбоковая сторона: 4.0\nоснование: 5.0\nвысота: 3.0\n" +
                "периметр: 18.0\nплощадь: 15.0";
        assertEquals(toString, parallelogram.toString());
    }

    @Test
    public void getPerimeter() {
        assertEquals(18.0, parallelogram.getPerimeter(), 0);
    }

    @Test
    public void getSquare() {
        assertEquals(15.0, parallelogram.getSquare(), 0);
    }
}