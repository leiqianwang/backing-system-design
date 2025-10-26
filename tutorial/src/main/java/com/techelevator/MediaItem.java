package com.techelevator;

import java.io.Serializable;

public class MediaItem implements Purchasable {
    protected String title;
    protected double price;

    public MediaItem(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
