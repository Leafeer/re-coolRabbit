package com.evan.coolrabbit.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "noteCate")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class NoteCate
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ncCateId")
    int ncCateId;

    int ncFatherId;
    String ncContent;

    public int getNcCateId() {
        return ncCateId;
    }

    public void setNcCateId(int ncCateId) {
        this.ncCateId = ncCateId;
    }

    public int getNcFatherId() {
        return ncFatherId;
    }

    public void setNcFatherId(int ncFatherId) {
        this.ncFatherId = ncFatherId;
    }

    public String getNcContent() {
        return ncContent;
    }

    public void setNcContent(String ncContent) {
        this.ncContent = ncContent;
    }
}
