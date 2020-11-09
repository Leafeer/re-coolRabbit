package com.evan.coolrabbit.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "label")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "laLabelId")
    int laLabelId;

    int laFatherId;
    String laContent;

    public int getLaLabelId() {
        return laLabelId;
    }

    public void setLaLabelId(int laLabelId) {
        this.laLabelId = laLabelId;
    }

    public int getLaFatherId() {
        return laFatherId;
    }

    public void setLaFatherId(int laFatherId) {
        this.laFatherId = laFatherId;
    }

    public String getLaContent() {
        return laContent;
    }

    public void setLaContent(String laContent) {
        this.laContent = laContent;
    }
}
