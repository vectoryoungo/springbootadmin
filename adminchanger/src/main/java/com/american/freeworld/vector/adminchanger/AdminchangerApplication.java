package com.american.freeworld.vector.adminchanger;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminchangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminchangerApplication.class, args);
	}

}
