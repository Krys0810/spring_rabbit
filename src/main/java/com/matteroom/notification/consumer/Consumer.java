package com.matteroom.notification.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener (queues = "notification")
public class Consumer {
    @RabbitHandler
    public void process(String message){
        System.out.println("--------Consumer:--------" + message);
    }
}
