package com.bootimooc.bootimooc.entity;

import java.util.Date;
import java.util.List;

public class Course {
    private Integer id;

    private Integer classifyid;

    private Integer directionid;

    private Integer levelid;

    private Date raleasetime;

    private Integer studycount;

    private String courescover;

    private String validday;

    private Integer lecturerid;

    private String coursename;

    private String describe;

    private String free;

    private Double price;

    private Date courseduration;

    private Integer homepageid;

    private String keyword;

    private String position;
    // 评价人数
    private Integer enumber;

    private String leve;

    private String labela;

    private String labelb;

    private String labelc;

    // 章节集合
    private List<Chapter> chapters;

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(Integer classifyid) {
        this.classifyid = classifyid;
    }

    public Integer getDirectionid() {
        return directionid;
    }

    public void setDirectionid(Integer directionid) {
        this.directionid = directionid;
    }

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public Date getRaleasetime() {
        return raleasetime;
    }

    public void setRaleasetime(Date raleasetime) {
        this.raleasetime = raleasetime;
    }

    public Integer getStudycount() {
        return studycount;
    }

    public void setStudycount(Integer studycount) {
        this.studycount = studycount;
    }

    public String getCourescover() {
        return courescover;
    }

    public void setCourescover(String courescover) {
        this.courescover = courescover == null ? null : courescover.trim();
    }

    public String getValidday() {
        return validday;
    }

    public void setValidday(String validday) {
        this.validday = validday == null ? null : validday.trim();
    }

    public Integer getLecturerid() {
        return lecturerid;
    }

    public void setLecturerid(Integer lecturerid) {
        this.lecturerid = lecturerid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free == null ? null : free.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCourseduration() {
        return courseduration;
    }

    public void setCourseduration(Date courseduration) {
        this.courseduration = courseduration;
    }

    public Integer getHomepageid() {
        return homepageid;
    }

    public void setHomepageid(Integer homepageid) {
        this.homepageid = homepageid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getEnumber() {
        return enumber;
    }

    public void setEnumber(Integer enumber) {
        this.enumber = enumber;
    }

    public String getLeve() {
        return leve;
    }

    public void setLeve(String leve) {
        this.leve = leve == null ? null : leve.trim();
    }

    public String getLabela() {
        return labela;
    }

    public void setLabela(String labela) {
        this.labela = labela == null ? null : labela.trim();
    }

    public String getLabelb() {
        return labelb;
    }

    public void setLabelb(String labelb) {
        this.labelb = labelb == null ? null : labelb.trim();
    }

    public String getLabelc() {
        return labelc;
    }

    public void setLabelc(String labelc) {
        this.labelc = labelc == null ? null : labelc.trim();
    }
}