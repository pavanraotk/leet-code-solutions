package pavan.leet.code.solutions.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CountingValleysTest {

    @Test
    void testCountingValleys() {
        assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
        assertEquals(1, CountingValleys.countingValleys(8, "DDUUUUDD"));
    }


}