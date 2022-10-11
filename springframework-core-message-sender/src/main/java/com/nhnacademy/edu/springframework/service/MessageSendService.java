package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.User;
import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;

public class MessageSendService {

    MessageSender emailMessageSender;
    MessageSender smsMessageSender;

    MessageSender messageSender;



    public MessageSendService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public MessageSendService(MessageSender emailMessageSender, SmsMessageSender smsMessageSender) {
        this.emailMessageSender = emailMessageSender;
        this.smsMessageSender = smsMessageSender;

    }

    public void doSendMessage(){
        this.emailMessageSender.sendMessage(new User("ABC@mail.com","010-XXXX-XXXX"),"Hello!");
        this.smsMessageSender.sendMessage(new User("ABC@mail.com","010-XXXX-XXXX"),"Hello!");
    }
}
