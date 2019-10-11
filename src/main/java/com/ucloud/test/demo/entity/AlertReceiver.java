package com.ucloud.test.demo.entity;

import javax.validation.constraints.NotNull;

public class AlertReceiver {

    private int id;
    @NotNull
    private String name;
    @NotNull
    private String mail;
    @NotNull
    private Long phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "AlertReceiver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", phone=" + phone +
                '}';
    }
}
