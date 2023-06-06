package com.devback.uc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@EnableJpaRepositories(basePackages={"pl.springBootStarter.app"})
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class UcApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcApplication.class, args);
	}

}
