package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;

public class SmsMessageSender implements MessageSender {
    public void destroyMethod(){
        System.out.println("Destroy Method on SMS Message Sender");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to ${phoneNumber} : ${message}");
    }
}
