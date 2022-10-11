package com.nhnacademy.edu.springframework;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to ${phoneNumber} : ${message}");
    }
}
