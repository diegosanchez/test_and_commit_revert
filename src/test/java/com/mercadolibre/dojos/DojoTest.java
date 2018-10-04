package com.mercadolibre.dojos;

import org.junit.Assert;
import org.junit.Test;

public class DojoTest {

    @Test
    public void given_an_user_with_card_should_preload_bi_with_card_data() {

        CardBO cardBo = new CardBO("DNI", "34842320");
        UserIdentificationContext userIdentificationContext = new UserIdentificationContext(
                "MLA", cardBo,
                null,
                false
        );

        UserIdentificationLoader userIdentificationLoader = new UserIdentificationLoader();
        BillingInfoBO billingInfo = userIdentificationLoader.preloadUserIdentificationData( userIdentificationContext );
        BillingInfoBO expectedBillingInfo = new BillingInfoBO("DNI", "34842320");

        Assert.assertEquals(expectedBillingInfo,billingInfo);
    }

    @Test
    public void given_an_user_without_card_and_user_information_should_preload_bi_with_user_info() {

        UserIdentificationContext userIdentificationContext = new UserIdentificationContext(
                "MLA", null,
                new UserBO("DNI", "1234567"),
                false
        );

        UserIdentificationLoader userIdentificationLoader = new UserIdentificationLoader();
        BillingInfoBO billingInfo = userIdentificationLoader.preloadUserIdentificationData( userIdentificationContext );
        BillingInfoBO expectedBillingInfo = new BillingInfoBO("DNI", "1234567", null, null, "Natural");

        Assert.assertEquals(expectedBillingInfo,billingInfo);
    }

    @Test
    public void given_an_user_without_card_but_user_information_for_febraban_should_preload_bi_with_user_info() {

        UserIdentificationContext userIdentificationContext = new UserIdentificationContext(
                "MLA", null,
                new UserBO("DNI", "1234567"),
                true
        );

        UserIdentificationLoader userIdentificationLoader = new UserIdentificationLoader();
        BillingInfoBO billingInfo = userIdentificationLoader.preloadUserIdentificationData( userIdentificationContext );
        BillingInfoBO expectedBillingInfo = new BillingInfoBO("DNI", "1234567", null, null, "Natural");

        Assert.assertEquals(expectedBillingInfo,billingInfo);
    }

    @Test
    public void given_an_user_mlu_with_ci_then_bi_ci_and_doc_type() {

        UserIdentificationContext userIdentificationContext = new UserIdentificationContext(
                "MLA", null,
                new UserBO("CI", "11111"),
                true
        );

        UserIdentificationLoader userIdentificationLoader = new UserIdentificationLoader();
        BillingInfoBO billingInfo = userIdentificationLoader.preloadUserIdentificationData( userIdentificationContext );
        BillingInfoBO expectedBillingInfo = new BillingInfoBO("CI", "11111", null, null, "Natural");

        Assert.assertEquals(expectedBillingInfo,billingInfo);
    }

    @Test
    public void given_an_user_mlu_with_rut_then_bi_ci_and_empty_doc_type() {

        UserIdentificationContext userIdentificationContext = new UserIdentificationContext(
                "MLA", null,
                new UserBO("RUT", "222222"),
                true
        );

        UserIdentificationLoader userIdentificationLoader = new UserIdentificationLoader();
        BillingInfoBO billingInfo = userIdentificationLoader.preloadUserIdentificationData( userIdentificationContext );
        BillingInfoBO expectedBillingInfo = new BillingInfoBO("CI", "", null, null, "Natural");

        Assert.assertEquals(expectedBillingInfo,billingInfo);
    }

}
