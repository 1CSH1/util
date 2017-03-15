package com.example.util.email.model;

/**
 * 邮件用户
 * @author James-CSH
 * @since 2/21/2017 10:36 PM
 */
public class User {
    //名称
    private String name;
    //邮件地址
    private String mail;

    public User() {
    }

    public User(String name, String mail) {
        this.name = name;
        this.mail = mail;
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

    @Override
    public String toString() {
        return name + "<" + mail + ">";
    }
}
