package com.spring_rabbitmq.springrabbitmq.controller;

import com.spring_rabbitmq.springrabbitmq.hello_world.TestSender;
import com.spring_rabbitmq.springrabbitmq.work_queues.QueueSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RabbitController {

    private final TestSender testSender;
    private final QueueSender queueSender;

    public RabbitController(QueueSender queueSender, TestSender testSender) {
        this.queueSender = queueSender;
        this.testSender = testSender;
    }

    @GetMapping("/{message}")
    public void send (@PathVariable String message) {
        testSender.send(message);
    }

    @GetMapping("/work_queue/{message}") void workQueue (@PathVariable String message) {
        queueSender.send(message);
    }
}
