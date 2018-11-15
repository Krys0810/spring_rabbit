package com.matteroom.notification.publisher;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        for (int i = 0; i < 10; i++) {
            String context = "hello" + i + " :" + new Date();
            System.out.println("Sender" + i + ": " + context);
            this.amqpTemplate.convertAndSend("notification", context);
        }

    }
}
