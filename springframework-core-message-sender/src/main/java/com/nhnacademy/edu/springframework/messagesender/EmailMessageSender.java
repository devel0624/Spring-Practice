package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;

public class EmailMessageSender implements MessageSender{
    public EmailMessageSender(){
        System.out.println("Create Email Message Sender");
    }
    public void init(){
        System.out.println("Init Email Message Sender");
    }
    public void destroy(){
        System.out.println("Destroy Email Message Sender");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to ${email} : ${message}");
    }
}
