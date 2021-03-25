package seid.demo.kube.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home/k8s")
	public String welcome() {
		return "welcome to the first k8s springboot project";
	}

}
