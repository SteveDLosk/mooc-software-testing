package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    GHappy gHappy;


    @Test
    public void emptyString() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("");
        Assertions.assertTrue(result);
    }

    @Test
    public void singleGString() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("g");
        Assertions.assertFalse(result);
    }

    @Test
    public void doubleGString() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("gg");
        Assertions.assertTrue(result);
    }

    @Test
    public void doubleGinMiddleString() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("asklggsakll");
        Assertions.assertTrue(result);
    }

    @Test
    public void doubleGEndingString() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("asklggsakllgg");
        Assertions.assertTrue(result);
    }

    @Test
    public void doubleGBeginningString() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("ggasklggsakll");
        Assertions.assertTrue(result);
    }

    @Test
    public void noGString() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("adkjkdk");
        Assertions.assertTrue(result);
    }

    @Test
    public void singleGonBeginningString() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("gslkslkgglkas");
        Assertions.assertFalse(result);
    }

    @Test
    public void singleGonEndingString() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("slkslkgglkasg");
        Assertions.assertFalse(result);
    }

    
}
