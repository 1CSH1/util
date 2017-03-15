package com.example.util.email.model;

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

    public Attachment() {
    }

    public Attachment(String name, String path) {
        this.name = name;
        this.path = path;
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
}
