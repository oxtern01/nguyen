/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truon
 */
public class main {
    public static void main(String[] args){
       List<Student> list = new ArrayList<>(); 
list.add(new Student("Tuấn", 5, "CNTT")); 
list.add(new Student("Cường", 7.5, "TKTW")); 
list.add(new Student("Hạnh", 8.5, "CNTT")); 
 
XFile.writeObject("c:/temp/students.dat", list);
List<Student> list2 =  
(List<Student>) XFile.readObject("c:/temp/students.dat"); 
for(Student sv : list){ 
System.out.println(">Họ và tên: " + sv.name); 
} 
   }
}
