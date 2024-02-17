package com.stream.streamline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.stream")
public class StreamlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamlineApplication.class, args);
	}

}
