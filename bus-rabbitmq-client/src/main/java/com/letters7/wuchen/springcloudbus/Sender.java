package com.letters7.wuchen.springcloudbus;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

import static java.lang.System.out;

/**
 * @author wuchenl
 * @date 2018/6/12.
 */
@Component
public class Sender {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    public void send(String msg) {
        out.println("Sender:"+msg);
        this.rabbitTemplate.convertAndSend("hello", msg);
    }
}
