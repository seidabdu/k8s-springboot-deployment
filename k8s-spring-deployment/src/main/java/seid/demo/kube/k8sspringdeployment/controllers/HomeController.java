package seid.demo.kube.k8sspringdeployment.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	public static String header = "\n\n=============================\n\n";
	public static String footer = "\n\n=============================\n\n";

	String blueMessage = "\n\nThis is blue deployment with version V1 representing the exsting app running in Prod.\n\n";

	String greenMessage = "\n\nThis is Green deployment with version V2 representing the new version rolling out.\n\n";

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

		return header + greenMessage + username + password + footer;
	}

	@GetMapping("/home/k8s")
	public String welcome() {
		return header + greenMessage + value + externalConfig + environmentVariable + footer;

	}

}
