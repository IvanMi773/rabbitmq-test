package com.spring_rabbitmq.springrabbitmq.work_queues;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {

    @Bean
    public Queue workedQueue () {
        return new Queue("worked_queue");
    }

    private static class ReceiverConfig {

        @Bean
        public QueueReceiver queueReceiver1 () {
            return new QueueReceiver(1);
        }

        @Bean
        public QueueReceiver queueReceiver2 () {
            return new QueueReceiver(2);
        }
    }

    @Bean
    public QueueSender queueSender () {
        return new QueueSender();
    }
}
