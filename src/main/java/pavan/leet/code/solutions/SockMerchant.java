package pavan.leet.code.solutions;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> sockCount = new HashMap<>();

        for (int sock : ar) {
            if (sockCount.containsKey(sock)) {
                sockCount.put(sock, sockCount.get(sock) + 1);
            } else {
                sockCount.put(sock, 1);
            }
        }

        int count = 0;

        for (Map.Entry<Integer, Integer> sockCountEntry : sockCount.entrySet()) {
            count = count + sockCountEntry.getValue() / 2;
        }

        return count;

    }
}
