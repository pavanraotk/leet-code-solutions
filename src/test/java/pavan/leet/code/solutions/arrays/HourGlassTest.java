package pavan.leet.code.solutions.arrays;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class HourGlassTest {

    @Test
    void testHourGlass() {
        assertEquals(7, HourGlass.hourglassSum(new int[][] {{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}}));
        assertEquals(28, HourGlass.hourglassSum(new int[][] {{-9, -9, -9, 1, 1, 1}, {0, -9, 0, 4, 3, 2}, {-9, -9, -9, 1, 2, 3}, {0, 0, 8, 6, 6, 0}, {0, 0, 0, -2, 0, 0}, {0, 0, 1, 2, 4, 0}}));
        assertEquals(19, HourGlass.hourglassSum(new int[][] {{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}}));
    }

}