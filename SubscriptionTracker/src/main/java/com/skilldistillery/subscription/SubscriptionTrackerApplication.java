package com.skilldistillery.subscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SubscriptionTrackerApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SubscriptionTrackerApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SubscriptionTrackerApplication.class, args);
	}

}
