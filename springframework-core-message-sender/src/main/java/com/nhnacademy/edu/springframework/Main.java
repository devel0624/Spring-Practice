package com.nhnacademy.edu.springframework;

public class Main {
    public static void main(String[] args) {
        sendSmsMessage();
    }

    public static void sendSmsMessage(User user,String message){
        System.out.println("SMS Message Sent to ${phoneNumber} : ${message}");
    }

    public static void sendEmailMessage(User user, String message){
        System.out.println("Email Message Sent to ${email} : ${message}");
    }
}
