package com.staff.model;

import java.sql.Date;

/**
 * Created by asus on 2017/12/21.
 */
public class PublicSave {
    private Integer id ;
    private String account ;
    private String content ;
    private Date saveTime ;

    public PublicSave() {
    }

    public PublicSave(String account, String content, Date saveTime) {
        this.account = account;
        this.content = content;
        this.saveTime = saveTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    @Override
    public String toString() {
        return "PublicSave{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", content='" + content + '\'' +
                ", saveTime='" + saveTime + '\'' +
                '}';
    }
}
