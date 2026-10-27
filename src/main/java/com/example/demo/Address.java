package com.example.demo;

public class Address {

    private int id;
    private String name;
    private String province;
    private String city;
    private String country;

    public Address() {
    }

    public Address(int id, String name, String province, String city, String country) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.city = city;
        this.country = country;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    @Override
    public String toString() {
        return "I live in " + city + ", " + province + ", " + country + ".";
    }
}