/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Utils.Exportable;
import java.io.Serializable;

/**
 *
 * @author thnrg
 */
public class Product implements Serializable, Exportable{
    protected String productID;
    protected String productName;
    protected Double productPrice;

    public Product() {
    }

    public Product(String maSP, String tenSP, Double gia) {
        this.productID = maSP;
        this.productName = tenSP;
        this.productPrice = gia;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String maSP) {
        this.productID = maSP;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String tenSP) {
        this.productName = tenSP;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double gia) {
        this.productPrice = gia;
    }
    
    @Override
    public Object[] toObjectArray()
    {
        return new Object[] {productID, productName, productPrice};
    }
}
