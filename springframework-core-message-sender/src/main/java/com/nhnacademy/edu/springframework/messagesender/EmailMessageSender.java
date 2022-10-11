package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;

public class EmailMessageSender implements MessageSender{
    public EmailMessageSender(){
        System.out.println("EMAIL MESSAGE SENDER, CREAT");
    }

    public void sendMessage(){
        System.out.println("Send EMAIL MESSAGE");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to ${email} : ${message}");
    }
}
