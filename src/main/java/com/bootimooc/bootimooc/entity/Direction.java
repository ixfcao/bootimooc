package com.bootimooc.bootimooc.entity;

public class Direction {
    private Integer id;

    private String directionname;

    private String describee;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirectionname() {
        return directionname;
    }

    public void setDirectionname(String directionname) {
        this.directionname = directionname == null ? null : directionname.trim();
    }

    public String getDescribee() {
        return describee;
    }

    public void setDescribee(String describee) {
        this.describee = describee == null ? null : describee.trim();
    }
}