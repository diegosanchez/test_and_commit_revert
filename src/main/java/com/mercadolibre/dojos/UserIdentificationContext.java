package com.mercadolibre.dojos;

class UserIdentificationContext {

    String siteId;
    CardBO selectedCard;
    UserBO user;
    boolean febrabanFullPreload;

    public UserIdentificationContext(String siteId, CardBO selectedCard, UserBO user, boolean febrabanFullPreload) {
        this.siteId = siteId;
        this.selectedCard = selectedCard;
        this.user = user;
        this.febrabanFullPreload = febrabanFullPreload;
    }

    public BillingInfoBO billingInfo() {
        BillingInfoBO result = new BillingInfoBO();
        BillingInfoLoader card  = new Maybe(this.selectedCard).valueOrDefault(new NoCard());
        BillingInfoLoader user = new Maybe(this.user).valueOrDefault(new NoUser());;

        if (card instanceof CardBO) {
            card.loadBillingInfo(result, false);

        } else if(user.hasValidDocType()){
            user.loadBillingInfo(result, this.febrabanFullPreload);
        }

        return result;

    }
}