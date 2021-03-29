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
		
		return username + password;
	}

	@GetMapping("/home/k8s")
	public String welcome() {
		return value + externalConfig + environmentVariable;
	}

}
