/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author truon
 */
public class XFileDemo {
    public static void main(String[] args) { 
 byte[] data = XFile.read("c:/temp/a.gif"); 
 XFile.write("c:/temp/b.gif", data); 
} 
    
    
}
