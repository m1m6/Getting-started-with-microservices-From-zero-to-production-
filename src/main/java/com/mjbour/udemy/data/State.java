package com.mjbour.udemy.data;

public enum State {


    ARIZONA("Arizona","AR"),
    COLORADO("Colorado","CO");

    private String name;
    private String code;

    State(String name,String code){
        this.name = name;
        this.code = code;
    }
}
