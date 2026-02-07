import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LeftPadUtilsTest {

    @Test
    @Tag("Structural")
    void strNull(){
        String result = LeftPadUtils.leftPad(null, 5, "*");
        assertNull(result);
    }

    @Test
    @Tag("Structural")
    void isEmptyNull(){
        assertEquals("cat", LeftPadUtils.leftPad("cat", 3, null));
    }

    @Test
    @Tag("Structural")
    void isEmptyNotNull(){
        assertEquals("cat", LeftPadUtils.leftPad("cat", 3, "cat"));
    }

    @Test
    @Tag("specification")
    void padsGreaterThanZero(){
        String result = LeftPadUtils.leftPad("four", 6, "ab");
        assertEquals("abfour", result);
    }

    @Test
    @Tag("specification")
    void padsLessThanLen(){
        String result = LeftPadUtils.leftPad("four", 6, "eight");
        assertEquals("eifour", result);
    }

    @Test
    @Tag("specification")
    void padStrLoops(){
        String result = LeftPadUtils.leftPad("two", 9, "four");
        assertEquals("fourfotwo", result);
    }
}