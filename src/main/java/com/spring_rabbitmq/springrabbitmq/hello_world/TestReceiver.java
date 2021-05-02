package com.spring_rabbitmq.springrabbitmq.hello_world;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "test_queue")
public class TestReceiver {

    @RabbitHandler
    public void receive (String in) {
        System.out.println("Received message: " + in);
    }
}
