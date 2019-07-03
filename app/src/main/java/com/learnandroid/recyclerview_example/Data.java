package com.learnandroid.recyclerview_example;

public class Data {
    private String sender;
    private String date;
    private String subject;

    public Data() {
    }

    public Data(String sender, String date, String subject) {
        this.sender = sender;
        this.date = date;
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
