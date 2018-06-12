package com.letters7.wuchen.springcloudbus;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wuchenl
 * @date 2018/6/12.
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {


    @RabbitHandler
    public void process(String hello) {
        System.out.println("接受到的消息:" + hello);
    }
}
