package com.mjbour.udemy.data;

public enum Country {

    US("United State of America","US"),
    UK("United kingdom","GB");

    private String name;
    private String code;

    Country(String name,String code){
        this.name = name;
        this.code = code;
    }
}
