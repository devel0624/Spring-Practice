package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.User;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;

public class MessageSendService {
    MessageSender messageSender;

    public MessageSendService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void doSendMessage(){
        this.messageSender.sendMessage(new User("ABC@mail.com","010-XXXX-XXXX"),"Hello!");
    }
}
