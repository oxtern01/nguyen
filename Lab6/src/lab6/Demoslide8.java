/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author truon
 */
public class Demoslide8 implements Runnable{
    @Override
    public void run(){
        for(int i = 0;true; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            break;
            }
        }
    }
    
    public static void main (String[] args){
        Thread t1 = new Thread(new Demoslide8());
        t1.start();
        Thread t2 = new Thread(new Demoslide8());
        t2.start();
        
    }
}
    
