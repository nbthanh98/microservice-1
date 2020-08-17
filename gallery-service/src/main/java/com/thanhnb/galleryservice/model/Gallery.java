package com.thanhnb.galleryservice.model;

import java.util.List;

public class Gallery {
    private Long id;
    private List<Object> images;

    public Gallery() {
    }

    public Gallery(Long id, List<Object> images) {
        this.id = id;
        this.images = images;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }
}
