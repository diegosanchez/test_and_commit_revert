const expect = require('chai').expect;

const BillingInfo = require('../src/billing_info');
const Card = require('../src/card');
const UserIdentificationContext = require('../src/user_identification_context');
const UserIdentificationLoader = require('../src/user_identification_loader');

describe("billing info tests", () => {

    it('should given an user with card should preload bi with card data', () => {

        const card = new Card("DNI", "34842320");
        const userIdentificationContext = new UserIdentificationContext("MLA", card, null, false);

        const userIdentificationLoader = new UserIdentificationLoader();
        const billingInfo = userIdentificationLoader.preloadUserIdentificationData(userIdentificationContext);
        const expectedBillingInfo = new BillingInfo("DNI", "34842320");

        expect(expectedBillingInfo).to.deep.equal(billingInfo);
    });
});