package com.mercadolibre.dojos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillingInfoTest {

    @Test
    public void testBillingInfoBOCreation() {
        BillingInfoBO expected = new BillingInfoBO(
                "DNI",
                "12345678",
                "diego",
                "san",
                "entityType"
        );
        BillingInfoBO actual = new BillingInfoBO(
                "DNI",
                "12345678",
                "diego",
                "san",
                "entityType"
        );

        assertEquals(expected, actual);
    }

}
