package com.example.util.email.model;

import java.util.Date;
import java.util.List;

/**
 * 邮件实体类
 * @author James-CSH
 * @since 2/21/2017 10:32 PM
 */
public class Email {

    //发送人
    private User fromUser;
    //收件人
    private List<User> toUsers;
    //抄送人
    private List<User> ccUsers;
    //暗抄送人
    private List<User> bccUsers;
    //主题
    private String subject;
    //内容
    private String content;
    //发送状态
    private int status;
    //创建时间
    private Date createTime;
    //发送时间
    private Date sendTime;
    //发送描述
    private String description;
    //附件列表
    private List<Attachment> attachments;

    public Email() {
    }

    public Email(User fromUser, List<User> toUsers, List<User> ccUsers, List<User> bccUsers, String subject, String content, int status, Date createTime, Date sendTime, String description, List<Attachment> attachments) {
        this.fromUser = fromUser;
        this.toUsers = toUsers;
        this.ccUsers = ccUsers;
        this.bccUsers = bccUsers;
        this.subject = subject;
        this.content = content;
        this.status = status;
        this.createTime = createTime;
        this.sendTime = sendTime;
        this.description = description;
        this.attachments = attachments;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public List<User> getToUsers() {
        return toUsers;
    }

    public void setToUsers(List<User> toUsers) {
        this.toUsers = toUsers;
    }

    public List<User> getCcUsers() {
        return ccUsers;
    }

    public void setCcUsers(List<User> ccUsers) {
        this.ccUsers = ccUsers;
    }

    public List<User> getBccUsers() {
        return bccUsers;
    }

    public void setBccUsers(List<User> bccUsers) {
        this.bccUsers = bccUsers;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
}
