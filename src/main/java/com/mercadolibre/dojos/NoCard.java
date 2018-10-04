package com.mercadolibre.dojos;

public class NoCard implements BillingInfoLoader {
    @Override
    public void loadBillingInfo(BillingInfoBO info, boolean febraban) {

    }

    @Override
    public boolean hasValidDocType() {
        return false;
    }
}
