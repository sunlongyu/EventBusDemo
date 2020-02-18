package com.example.eventbusdemo;

public class MyEventBus {

    private String msg;

    public MyEventBus(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
