/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Enums.Career;
import Models.PolyStudent;
import UI.SuDungMath;
import UI.Sum;
import UI.XPoly;
import Utils.Tools;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;

/**
 *
 * @author thnrg
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        FlatLightLaf.setup();
        int exercise = 0;

        Lab7 lab7 = new Lab7(); 
        while(exercise < 1 || exercise > 4)
        {
            exercise = Tools.getInt("Choose exercise (1-4): ");
        }

        switch(exercise)
        {
            case 1 -> lab7.bai1();
            case 2 -> lab7.bai2();
            case 3 -> lab7.bai3();
            case 4 -> lab7.bai4();
        }
    }

    private void bai1() 
    {
        PolyStudent sv = new PolyStudent();
        sv.setFullname("Nguyen Van Teo");
        //sv.career = Career.UDPM;
        sv.setCareer(Career.valueOf("UDPM"));
        
        sv.print();
    }
    
    private void bai2() 
    {
        JFrame sum = new Sum();
        sum.setVisible(true);
    }
    
    private void bai3() 
    {
        JFrame suDungMath = new SuDungMath();
        suDungMath.setVisible(true);
    }
    
    private void bai4() 
    {
        JFrame xPoly = new XPoly();
        xPoly.setVisible(true);
    }
}
