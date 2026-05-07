package com.example.demo;

public class ApiResponse {

    private boolean status;
    private String message;
    private Student data;

    public ApiResponse(boolean status, String message, Student data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Student getData() {
        return data;
    }
}