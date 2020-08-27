package pavan.leet.code.solutions.warmup;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatedStringTest {

    @Test
    public void testRepeatedString() {
        assertEquals(2, RepeatedString.repeatedString("ababa", 3));
        assertEquals(4, RepeatedString.repeatedString("abcac", 10));
        assertEquals(7, RepeatedString.repeatedString("aba", 10));
        assertEquals(1000000000000L, RepeatedString.repeatedString("a", 1000000000000L));
        assertEquals(78677789272L, RepeatedString.repeatedString("ebcdddafdfeffaddbceddebafbbebebbbcefcbcdfbaabecfaaeeaaffdfccffbdeeaabcfeecfcecbfebacefebdfaeedadebdf", 561984209086L));

    }

}