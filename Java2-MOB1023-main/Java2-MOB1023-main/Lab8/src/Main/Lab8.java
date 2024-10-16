/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import DAO.ProductDAO;
import Models.Product;
import Utils.*;
import java.util.ArrayList;

/**
 *
 * @author thnrg
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int exercise = 0;
        
        Lab8 lab8 = new Lab8();
        
        while(exercise < 1 || exercise > 4)
        {
            exercise = Tools.getInt("Choose exercise (1-4): ");
        }

        switch(exercise)
        {
            case 1 -> lab8.bai1();
            case 2 -> lab8.bai2();
            case 3 -> lab8.bai3();
            case 4 -> lab8.bai4();
        }
    }
    
    public void bai1()
    {
        ArrayList list = new ArrayList();
        
        list.add((Integer) 123);
        list.add((Double) 0.432);
        list.add((boolean) true);
        list.add((String) "This is lab8 - section 1");
        
        for(Object object: list)
        {
            System.out.println(object);
        }
    }
    
    public void bai2()
    {
        ArrayList<Integer> myarr = new ArrayList<>();
        
        for(int i = 1; i <= 10; i++)
        {
            myarr.add(i);
        }
        
        for(Integer integer: myarr)
        {
            System.out.println(integer);
        }
    }
    
    public void bai3()
    {
        //Đã tạo class product và abstract class DAO theo đề
        System.out.println("Da tao class Product va abstract class DAO");
    }
    
    public void bai4()
    {
        Product p1 = new Product("iPhone9", 1000.0);
        Product p2 = new Product("Samsung Start", 3000.0);
        
        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        
        dao.store("src/Files/products.dat");
        
        ProductDAO dao2 = new ProductDAO();
        dao2.load("src/Files/products.dat");
        Product p = dao2.find("iPhone9");
        System.out.println(">Name: " + p.getName());
        System.out.println(">Price: " + p.getPrice());
    }
    
}
