package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {


    @Test
    public void singleCharShift2() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher("a", 2);
        Assertions.assertEquals("c", result);
    }

    @Test
    public void wrapAroundSingleCharShift2() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher("z", 2);
        Assertions.assertEquals("b", result);
    }

    @Test
    public void multipleCharShift4() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher("cdef", 4);
        Assertions.assertEquals("ghij", result);
    }

    @Test
    public void multipleCharShift4SomeWrapAround() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher("wxyz", 3);
        Assertions.assertEquals("zabc", result);
    }

    @Test
    public void singleCharShift29() {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher("a", 29);
        Assertions.assertEquals("d", result);
    }
}
