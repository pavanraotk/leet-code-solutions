package pavan.leet.code.solutions.warmup;

class JumpingClouds {

    static int jumpingOnClouds(int[] c) {
        int numberOfJumps = 0;

        for (int i = 0; i < c.length - 1; ) {

            if (i + 2 < c.length && c[i + 2] == 0) {
                numberOfJumps++;
                i = i + 2;
            } else if (c[i + 1] == 0) {
                numberOfJumps++;
                i++;
            }
        }

        return numberOfJumps;
    }
}
