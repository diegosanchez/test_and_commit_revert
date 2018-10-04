class User {

    constructor() {

        this.firstName = '';
        this.lastName = '';

        this.docType = '';
        this.docNumber = '';
        this.siteId = '';
        this.userType = '';
    }

    hasValidDocType() {

        return this.docType !== null && this.docType !== "otro";
    }
}

module.exports = User;