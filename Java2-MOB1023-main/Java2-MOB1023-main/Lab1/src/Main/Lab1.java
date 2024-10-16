/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Models.NoTaxProduct;
import Models.Product;
import Utils.Tools;
import java.util.ArrayList;

/**
 *
 * @author thnrg
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int excerise = 0;
        while(excerise < 2 || excerise > 4)
        {
            excerise = Tools.getInt("Choose exercise (2-4): ");
        }
        switch(excerise)
        {
            case 2 -> bai2();
            case 3 -> bai3();
            case 4 -> bai4();
        }
    }
    
    public static Product getProductData(int i)
    {
        Product tempProduct = new Product();
        System.out.printf("Product number %d:\n", i + 1);
        tempProduct.setName(Tools.getString("Product name: "));
        tempProduct.setPrice(Tools.getDouble("Product price: "));
        return tempProduct;
    }
    
    public static NoTaxProduct getNoTaxProductData(int i)
    {
        NoTaxProduct tempProduct = new NoTaxProduct();
        System.out.printf("Product number %d:\n", i + 1);
        tempProduct.setName(Tools.getString("Product name: "));
        tempProduct.setPrice(Tools.getDouble("Product price: "));
        return tempProduct;
    }
    
    public static void output(ArrayList<Product> product)
    {
        System.out.println("Output: ");
        for(Product tempProduct: product)
        {
            System.out.printf("Product name: %s, price: %f, import tax: %f\n", tempProduct.getName(), tempProduct.getPrice(), tempProduct.getImportTax());
        }
    }
    
    public static void bai2()
    {
        ArrayList<Product> product = new ArrayList();
        
        //Input
        for(int i = 0; i < 5; i++)
        {
            product.add(getProductData(i));
        }
        
        //Output
        output(product);
    }
    
    public static void bai3()
    {
        ArrayList<Product> product = new ArrayList();
        
        //Input
        for(int i = 0; i < 2; i++)
        {
            product.add(getProductData(i));
        }
        product.add(getNoTaxProductData(3));
        
        //Output
        output(product);
    }
    
    public static void bai4()
    {
        ArrayList<Product> product = new ArrayList();
        
         //Input
        for(int i = 0; i < 2; i++)
        {
            product.add(getProductData(i));
        }
        product.add(getNoTaxProductData(3));
        
        //Output
        System.out.println("Output: ");
        for(Product temp: product)
        {
            System.out.printf("Product name: %s, price: %f, import tax: %f\n", temp.getName(), temp.getPrice(), temp.getImportTax());
            temp.insert();
            temp.update();
            temp.delete();
            temp.select();
        }
    }
}
