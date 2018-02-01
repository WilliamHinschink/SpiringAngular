package com.sibentek.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.system.ApplicationPidFileWriter;

@EnableAutoConfiguration
@EntityScan(basePackages = "com.sibentek.bankapp.domain")
@SpringBootApplication(scanBasePackages = "com.sibentek")
public class BankappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args)
				.addApplicationListener(new ApplicationPidFileWriter());
	}
}
