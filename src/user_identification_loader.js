
const BillingInfo = require('./billing_info');

class UserIdentificationLoader {

    preloadUserIdentificationData(userIdentificationContext) {

        let billingInfo = new BillingInfo();
        const selectedCard = userIdentificationContext.selectedCard;
        const user = userIdentificationContext.user;

        if (selectedCard !== null){
            billingInfo.docNumber = selectedCard.docNumber;
            billingInfo.docType = selectedCard.docType;

        } else if(user.hasValidDocType()){
            billingInfo.docNumber = user.docNumber;
            billingInfo.docType = userIdentificationContext.user.docType;

            billingInfo.entityType = userIdentificationContext.user.docType === "NIT" ?
                "Jurídica" : "Natural";

            if (userIdentificationContext.febrabanFullPreload){
                billingInfo.firstName = user.firstName;
                billingInfo.lastName = user.lastName;
            }
        }

        return billingInfo;
    }
}

module.exports = UserIdentificationLoader;