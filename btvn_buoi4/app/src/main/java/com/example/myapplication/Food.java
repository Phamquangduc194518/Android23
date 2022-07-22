package com.example.myapplication;

public class Food {
    private int image;
    private String title;
    private String fanSize;
    private String update;
    private String status;

    public Food(int image, String title, String fanSize, String update, String status) {
        this.image = image;
        this.title = title;
        this.fanSize = fanSize;
        this.update = update;
        this.status = status;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFanSize() {
        return fanSize;
    }

    public void setFanSize(String fanSize) {
        this.fanSize = fanSize;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}