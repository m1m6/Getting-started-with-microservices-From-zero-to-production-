package com.mjbour.udemy.model;

import com.codahale.metrics.MetricRegistryListener;

public class BaseEntity {

    private Long id;
    private String createdOn;
    private String modifiedOn;

    public BaseEntity(){}

    public BaseEntity(Long id, String createdOn, String modifiedOn) {
        this.id = id;
        this.createdOn = createdOn;
        this.modifiedOn = modifiedOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
