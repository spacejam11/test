package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class UsersTestApplication {
	
//	@Autowired
//	private MessageSource messageSource;
	
	public static void main(String[] args) {
		SpringApplication.run(UsersTestApplication.class, args);
	}

//	@Bean
//	public LocalValidatorFactoryBean validator() {
//		//Spring Bootデフォルトのエラーメッセージのプロパティファイルを
//		//ValidationMessages.propertiesからmessages.propertiesに変更する
//		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
//		localValidatorFactoryBean.setValidationMessageSource(messageSource);
//		return localValidatorFactoryBean;
//	}
//
//	public org.springframework.validation.Validator getValidator() {
//		return validator();
//	}

}
