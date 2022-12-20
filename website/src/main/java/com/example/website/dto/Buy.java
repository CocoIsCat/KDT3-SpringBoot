package com.example.website.dto;

public class Buy {
    private double price;
    private String coinId;
    private String name;
    private int amount;
    private double total;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCoinId() {
        return coinId;
    }

    public void setCoinId(String coinId) {
        this.coinId = coinId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "price=" + price +
                ", coinId='" + coinId + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", total=" + total +
                '}';
    }
}
