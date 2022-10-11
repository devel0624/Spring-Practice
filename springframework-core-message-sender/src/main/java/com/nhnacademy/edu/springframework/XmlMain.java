package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            MessageSender emailSender = context.getBean("emailMessageSender", MessageSender.class);
            MessageSender smsSender = context.getBean("smsMessageSender", MessageSender.class);

            emailSender.sendMessage(new User("a","b"),"c");
            smsSender.sendMessage(new User("d","b"),"c");
        }
    }
}
