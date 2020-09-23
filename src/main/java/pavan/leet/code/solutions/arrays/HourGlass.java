package pavan.leet.code.solutions.arrays;

class HourGlass {

    static int hourglassSum(int[][] arr) {
        Integer sum = null;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                int tempSum = getSum(i, j, arr);
                if (sum == null) {
                    sum = tempSum;
                } else if (tempSum > sum) {
                    sum = tempSum;
                }
            }
        }
        if (sum != null) {
            return sum;
        } else {
            return -1;
        }
    }

    private static int getSum(int i, int j, int[][] arr) {
        return arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
    }
}
