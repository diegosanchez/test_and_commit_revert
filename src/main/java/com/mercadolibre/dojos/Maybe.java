package com.mercadolibre.dojos;

public class Maybe {
    private final BillingInfoLoader value;

    public Maybe(BillingInfoLoader value) {
        this.value = value;

    }

    public BillingInfoLoader valueOrDefault(BillingInfoLoader defaultValue) {
        if ( this.value == null) {
            return defaultValue;
        }

        return this.value;
    }
}
