/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author thnrg
 */
public class Dish implements Serializable{
    protected String dishID;
    protected String dishName;
    protected double dishPrice;

    public Dish(String dishID, String dishName, double dishPrice) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }

    public Dish() {
    }

    public String getDishID() {
        return dishID;
    }

    public void setDishID(String dishID) {
        this.dishID = dishID;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }
    
    
}
