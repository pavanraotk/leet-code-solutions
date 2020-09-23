package pavan.leet.code.solutions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class NewYearChaosTest {

    @Test
    void testMinimumBribes() {
        assertEquals(3, NewYearChaos.minimumBribes(new int[]{2, 1, 5, 3, 4}));
        assertEquals(-1, NewYearChaos.minimumBribes(new int[]{2, 5, 1, 3, 4}));
        assertEquals(7, NewYearChaos.minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4}));
    }

}