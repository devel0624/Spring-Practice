package com.nhnacademy.edu.springframework;

public class MessageSendService {
    MessageSender messageSender;

    MessageSendService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void doSendMessage(){
        this.messageSender.sendMessage(new User("ABC@mail.com","010-XXXX-XXXX"),"Hello!");
    }
}
