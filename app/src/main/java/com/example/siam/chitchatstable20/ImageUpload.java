package com.example.siam.chitchatstable20;

public class ImageUpload {

    public String name;
    public String url;
    public String price;
    public String status;
    public String description;
    public String namephon;


    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getNamephon() {
        return namephon;
    }

    public ImageUpload(String name, String url, String price, String status, String description, String namephon) {
        this.name = name;
        this.url = url;
        this.price = price;
        this.status = status;
        this.description = description;
        this.namephon = namephon;
    }

    public ImageUpload(){}
}
