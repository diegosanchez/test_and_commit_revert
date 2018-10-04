package com.mercadolibre.dojos;

public class NoUser implements BillingInfoLoader {
    @Override
    public void loadBillingInfo(BillingInfoBO info, boolean febraban) {

    }

    @Override
    public boolean hasValidDocType() {
        return false;
    }
}
