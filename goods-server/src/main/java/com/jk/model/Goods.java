package com.jk.model;

public class Goods {

    private String goodId;

    private String goodName;

    private String goodType;

    private Double goodPrice;

    private int sales;

    private int inventory;

    public String getGoodId() {
        return goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public String getGoodType() {
        return goodType;
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public int getSales() {
        return sales;
    }

    public int getInventory() {
        return inventory;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

}
