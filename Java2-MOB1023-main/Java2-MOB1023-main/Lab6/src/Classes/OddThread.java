/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author thnrg
 */
public class OddThread extends Thread
{
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            try
            {
                System.out.println(i * 2 + 1);
                Thread.sleep(10);
            }
            catch(InterruptedException ex)
            {
                break;
            }
        }
    }
}
