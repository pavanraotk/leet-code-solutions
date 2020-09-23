package pavan.leet.code.solutions.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class JumpingCloudsTest {

    @Test
    void testJumpingClouds() {
        assertEquals(3, JumpingClouds.jumpingOnClouds(new int[] {0, 1, 0, 0, 0, 1, 0}));
        assertEquals(4, JumpingClouds.jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 1, 0}));
        assertEquals(3, JumpingClouds.jumpingOnClouds(new int[] {0, 0, 0, 1, 0, 0}));
    }

}