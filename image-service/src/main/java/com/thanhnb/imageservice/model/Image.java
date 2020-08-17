package com.thanhnb.imageservice.model;

public class Image {
    private Long id;
    private String name;
    private String src;

    public Image(Long id, String name, String src) {
        this.id = id;
        this.name = name;
        this.src = src;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
