package com.example.zara_tpv.pojo;

import android.widget.ImageView;

public class ListClothes {
    private ImageView imageView;
    private String name;
    private String size;
    private String price;
    private String color;

    public ListClothes(String name, String size, String price, String color) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
