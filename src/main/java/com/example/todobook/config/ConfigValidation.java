package com.example.todobook.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;





@Configuration
public class ConfigValidation implements RepositoryRestConfigurer {

//    @Override
//    public void configureValidatingRepositoryEventListener(final ValidatingRepositoryEventListener validatingListener) {
//        validatingListener.addValidator("beforeCreate", validator());
//        validatingListener.addValidator("afterCreate", validator());
//
//    }
    @Bean
    Validator validator() {
        return new LocalValidatorFactoryBean();
    }


}
