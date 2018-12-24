package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void numberWithManyIs() {
        int result = roman.convert("LXVIII");
        Assertions.assertEquals(68, result);
    }

    @Test
    public void numberJustLessThan2000() {
        int result = roman.convert("IMM");
        Assertions.assertEquals(1999, result);
    }

    @Test
    public void mixedCase() {
        int result = roman.convert("mCmIx");
        Assertions.assertEquals(1909, result);
    }
}
