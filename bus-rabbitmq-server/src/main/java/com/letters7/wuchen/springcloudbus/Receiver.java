package com.letters7.wuchen.springcloudbus;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import static java.lang.System.out;

/**
 * @author wuchenl
 * @date 2018/6/12.
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {


    @RabbitHandler
    public void processprocessMessage2(String message, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag){
        out.println("接受到的消息:" + message);
        try {
            Thread.sleep(2000);
            int a = new Random().nextInt(2);
            out.println(a);
            Thread.sleep(2000);
            if (a == 1){
                channel.basicAck(tag,false);
            }else {
                channel.basicNack(tag,false,true);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println("休眠结束");
    }
}
