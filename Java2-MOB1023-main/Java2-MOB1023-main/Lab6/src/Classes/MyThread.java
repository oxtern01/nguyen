/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thnrg
 */
public class MyThread implements Runnable
{
    
    @Override
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException ex) 
            {
            }
            System.out.println(i + 1);
        } 
    }
}
