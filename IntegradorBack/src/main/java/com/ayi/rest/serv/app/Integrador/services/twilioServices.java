package com.ayi.rest.serv.app.Integrador.services;

import com.ayi.rest.serv.app.Integrador.entity.Persona;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class twilioServices {

    // Find your Account SID and Auth Token at twilioServices.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = ("ACfcf196f9781b26183f56c87787187d7e");
    public static final String AUTH_TOKEN = ("1bf29d6a1bc1a2fea2e6f83bdd3b486d");

    public static final String UserName = ("Rodrigo Egea");

    private static Persona persona;
    public static final String Url = ("https://www.google.com/maps/search/?api=1&query=" + persona.latitude + "%2c" + persona.longitude);

    public static final String phoneNumber = ("5492634400151");
    static String[] numbers = {"5492634400151"};
        public static void main(String[] args) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        for (String i: numbers) {

            Message message = Message.creator(
                            new com.twilio.type.PhoneNumber("whatsapp:+" + i ),
                            new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                            ("Hola, soy " + UserName + " ( " +phoneNumber +" )." + " Estoy en panico, mi ubicacion es ." + Url)
                    )
                    .create();
        }
    }
}