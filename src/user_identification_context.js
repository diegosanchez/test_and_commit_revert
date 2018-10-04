
class UserIdentificationContext {

    constructor(siteId, selectedCard, user, febrabanFullPreload) {

        this.siteId = siteId;
        this.device = '';

        this.totalAmount = 0;

        this.selectedCard = selectedCard;
        this.user = user;

        this.febrabanFullPreload = febrabanFullPreload;
    }
}

module.exports = UserIdentificationContext;