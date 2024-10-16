/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

/**
 *
 * @author thnrg
 */
public class Demo2Runnable implements Runnable{
    @Override
    public void run()
    {
        for(int i = 0; true; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                break;
            }
        }
    }
}
