package com.ayi.rest.serv.app.Integrador;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.apache.catalina.User;

import java.lang.reflect.Array;

public class twilio {

    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = ("ACfcf196f9781b26183f56c87787187d7e");
    public static final String AUTH_TOKEN = ("95363f7f2904940a22e41ee3099c9496");

    public static final String UserName = ("Rodrigo");
    static String[] numbers = {"5492634400151"};
    public static void main(String[] args) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        for (String i: numbers) {

            Message message = Message.creator(
                            new com.twilio.type.PhoneNumber("whatsapp:+" + i ),
                            new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                            ("Hola, soy " + UserName + "." + " Estoy en panico, mi ubicacion es (A agregar con pwa) .")
                    )
                    .create();
        }
    }
}