package it.uniroma3.asw.servizio_c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServizioCApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServizioCApplication.class, args);
	}

}
