/*
Website Development CA2
Ian Daly - X00132250
Matthew Cleary - X00130277
Shane Cotter - X00131736
 */
package models;

public class Product {

    private String name;
    private int size;
    private String brand;
    private String condition;
    private boolean delievery;
    private double price;

    public Product(){
        this.name = "";
        this.size = 0;
        this.brand = "";
        this.condition = "";
        this.delievery = false;
        this.price = 0.00;
    }

    public Product(String name, int size, String brand, String condition, boolean delievery, double price) {
        this.name = name;
        this.size = size;
        this.brand = brand;
        this.condition = condition;
        this.delievery = delievery;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isDelievery() {
        return delievery;
    }

    public void setDelievery(boolean delievery) {
        this.delievery = delievery;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
