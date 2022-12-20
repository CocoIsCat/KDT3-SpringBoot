package com.example.adminpage.dto;

public class Payment {

    private int id;
    private String email;
    private double amount;
    private String uid;
    private Object indate;

    public Payment(int id, String email, double amount, String uid, Object indate) {
        this.id = id;
        this.email = email;
        this.amount = amount;
        this.uid = uid;
        this.indate = indate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Object getIndate() {
        return indate;
    }

    public void setIndate(Object indate) {
        this.indate = indate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", amount=" + amount +
                ", uid='" + uid + '\'' +
                ", indate=" + indate +
                '}';
    }
}
