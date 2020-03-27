package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;;
import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Auther Carroll
 * @Date 2020/3/26
 * @e-mail ggq_carroll@163.com
 */
//这不是传统的service,这是和rabbitmq打交道的，不需要加注解@Service
//这里不调dao，调消息中间件的service
//信道channel和exchange绑定在一起
@EnableBinding(Source.class)    //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;
    //官网就是这么写的，可以去官网看案例
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: " +serial);
        return null;
    }
}
