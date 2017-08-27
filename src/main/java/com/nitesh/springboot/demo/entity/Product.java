package com.nitesh.springboot.demo.entity;

import java.util.Date;

public class Product {

    int id;
    String name;
    String barCode;
    Double mrp;
    Date dom;
    String companyName;

    public Product() {
        super();
    }

    public Product(int id, String name, String barCode, Double mrp, Date dom, String companyName) {
        this.id = id;
        this.name = name;
        this.barCode = barCode;
        this.mrp = mrp;
        this.dom = dom;
        this.companyName = companyName;
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

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        this.mrp = mrp;
    }

    public Date getDom() {
        return dom;
    }

    public void setDom(Date dom) {
        this.dom = dom;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
