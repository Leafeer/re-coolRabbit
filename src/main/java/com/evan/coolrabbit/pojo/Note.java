package com.evan.coolrabbit.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

import javax.persistence.*;

@Entity
@Table(name = "note")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Note
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noNoteId")
    int noNoteId;

    int noLabelId;              // 标签ID
    int noUserId;               // 创建者id
    int noCateId;               // 笔记本分类id
    String noTitle;
    @Lob
    @Column(name = "noContentHtml")
    char noContentHtml;
    @Lob
    @Column(name = "noContentMd")
    char noContentMd;
    String noAbstract;           //  文章摘要
    String noCover;              //  文章略缩图标题
    DateTime noDate;             //  文章创建时间

    public int getNoNoteId() {
        return noNoteId;
    }

    public void setNoNoteId(int noNoteId) {
        this.noNoteId = noNoteId;
    }

    public int getNoLabelId() {
        return noLabelId;
    }

    public void setNoLabelId(int noLabelId) {
        this.noLabelId = noLabelId;
    }

    public int getNoUserId() {
        return noUserId;
    }

    public void setNoUserId(int noUserId) {
        this.noUserId = noUserId;
    }

    public int getNoCateId() {
        return noCateId;
    }

    public void setNoCateId(int noCateId) {
        this.noCateId = noCateId;
    }

    public String getNoTitle() {
        return noTitle;
    }

    public void setNoTitle(String noTitle) {
        this.noTitle = noTitle;
    }

    public long getNoContentHtml() {
        return noContentHtml;
    }

    public void setNoContentHtml(char noContentHtml) {
        this.noContentHtml = noContentHtml;
    }

    public long getNoContentMd() {
        return noContentMd;
    }

    public void setNoContentMd(char noContentMd) {
        this.noContentMd = noContentMd;
    }

    public String getNoAbstract() {
        return noAbstract;
    }

    public void setNoAbstract(String noAbstract) {
        this.noAbstract = noAbstract;
    }

    public String getNoCover() {
        return noCover;
    }

    public void setNoCover(String noCover) {
        this.noCover = noCover;
    }

    public DateTime getNoDate() {
        return noDate;
    }

    public void setNoDate(DateTime noDate) {
        this.noDate = noDate;
    }
}
