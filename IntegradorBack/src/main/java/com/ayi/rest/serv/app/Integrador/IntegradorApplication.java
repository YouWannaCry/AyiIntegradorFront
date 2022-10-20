package com.ayi.rest.serv.app.Integrador;

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

		final String Url = ("");

		final String phoneNumber = ("5492634400151");

		List<String> numbers = new ArrayList<>();

		numbers.add("5492634400151");

		Twilio.init("ACfcf196f9781b26183f56c87787187d7e", "1bf29d6a1bc1a2fea2e6f83bdd3b486d");

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

