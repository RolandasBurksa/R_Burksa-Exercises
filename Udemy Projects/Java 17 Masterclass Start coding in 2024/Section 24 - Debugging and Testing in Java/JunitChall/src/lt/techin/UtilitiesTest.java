package lt.techin;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static junit.framework.TestCase.*;

public class UtilitiesTest {

    private Utilities util;

    @org.junit.Before
    public void setup() {
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
//        Utilities util = new Utilities();
        char[] output = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, output);
        char[] output2 = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output2);


    }

    @org.junit.Test
    public void removePairs() {
//        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
//        assertNull(util.removePairs(null), "The very important message...");
//        assertNull(util.removePairs(null), "The very important message...");
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));

    }

    @org.junit.Test
    public void converter() {
//        Utilities util = new Utilities();
//        assertEquals(300, util.converter(10, 5));
        }

    @org.junit.Test(expected=ArithmeticException.class)
    public void converter_arithmeticException() throws Exception {
        Utilities util = new Utilities();
        util.converter(10, 0);

    }

    @org.junit.Test
    public void nullOddLength() throws Exception {
//        Utilities util = new Utilities();
//        assertNull(util.nullOddLength("odd"));
//        assertNotNull(util.nullOddLength("even"));
    }
}