package org.smark.opensource.isb.validation;

import javax.validation.Validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class IntroSpringBootValidationApplication {
	
	@Bean
	Validator validator(){
		return new LocalValidatorFactoryBean();
	}

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringBootValidationApplication.class, args);
	}
}
