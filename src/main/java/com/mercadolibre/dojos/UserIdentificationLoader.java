package com.mercadolibre.dojos;

class UserIdentificationLoader {

    /*
    Este método se encarga de encapsular la lógica de precarga de datos para el paso de user identification.
    Los datos serán cargados desde distintas fuentes, acorde al siguiente orden:
    1 - Tarjeta seleccionada en el flow (puede ser tarjeta nueva o precargada)
    2 - Datos del user (UserBO)
    3 - No precargamos datos
    */
    public BillingInfoBO preloadUserIdentificationData(UserIdentificationContext userIdentificationContext){
        return userIdentificationContext.billingInfo();
    }

}