package pavan.leet.code.solutions.arrays;

class NewYearChaos {

    static int minimumBribes(int[] q) {

        int bribeCount = 0;

        for (int i = 0; i < q.length; i++) {
            if (q[i] > i + 1) {
                if (q[i] - (i + 1) > 2) {
                    return -1;
                }

                bribeCount = bribeCount + (q[i] - (i + 1));
            } else {
                for (int j = i + 1; j < q.length; j++) {
                    if(q[i] > q[j]) {
                        bribeCount++;
                        break;
                    }
                }
            }
        }

        return bribeCount;


    }


}
