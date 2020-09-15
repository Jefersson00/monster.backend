package com.monster;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.monster"})
@EntityScan("com.monster.persistence.entity")
@EnableJpaRepositories("com.monster.persistence.repository")
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("APPLICATION IS STARTING!!!");
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		logger.info("APPLICATION STARTED!!!");
	}

}
