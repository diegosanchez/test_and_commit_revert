package com.mercadolibre.dojos;

import java.util.Objects;

class BillingInfoBO {

    String docType;
    String docNumber;
    String firstName;
    String lastName;
    String entityType;

    public BillingInfoBO(String docType, String docNumber, String firstName, String lastName, String entityType) {
        this.docType = docType;
        this.docNumber = docNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.entityType = entityType;
    }

    public BillingInfoBO(String docType, String docNumber) {
        this.docType = docType;
        this.docNumber = docNumber;
    }

    public BillingInfoBO() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BillingInfoBO)) return false;
        BillingInfoBO that = (BillingInfoBO) o;
        return Objects.equals(docType, that.docType) &&
                Objects.equals(docNumber, that.docNumber) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(entityType, that.entityType);
    }

}
