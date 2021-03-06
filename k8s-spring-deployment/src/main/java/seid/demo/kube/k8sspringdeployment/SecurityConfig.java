package seid.demo.kube.k8sspringdeployment;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
	    http.csrf().disable().authorizeRequests()
	      .anyRequest().permitAll();
	      http.headers().frameOptions().sameOrigin();
	}


}