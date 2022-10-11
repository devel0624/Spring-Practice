package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;

public class SmsMessageSender implements MessageSender {
    public SmsMessageSender(){
        System.out.println("Create SMS Message Sender");
    }
    public void init(){
        System.out.println("Init SMS Message Sender");
    }
    public void destroy(){
        System.out.println("Destroy SMS Message Sender");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to ${phoneNumber} : ${message}");
    }
}
