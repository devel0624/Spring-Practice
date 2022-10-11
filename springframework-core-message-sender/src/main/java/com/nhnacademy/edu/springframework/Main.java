package com.nhnacademy.edu.springframework;

public class Main {
    public static void main(String[] args) {
        new MessageSendService(new EmailMessageSender()).doSendMessage();
        new MessageSendService(new SmsMessageSender()).doSendMessage();
    }
}
