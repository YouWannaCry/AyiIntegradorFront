package com.ayi.rest.serv.app.Integrador;

import com.ayi.rest.serv.app.Integrador.entity.Persona;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

@EnableWebMvc
@EntityScan(basePackages = { "com.ayi.rest.serv.app.Integrador.entity"})
@EnableJpaRepositories( basePackages = {"com.ayi.rest.serv.app.Integrador.repository"})
@SpringBootApplication
public class IntegradorApplication {
	public class twilioServices {


	}
	public static void main(String[] args) {
		SpringApplication.run(IntegradorApplication.class, args);

		// Find your Account SID and Auth Token at twilioServices.com/console
		// and set the environment variables. See http://twil.io/secure

		final String UserName = ("Rodrigo Egea");

		Persona persona = new Persona();

		final String Url = ("https://www.google.com/maps/search/?api=1&query=" + persona.latitude + "%2c" + persona.longitude);

		final String phoneNumber = ("5492634400151");

		List<String> numbers = new ArrayList<>();

		numbers.add("5492634400151");

		Twilio.init("", "");

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

