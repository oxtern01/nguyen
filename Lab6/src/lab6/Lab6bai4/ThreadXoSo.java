/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.Lab6bai4;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author truon
 */
public class ThreadXoSo implements Runnable {

    private JTextField jTextField;

    public ThreadXoSo(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    @Override
    public void run() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        float ran = (float) Math.random() * 10;
                        int random = (int) ran;
                        Thread.sleep(10);
                        jTextField.setText("" + random);
                    } catch (Exception e) {
                    }
                }
            }
        });
        t1.start();
    }
}