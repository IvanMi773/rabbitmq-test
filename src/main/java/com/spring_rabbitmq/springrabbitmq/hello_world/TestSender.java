package com.spring_rabbitmq.springrabbitmq.hello_world;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class TestSender {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    public void send (String message) {
        this.template.convertAndSend(queue.getName(), message);
        System.out.println("Sent \"" + message + "\" to queue " + queue.getName());
    }
}
