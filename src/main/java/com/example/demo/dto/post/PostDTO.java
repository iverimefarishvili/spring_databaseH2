package com.example.demo.dto.post;

import java.util.Date;

public class PostDTO {
    private Long id;
    private String title;
    private String description;
    private Date createDate;
    private int rate;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getRate() {
        return rate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
