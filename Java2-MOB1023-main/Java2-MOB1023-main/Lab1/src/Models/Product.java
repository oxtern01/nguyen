/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import DAO.*;
/**
 *
 * @author thnrg
 */
public class Product implements DAO{
    private String name;
    private double price;
    
    public Product()
    {
        
    }
    
    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public double getImportTax()
    {
        return 0.1 * this.price;
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

    @Override
    public void insert() {
        System.out.println("Insert success");
    }

    @Override
    public void update() {
        System.out.println("Update success");
    }

    @Override
    public void delete() {
        System.out.println("Delete success");
    }

    @Override
    public void select() {
        System.out.println("Select success");
    }
}
