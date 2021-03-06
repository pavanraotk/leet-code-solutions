package pavan.leet.code.solutions.warmup;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SockMerchantTest {

    @Test
    void testSockMerchant() {
        assertEquals(2, SockMerchant.sockMerchant(7, new int[]{1,2,1,2,1,3,2}));
        assertEquals(3, SockMerchant.sockMerchant(9, new int[]{10,20,20,10,10,30,50,10,20}));
    }

}