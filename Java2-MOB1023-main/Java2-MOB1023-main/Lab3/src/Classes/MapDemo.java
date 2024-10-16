/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Classes;

import Models.Student;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author thnrg
 */
public class MapDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Student sv1 = new Student();
        sv1.setName("Tuấn");
        sv1.setMajor("CNTT");
        sv1.setMarks(7.0);
        map.put(sv1.getName(), sv1);
        
        Student sv2 = new Student();
        sv2.setName("Dũng");
        sv2.setMajor("Đồ họa");
        sv2.setMarks(7.0);
        map.put(sv2.getName(), sv2);
        
        Student sv3 = new Student();
        sv3.setName("Duy");
        sv3.setMajor("Marketing");
        sv3.setMarks(7.0);
        map.put(sv3.getName(), sv3);
        
        Set<String> keys = map.keySet();
        for(String name: keys)
        {
            Student sv = map.get(name);
            System.out.println(">Họ và tên " + sv.getName());
            System.out.println(">Học lực: " + sv.getGrade());
        }
    }
    
}
