package com.spring_rabbitmq.springrabbitmq;

import com.spring_rabbitmq.springrabbitmq.hello_world.TestSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitmqApplication.class, args);
	}

	@Bean
	public TestSender testSender () {
		return new TestSender();
	}
}
