package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;

public interface MessageSender {
    void sendMessage(User user, String message);
}
