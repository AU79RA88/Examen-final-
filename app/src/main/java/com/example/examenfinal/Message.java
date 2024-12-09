package com.example.examenfinal;

public class Message {
    private String username;
    private String text;

    public Message() { }

    public Message(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public String getText() {
        return text;
    }
}