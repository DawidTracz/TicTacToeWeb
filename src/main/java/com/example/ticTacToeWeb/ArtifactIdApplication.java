package com.example.ticTacToeWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;

@SpringBootApplication
public class ArtifactIdApplication {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ArtifactIdApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("Test.file"));
		springApplication.run(args);
	}
}
