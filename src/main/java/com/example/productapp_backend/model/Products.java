package com.example.productapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String man_date;
    private String exp_date;
    private String brand;
    private int price;
    private String sellername;


    public Products() {
    }

    public Products(int id, String name, String man_date, String exp_date, String brand, int price, String sellername) {
        this.id = id;
        this.name = name;
        this.man_date = man_date;
        this.exp_date = exp_date;
        this.brand = brand;
        this.price = price;
        this.sellername = sellername;

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

    public String getMan_date() {
        return man_date;
    }

    public void setMan_date(String man_date) {
        this.man_date = man_date;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }


}
