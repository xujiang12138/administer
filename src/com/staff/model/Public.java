package com.staff.model;

/**
 * Created by asus on 2017/12/21.
 */
public class Public {
    private Integer id;
    private String name ;
    private String content;
    private String account ;

    public Public() {
    }

    public Public(String name, String content, String account) {
        this.name = name;
        this.content = content;
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Public{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", account=" + account +
                '}';
    }
}
