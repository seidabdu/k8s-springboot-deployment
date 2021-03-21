package seid.demo.kube.k8sspringdeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("seid.demo.kube.k8sspringdeployment")
@SpringBootApplication
public class K8sSpringDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sSpringDeploymentApplication.class, args);
	}

}
