package com.mercadolibre.dojos;

public interface BillingInfoLoader {
    void loadBillingInfo(BillingInfoBO info, boolean febraban);

    boolean hasValidDocType();
}
