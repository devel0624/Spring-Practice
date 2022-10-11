package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
            new MessageSendService(new SmsMessageSender()).doSendMessage();
        }
    }
}
