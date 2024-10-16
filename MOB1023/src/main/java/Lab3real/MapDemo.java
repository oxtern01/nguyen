/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3real;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author truon
 */
public class MapDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Student sv1 = new Student();
        sv1.setName("tuan");
        sv1.setMajor("CNTT");
        sv1.setMarks(7.0);
        map.put(sv1.getName(), sv1);
        
        Student sv2 = new Student();
        sv2.setName("dung");
        sv2.setMajor("Đồ họa");
        sv2.setMarks(7.0);
        map.put(sv2.getName(), sv2);
        
        Student sv3 = new Student();
        sv3.setName("duy");
        sv3.setMajor("Marketing");
        sv3.setMarks(7.0);
        map.put(sv3.getName(), sv3);
        
        Set<String> keys = map.keySet();
        for(String name: keys)
        {
            Student sv = map.get(name);
            System.out.println(">ho va ten " + sv.getName());
            System.out.println(">hoc luc: " + sv.getGrade());
        }
    }
    
}
