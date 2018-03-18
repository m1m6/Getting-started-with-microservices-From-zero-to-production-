package com.mjbour.udemy.model;

import com.mjbour.udemy.data.Country;
import com.mjbour.udemy.data.State;
import com.mjbour.udemy.data.Type;

public class Location extends BaseEntity {
    private Country country;
    private State state;
    private Type type;
    private String code;
    private String name;

    public Location(){

    }

    public Location(Long id, String createdOn, String modifiedOn, Country country, State state, Type type, String code, String name) {
        super(id, createdOn, modifiedOn);
        this.country = country;
        this.state = state;
        this.type = type;
        this.code = code;
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
