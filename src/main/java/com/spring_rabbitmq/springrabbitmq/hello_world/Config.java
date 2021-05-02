package com.spring_rabbitmq.springrabbitmq.hello_world;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Queue queue () {
        return new Queue("test_queue");
    }

    @Bean
    public TestReceiver receiver () {
        return new TestReceiver();
    }

    @Bean
    public TestSender sender () {
        return new TestSender();
    }
}
