package pavan.leet.code.solutions.arrays;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class LeftRotationTest {

    @Test
    void testLeftRotation() {
        checkReturnData(new int[]{5, 1, 2, 3, 4}, LeftRotation.rotLeft(new int[]{1, 2, 3, 4, 5}, 4));
        checkReturnData(new int[]{3, 4, 5, 1, 2}, LeftRotation.rotLeft(new int[]{1, 2, 3, 4, 5}, 2));
    }

    private void checkReturnData(int[] expected, int[] actual) {
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}