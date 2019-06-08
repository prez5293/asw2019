package it.uniroma3.asw.servizio_a.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="servizioc", configuration = FeignClientConfiguration.class)
@RibbonClient(name="servizioc")
public interface AnimalClient {

	@GetMapping("/servizio-c")
	public String findAllAnimals();
	
	@PostMapping("/servizio-c")
	public String saveAnimal(@RequestBody String string);
	
}
