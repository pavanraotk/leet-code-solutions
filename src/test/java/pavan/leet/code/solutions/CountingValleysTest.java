package pavan.leet.code.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CountingValleysTest {

    @Test
    public void testCountingValleys() {
        assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
        assertEquals(1, CountingValleys.countingValleys(8, "DDUUUUDD"));
    }


}