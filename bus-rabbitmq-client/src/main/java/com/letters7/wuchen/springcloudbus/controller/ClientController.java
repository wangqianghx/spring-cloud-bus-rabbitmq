package com.letters7.wuchen.springcloudbus.controller;

import com.letters7.wuchen.springcloudbus.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuchenl
 * @date 2018/6/12.
 */
@RestController
@RequestMapping("sender")
public class ClientController {
    @Autowired
    private Sender sender;

    @GetMapping("send")
    public void sendMsg(String msg){
        System.out.println("即将发送："+msg);
        sender.send(msg);
    }
}
