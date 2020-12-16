package com.peixiao.springcloud.service.impl;

import com.peixiao.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @author Peixiao Zhao
 * @date 2020/12/16 8:54
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    //消息发送通道
    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial***" + serial);
        return serial;
    }
}
