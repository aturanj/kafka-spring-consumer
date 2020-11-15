package com.vs.model;

public class Message {

    private Long id;
    private String message;
    private Integer lifetimeDay;

    public Message() {
    }

    public Message(Long id, String message, Integer lifetimeDay) {
        this.id = id;
        this.message = message;
        this.lifetimeDay = lifetimeDay;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setLifetimeDay(Integer lifetimeDay) {
        this.lifetimeDay = lifetimeDay;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Integer getLifetimeDay() {
        return lifetimeDay;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }
}
