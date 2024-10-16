/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author truon
 */
public class demoslide6 extends Thread {
    
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
        demoslide6 t1 = new demoslide6();
        t1.start();
        demoslide6 t2 = new demoslide6();
        t2.start();
        
    }
    }

