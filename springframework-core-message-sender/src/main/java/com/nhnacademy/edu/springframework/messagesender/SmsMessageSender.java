package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;

public class SmsMessageSender implements MessageSender {

    public SmsMessageSender(){
        System.out.println("SMS MESSAGE SENDER, CREAT");
    }

    public void sendMessage(){
        System.out.println("Send SMS MESSAGE");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to ${phoneNumber} : ${message}");
    }
}
