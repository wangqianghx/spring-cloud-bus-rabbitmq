package com.letters7.wuchen.springcloudbus;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wuchenl
 * @date 2018/6/12.
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(String msg) {
        System.out.println("Sender:"+msg);
        this.rabbitTemplate.convertAndSend("hello", msg);
    }
}
