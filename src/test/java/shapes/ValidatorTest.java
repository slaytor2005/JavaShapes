package shapes;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorTest {

    @Test
    public void validateTriangle() {
        assertTrue(Validator.validateTriangle(3, 4, 5));
        assertFalse(Validator.validateTriangle(0, 4, 5));
        assertFalse(Validator.validateTriangle(3, 0, 5));
        assertFalse(Validator.validateTriangle(3, 4, 0));
        assertFalse(Validator.validateTriangle(-1, 4, 5));
        assertFalse(Validator.validateTriangle(3, -1, 5));
        assertFalse(Validator.validateTriangle(3, 4, -1));
        assertFalse(Validator.validateTriangle(1, 2, 3));
        assertFalse(Validator.validateTriangle(1, 3, 2));
        assertFalse(Validator.validateTriangle(3, 1, 2));
        assertFalse(Validator.validateTriangle(1, 2, 4));
        assertFalse(Validator.validateTriangle(1, 4, 2));
        assertFalse(Validator.validateTriangle(4, 1, 2));
    }

    @Test
    public void validateQuadrangle() {
        assertTrue(Validator.validateQuadrangle(1, 2, 3, 5));
        assertFalse(Validator.validateQuadrangle(1, 2, 3, 6));
        assertFalse(Validator.validateQuadrangle(1, 2, 3, 7));
        assertFalse(Validator.validateQuadrangle(0, 2, 3, 5));
        assertFalse(Validator.validateQuadrangle(1, 0, 3, 5));
        assertFalse(Validator.validateQuadrangle(1, 2, 0, 5));
        assertFalse(Validator.validateQuadrangle(1, 2, 3, 0));
        assertFalse(Validator.validateQuadrangle(-1, 2, 3, 5));
        assertFalse(Validator.validateQuadrangle(1, -2, 3, 5));
        assertFalse(Validator.validateQuadrangle(1, 2, -3, 5));
        assertFalse(Validator.validateQuadrangle(1, 2, 3, -5));
    }
}