package com.wll.starter.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DemoInfo {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String content;

    public DemoInfo() {
    }

    public DemoInfo(String title1, String content1) {
        this.title = title1;
        this.content = content1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
