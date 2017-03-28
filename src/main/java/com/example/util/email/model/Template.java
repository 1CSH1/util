package com.example.util.email.model;

import java.util.Date;
import java.util.List;

/**
 * 邮件模板
 * @author James-CSH
 * @since 2/24/2017 8:48 PM
 */
public class Template {
    //ID
    private int id;
    //名称
    private String name;
    //主题
    private String subject;
    //内容
    private String content;
    //发送人
    private User fromUser;
    //创建人
    private User createUser;
    //修改人
    private User updateUser;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //状态
    private int status;
    //附件列表
    private List<Attachment> attachments;

    public Template() {
    }

    public Template(int id, String name, String subject, String content, User fromUser, User createUser, User updateUser, Date createTime, Date updateTime, int status, List<Attachment> attachments) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.content = content;
        this.fromUser = fromUser;
        this.createUser = createUser;
        this.updateUser = updateUser;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
        this.attachments = attachments;
    }

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public User getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(User updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
}