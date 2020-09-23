package pavan.leet.code.solutions.arrays;

class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

        int[] rotated = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            rotated[i] = a[(i + d) % a.length];
        }

        return rotated;
    }
}
