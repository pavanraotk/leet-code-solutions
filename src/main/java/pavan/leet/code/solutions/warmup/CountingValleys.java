package pavan.leet.code.solutions.warmup;

class CountingValleys {

    static int countingValleys(int n, String s) {

        int valleyCount = 0;
        int currentLevel = 0;
        boolean insideValley = false;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'D': {
                    currentLevel--;
                    if (!insideValley && currentLevel < 0) {
                        valleyCount++;
                        insideValley = true;
                    }
                    break;
                }
                case 'U': {
                    currentLevel++;
                    if (insideValley && currentLevel >= 0) {
                        insideValley = false;
                    }
                    break;
                }
            }
        }

        return valleyCount;
    }
}
