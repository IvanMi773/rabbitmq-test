package com.spring_rabbitmq.springrabbitmq.controller;

import com.spring_rabbitmq.springrabbitmq.hello_world.TestSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RabbitController {

    @Autowired
    private TestSender testSender;

    @GetMapping("/{message}")
    public void send (@PathVariable String message) {
        testSender.send(message);
    }
}
