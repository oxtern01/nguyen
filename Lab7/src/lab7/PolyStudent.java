/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author truon
 */
public class PolyStudent {
    public String fullname;
    public Career career;
    
    public void print(){
        System.out.println(">Fullname:"+ this.fullname);
    switch(this.career){
        case UDPM:
            System.out.println(">Career: Ung dung phan mem");
            break;
        case TKTW:
            System.out.println(">Career: thiet ke trang web");
            break;
        case LTDD: 
            System.out.println(">Career: Lap trinh di dong"); 
            break; 
        case TKDH: 
            System.out.println(">Career: thiet ke do hoa"); 
            break;    
    }
    }
    public static void main(String[] args) { 
PolyStudent sv = new PolyStudent(); 
sv.fullname = "Nguyễn Văn Tèo"; 
//sv.career = Career.UDPM; 
sv.career = Career.valueOf("UDPM"); 
sv.print(); 
} 
}
