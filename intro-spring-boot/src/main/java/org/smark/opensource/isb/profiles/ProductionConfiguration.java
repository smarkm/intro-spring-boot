package org.smark.opensource.isb.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("product")
public class ProductionConfiguration {

	@Bean
	public String init() {
		System.err.println("production environment of profile");
		return "product";
	}
}
