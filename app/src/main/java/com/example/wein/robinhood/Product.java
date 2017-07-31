package com.example.wein.robinhood;

/**
 * Created by wein on 26/7/2017.
 */

public class Product {

    private String brand;
    private String model;
    private double price;
    private String seller;
    private int image;
    

    public Product( String brand, String model, double price, String seller, int image )
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.seller = seller;
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getSeller() {
        return seller;
    }

    public int getImage() {
        return image;
    }


}
