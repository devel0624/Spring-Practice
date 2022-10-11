package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;

public class Main {
    public static void main(String[] args) {
        new MessageSendService(new EmailMessageSender()).doSendMessage();
        new MessageSendService(new SmsMessageSender()).doSendMessage();
    }
}
