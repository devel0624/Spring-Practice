package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;

public class SmsMessageSender implements MessageSender {
    public void initMethod(){
        System.out.println("Init Method on SMS Message");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to ${phoneNumber} : ${message}");
    }
}
