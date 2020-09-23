package com.monster;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@SpringBootApplication(scanBasePackages = { "com.monster.backend"})
@ComponentScan({ "com.monster" })
@EntityScan("com.monster.persistence.entity")
@EnableJpaRepositories("com.monster.repository")
public class Application extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("APPLICATION IS STARTING!!!");
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		logger.info("APPLICATION STARTED!!!");
	}

	public static void printProperties(Properties prop) {
		for (Object key : prop.keySet()) {
			logger.trace("PROPERTY: " + key + ": " + prop.getProperty(key.toString()));
		}
	}

}
