package com.bootimooc.bootimooc.entity;

import java.util.Date;

public class Estimate {
    private Integer id;

    private String username;

    private String coursename;

    private String content;

    private Date time;

    private String reversion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReversion() {
        return reversion;
    }

    public void setReversion(String reversion) {
        this.reversion = reversion == null ? null : reversion.trim();
    }
}