package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;

public class EmailMessageSender implements MessageSender{

    public void initMethod(){
        System.out.println("Init Method on Email Message");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to ${email} : ${message}");
    }
}
