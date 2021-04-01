package seid.demo.kube.k8sspringdeployment.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${hello.greeting:wellcome seid abdu}")
	String value;

	@Value("${app.config}")
	String externalConfig;
	
	@Value("${app.environmentVariable}")
	String environmentVariable;

	@Value("${user.name}")
	String username;

	@Value("${user.password}")
	String password;

	@GetMapping("/cred")
	public String getCredentials() {
		String  blue="\n======================\n this is the second blue green deployment process V2 of the project is being deployed here\n =================================\n=============================\n";
		
		
		return username + password + blue;
	}

	@GetMapping("/home/k8s")
	public String welcome() {
		String  blue="\n======================\n this is the second blue green deployment process V2 of the project is being deployed here\n =================================\n=============================\n";
		return  value + externalConfig + environmentVariable + blue;

	}

}
