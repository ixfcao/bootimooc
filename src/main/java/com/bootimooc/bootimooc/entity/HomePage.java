package com.bootimooc.bootimooc.entity;

import java.util.List;

public class HomePage {
    private Integer id;

    private String titlea;

    private String titleb;

    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitlea() {
        return titlea;
    }

    public void setTitlea(String titlea) {
        this.titlea = titlea == null ? null : titlea.trim();
    }

    public String getTitleb() {
        return titleb;
    }

    public void setTitleb(String titleb) {
        this.titleb = titleb == null ? null : titleb.trim();
    }
}