package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;

public class EmailMessageSender implements MessageSender{
    public void destroyMethod(){
        System.out.println("Destroy Method on Email Message Sender");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to ${email} : ${message}");
    }
}
