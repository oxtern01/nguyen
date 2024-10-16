/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Classes.*;
import Threads.*;
import UI.*;
import Utils.Tools;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;

/**
 *
 * @author thnrg
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        FlatLightLaf.setup();
        int excerise = 0;
        Lab6 lab6 = new Lab6();
        
        while(excerise < 1 || excerise > 7)
        {
            excerise = Tools.getInt("Choose exercise (1-7): ");
        }
        switch(excerise)
        {
            case 1 -> lab6.bai1();
            case 2 -> lab6.bai2();
            case 3 -> lab6.bai3();
            case 4 -> lab6.bai4();
            case 5 -> lab6.demo1();
            case 6 -> lab6.demo2();
            case 7 -> lab6.demo3();
        }
    }

    private void bai1() 
    {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        
        thread1.start();
        thread2.start();
    }

    private void bai2() 
    {
        JFrame clock = new Clock();
        clock.setVisible(true);
    }

    private void bai3() 
    {
        Thread t1 = new OddThread();
        Thread t2 = new EvenThread();
        t1.start();
        try
        {
             t1.join();
        }
        catch(InterruptedException ex)
        {
        }
        t2.start();
    }

    private void bai4() 
    {
        JFrame xosokienthiet = new XoSoKienThiet();
        xosokienthiet.setVisible(true);
    }

    private void demo1() {
        Demo1Thread t1 = new Demo1Thread();
        Demo1Thread t2 = new Demo1Thread();
        Demo1Thread t3 = new Demo1Thread();
        t1.start();
        t2.start();
        t3.start();
    }

    private void demo2() {
        Thread t1 = new Thread(new Demo2Runnable());
        Thread t2 = new Thread(new Demo2Runnable());
        Thread t3 = new Thread(new Demo2Runnable());
        t1.start();
        t2.start();
        t3.start();
    }
    
    private void demo3() {
        JFrame demo1 = new Demo3();
        demo1.setVisible(true);
    }
    
}
