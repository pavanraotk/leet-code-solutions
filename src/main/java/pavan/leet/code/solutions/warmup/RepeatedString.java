package pavan.leet.code.solutions.warmup;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        if (s.matches("^[a]*$")) {
            return n;
        } else if (s.length() == 1) {
            return 0L;
        }
        return generateString(s, n);
    }

    private static Long generateString(String s, long n) {
        if (n < s.length()) {
            s = getSubstring(s, (int) n);
        }
        long count = getCount(s);
        long numberToMultiply = n / s.length();
        long numberOfCharactersToAdd = n % s.length();

        if (numberToMultiply > 0) {
            count = count * numberToMultiply;
        }

        if (numberOfCharactersToAdd > 0) {
            s = getSubstring(s, (int) numberOfCharactersToAdd);
            count = count + getCount(s);
        }
        return count;
    }

    private static long getCount(String s) {
        return s.chars().filter(ch -> ch == 'a').count();
    }

    private static String getSubstring(String s, int n) {
        return s.substring(0, n);
    }
}
