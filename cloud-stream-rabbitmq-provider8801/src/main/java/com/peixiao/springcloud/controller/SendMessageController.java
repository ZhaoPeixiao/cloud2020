package com.peixiao.springcloud.controller;

import com.peixiao.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Peixiao Zhao
 * @date 2020/12/16 8:53
 */
@RestController
public class SendMessageController {


    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public String send(){
        return messageProvider.send();
    }


}
