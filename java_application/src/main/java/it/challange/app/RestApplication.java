package it.challange.app;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("it.challange.*")
@EnableJpaRepositories("it.challange.repositories")
@EntityScan("it.challange.models")
public class RestApplication {

	private static final Logger log = Logger.getLogger("RestApplication.class");
	
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
