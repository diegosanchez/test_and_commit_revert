package com.mercadolibre.dojos;

class CardBO implements BillingInfoLoader {

    public String docType;
    public String docNumber;

    public CardBO(String docType, String docNumber) {
        this.docType = docType;
        this.docNumber = docNumber;
    }

    @Override
    public void loadBillingInfo(BillingInfoBO info, boolean febraban) {
        info.docNumber = this.docNumber;
        info.docType = this.docType;

    }

    @Override
    public boolean hasValidDocType() {
        return false;
    }
}
