package com.example.util.email;

import com.example.util.email.model.Attachment;
import com.example.util.email.model.Email;
import com.example.util.email.model.User;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author James-CSH
 * @since 3/16/2017 9:40 PM
 */
public class TestEmail {

    @Test
    public void test01() {
        Email email = new Email();
        User fromUser = new User();
        fromUser.setName("陈先生");
        fromUser.setEmail("shuohuangchen@163.com");
        fromUser.setPassword("cshmszsmt0709");
        email.setFromUser(fromUser);

        List<User> toUsers = new ArrayList<User>();
        User toUser1 = new User();
        toUser1.setName("陈先生");
        toUser1.setEmail("602685158@qq.com");
        toUsers.add(toUser1);
        User toUser2 = new User();
        toUser2.setName("陈小姐");
        toUser2.setEmail("846580163@qq.com");
        toUsers.add(toUser2);
        email.setToUsers(toUsers);

        List<User> bccUsers = new ArrayList<User>();
        User bccUser = new User();
        bccUser.setName("BCC人");
        bccUser.setEmail("1993630663@qq.com");
        bccUsers.add(bccUser);
        email.setBccUsers(bccUsers);

        List<User> ccUsers = new ArrayList<User>();
        User ccUser = new User();
        ccUser.setName("CC人");
        ccUser.setEmail("751300407@qq.com");
        ccUsers.add(ccUser);
        email.setCcUsers(ccUsers);

        email.setSubject("测试");
        email.setContent("<p>内容哈哈哈哈 测试图片 \n <img src=\"http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg\"> </p>");

        List<Attachment> attachments = new ArrayList<Attachment>();
        Attachment attachment = new Attachment();
        try {
            attachment.setUrl(new URL("https://1csh1.github.io/file/Sqoop%E5%AE%89%E8%A3%85%E4%B8%8E%E9%85%8D%E7%BD%AE/sqoop-1.4.6.bin__hadoop-2.0.4-alpha.tar.gz"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        attachments.add(attachment);

        email.setAttachments(attachments);

        List<Email> result = EmailUtil.send(email);

        System.out.println(result.get(0).getContent());

    }


}

