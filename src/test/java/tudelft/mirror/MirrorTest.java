package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    Mirror mirror;

    @BeforeEach
    public void initialize() {
        mirror = new Mirror();
    }

    @Test
    public void oddPalindrome() {
        String string = "abcba";

        String mirrorEnd = mirror.mirrorEnds(string);

        Assertions.assertEquals(mirrorEnd, "abcba");
    }

    @Test
    public void evenPalindrome() {
        String string = "abba";

        String mirrorEnd = mirror.mirrorEnds(string);

        Assertions.assertEquals(mirrorEnd, "abba");
    }



    @Test
    public void singleCharMirror() {
        String string = "absebda";

        String mirrorEnd = mirror.mirrorEnds(string);

        Assertions.assertEquals(mirrorEnd, "a");
    }

    @Test
    public void singleCharMirrorWithMirrorInMiddleAlso() {
        String string = "abseeebda";

        String mirrorEnd = mirror.mirrorEnds(string);

        Assertions.assertEquals(mirrorEnd, "a");
    }
    @Test
    public void twoCharMirror() {
        String string = "abdfcba";

        String mirrorEnd = mirror.mirrorEnds(string);

        Assertions.assertEquals(mirrorEnd, "ab");
    }

    @Test
    public void noMirror() {
        String string = "abcde";

        String mirrorEnd = mirror.mirrorEnds(string);

        Assertions.assertEquals(mirrorEnd, "");
    }

    @Test
    public void emptyString() {
        String string = "";

        String mirrorEnd = mirror.mirrorEnds(string);

        Assertions.assertEquals(mirrorEnd, "");
    }

    @Test
    public void mirroredButNotAtEnd() {
        String string = "abcbazz";

        String mirrorEnd = mirror.mirrorEnds(string);

        Assertions.assertEquals(mirrorEnd, "");
    }











}
