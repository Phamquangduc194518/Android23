package com.example.recyclerview;

public class User {
    private int id;
    private String name;
    private String adrress;

    public User(int id, String name, String adrress) {
        this.id = id;
        this.name = name;
        this.adrress = adrress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }
}
