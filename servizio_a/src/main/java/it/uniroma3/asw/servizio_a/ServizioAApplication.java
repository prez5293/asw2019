package it.uniroma3.asw.servizio_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("it.uniroma3.asw.servizio_a.feign")
public class ServizioAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServizioAApplication.class, args);
	}

}
