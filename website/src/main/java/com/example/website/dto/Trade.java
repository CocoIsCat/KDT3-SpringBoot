package com.example.website.dto;

public class Trade {

    private int id;
    private String email;
    private String coinId;
    private String name;
    private double price;
    private int amount;
    private double total;
    private String indate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public Trade(int id, String email, String coinId, String name, double price, int amount, double total, String indate) {
        this.id = id;
        this.email = email;
        this.coinId = coinId;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.total = total;
        this.indate = indate;
    }

    public Trade(String email, String coinId, String name, double price, int amount, double total) {
        this.email = email;
        this.coinId = coinId;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.total = total;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        return "Trade{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", coinId='" + coinId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", total=" + total +
                ", indate='" + indate + '\'' +
                '}';
    }
}
