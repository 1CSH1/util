package com.example.util.email.model;

import java.net.URL;

/**
 * 附件类
 * @author James-CSH
 * @since 2/24/2017 8:28 PM
 */
public class Attachment {

    //附件名称
    private String name;
    //附件路径
    private String path;
    /**
     * the attachment from network
     */
    private URL url;
    /**
     * the description of attachment
     */
    private String description;
    /**
     * the configure of email
     */
    private String disposition;

    public Attachment() {
    }

    public Attachment(String name, String path, URL url, String description, String disposition) {
        this.name = name;
        this.path = path;
        this.url = url;
        this.description = description;
        this.disposition = disposition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }
}
