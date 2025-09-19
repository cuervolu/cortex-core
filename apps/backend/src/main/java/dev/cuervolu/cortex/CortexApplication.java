package dev.cuervolu.cortex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class CortexApplication {

	public static void main(String[] args) {
		SpringApplication.run(CortexApplication.class, args);
	}

}
