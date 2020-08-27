package pavan.leet.code.solutions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoCitySchedulingTest {

    @Test
    public void givenTestCase() {
        TwoCityScheduling twoCityScheduling = new TwoCityScheduling();
        int[][] costs = new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        assertThat(twoCityScheduling.twoCitySchedCost(costs)).isEqualTo(110);
    }

    @Test
    public void duplicateTests() {
        TwoCityScheduling twoCityScheduling = new TwoCityScheduling();
        int[][] costs = new int[][]{{10,20},{10,20},{10,20},{10,20}};
        assertThat(60).isEqualTo(twoCityScheduling.twoCitySchedCost(costs));
    }

    @Test
    public void finalTest() {
        TwoCityScheduling twoCityScheduling = new TwoCityScheduling();
        int[][] costs = new int[][]{{10,5},{20,30},{1,3},{4,40}};
        assertThat(66).isEqualTo(twoCityScheduling.twoCitySchedCost(costs));
    }

}