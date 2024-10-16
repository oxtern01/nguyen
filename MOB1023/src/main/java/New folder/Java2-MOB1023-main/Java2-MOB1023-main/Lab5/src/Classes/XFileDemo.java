/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Classes;

import Utils.*;
import java.io.IOException;
/**
 *
 * @author thnrg
 */
public class XFileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[] data = XFile.read("src/Files/a.gif");
        XFile.write("src/Files/b.gif", data);
    }
    
}
