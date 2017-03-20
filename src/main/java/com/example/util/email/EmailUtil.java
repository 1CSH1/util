package com.example.util.email;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.util.email.model.Attachment;
import com.example.util.email.model.Email;
import com.example.util.email.model.User;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.tags.ImageTag;
import org.htmlparser.util.NodeList;

import java.util.List;

/**
 * send email util
 * @author James-CSH
 * @since 3/15/2017 10:25 PM
 */
public class EmailUtil {

    private static ExecutorService executorService = Executors.newFixedThreadPool(EmailConstants.numbers);

    /**
     * send only one email
     * @param email     email
     * @return          the result of send email
     */
    public static int send(Email email) {
        return 0;
    }

    /**
     * send some email
     * @param emails
     * @return
     */
    public static int send(List<Email> emails) {
        return 0;
    }

    public static void sendaaa(List<Email> emails) {
        if (null != emails) {
            Email tEmail;
            for (int i = 0; i < emails.size(); i++) {
                tEmail = emails.get(i);
                HtmlEmail email = new HtmlEmail();
                email.setSocketTimeout(EmailConstants.SOCKETTIMEOUT);
                email.setSocketConnectionTimeout(EmailConstants.SOCKETCONNECTIONTIMEOUT);
                email.setCharset(EmailConstants.CHARSET);
                email.setHostName(EmailConstants.HOSTNAME);
                email.setSmtpPort(EmailConstants.SMTPPORT);
                // set from email
                try {
                    email.setFrom(tEmail.getFromUser().getEmail(), tEmail.getFromUser().getName());
                } catch (EmailException e) {
                    e.printStackTrace();
                }
                email.setAuthentication(tEmail.getFromUser().getEmail(), tEmail.getFromUser().getPassword());
                email.setSubject(tEmail.getSubject());
                // set to email
                List<User> toUsers = tEmail.getToUsers();
                if (null != toUsers && toUsers.size() > 0) {
                    User user;
                    for (int j = 0; j < toUsers.size(); j++) {
                        user = toUsers.get(j);
                        try {
                            email.addTo(user.getEmail(), user.getName());
                        } catch (EmailException e) {
                            e.printStackTrace();
                        }
                    }
                }
                // set cc email
                List<User> ccUsers = tEmail.getCcUsers();
                if (null != ccUsers && ccUsers.size() > 0) {
                    User user;
                    for (int j = 0; j < ccUsers.size(); j++) {
                        user = ccUsers.get(j);
                        try {
                            email.addCc(user.getEmail(), user.getName());
                        } catch (EmailException e) {
                            e.printStackTrace();
                        }
                    }
                }
                // set bcc email
                List<User> bccUsers = tEmail.getBccUsers();
                if (null != bccUsers && bccUsers.size() > 0) {
                    User user;
                    for (int j = 0; j < bccUsers.size(); j++) {
                        user = bccUsers.get(j);
                        try {
                            email.addBcc(user.getEmail(), user.getName());
                        } catch (EmailException e) {
                            e.printStackTrace();
                        }
                    }
                }

                // set the conent by deal with the picture
                String oriContent = tEmail.getContent();
                try {
                    Parser parser = new Parser(oriContent);
                    parser.setEncoding("UTF-8");
                    NodeFilter filter = new TagNameFilter("img");
                    NodeList nodeList = parser.extractAllNodesThatMatch(filter);
                    for (int j = 0; j < nodeList.size(); j++) {
                        ImageTag img = (ImageTag) nodeList.elementAt(j);
                        String imgUrl = EmailConstants.HOSTPATH + ":" + EmailConstants.HOSTPORT + img.getImageURL();
                        URL url = new URL(imgUrl);
                        String cid = email.embed(url, "img" + j);
                        String newImgUrl = "cid:" + cid;
                        oriContent = oriContent.replace(img.getImageURL(), newImgUrl);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }

                // generate the html email, we should set the html format
                StringBuilder htmlMsgBuf = new StringBuilder();
                htmlMsgBuf.append("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"></head><body>")
                        .append(oriContent)
                        .append("</body></html>");

                //set attachments
                List<Attachment> attachments = tEmail.getAttachments();
                if (null != attachments && 0 < attachments.size()) {
                    EmailAttachment emailAttachment = null;
                    Attachment attachment = null;
                    for (int j = 0; j < attachments.size(); j++) {
                        attachment = attachments.get(j);
                        emailAttachment = new EmailAttachment();
                        emailAttachment.setName(attachment.getName());
                        emailAttachment.setPath(attachment.getPath());
                        if (null != attachment.getUrl()) {
                            emailAttachment.setURL(attachment.getUrl());
                        }
                        emailAttachment.setDescription(attachment.getDescription());
                        emailAttachment.setDisposition(attachment.getDisposition());
                        try {
                            email.attach(emailAttachment);
                        } catch (EmailException e) {
                            e.printStackTrace();
                        }
                    }
                }

                try {
                    email.send();
                } catch (EmailException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
