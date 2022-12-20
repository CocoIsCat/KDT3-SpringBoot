package com.example.adminpage.dto;

public class Subscribe {
    private String email;
    private Object indate;

    public Subscribe(String email, Object indate) {
        this.email = email;
        this.indate = indate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getIndate() {
        return indate;
    }

    public void setIndate(Object indate) {
        this.indate = indate;
    }

    @Override
    public String toString() {
        return "Subscribe{" +
                "email='" + email + '\'' +
                ", indate=" + indate +
                '}';
    }
}
