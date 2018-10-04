package com.mercadolibre.dojos;

class UserBO implements BillingInfoLoader {

    String firstName;
    String lastName;

    String docType;
    String docNumber;
    String siteId;
    String userType;

    public UserBO(String docType, String docNumber) {

        this.docType = docType;
        this.docNumber = docNumber;
    }


    public boolean hasValidDocType(){

        return this.docType != null && !this.docType.equals("otro");
    }

    @Override
    public void loadBillingInfo(BillingInfoBO info, boolean febrabanFullPreload) {
        info.docNumber = this.docNumber;
        info.docType = this.docType;

        info.entityType = this.docType.equals("NIT") ? "Jurídica" : "Natural";

        if ( this.docType.equals("RUT") ) {
            info.docNumber = "";
            info.docType = "CI";
        }

        if (febrabanFullPreload){
            info.firstName = this.firstName;
            info.lastName = this.lastName;
        }

    }
}