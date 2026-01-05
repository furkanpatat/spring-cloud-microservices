package com.furkanpatat.microservices.currency_exchange_service;

import org.h2.server.web.JakartaWebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}
    @Bean
    public ServletRegistrationBean<JakartaWebServlet> h2ConsoleServletRegistration() {
        ServletRegistrationBean<JakartaWebServlet> bean =
                new ServletRegistrationBean<>(new JakartaWebServlet());
        bean.addUrlMappings("/h2-console/*");
        return bean;
    }


}
