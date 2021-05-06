package com.spring_rabbitmq.springrabbitmq.work_queues;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

public class QueueSender {

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue workedQueue;

    AtomicInteger dots = new AtomicInteger(0);
    AtomicInteger count = new AtomicInteger(0);

    public void send (String message) {
        StringBuilder builder = new StringBuilder(message);

        if (dots.incrementAndGet() == 4) {
            dots.set(1);
        }

        builder.append(count.incrementAndGet());
        String msg = builder.toString();
        template.convertAndSend(workedQueue.getName(), message);
        System.out.println(" [x] Sent '" + msg + "'");
    }
}
