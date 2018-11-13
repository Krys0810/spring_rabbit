package com.matteroom.notification;

import com.matteroom.notification.publisher.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private Sender sender;

    @RequestMapping(value="/test")
    public void TestAPI(){
        sender.send();
    }
}
