/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Comparator;

/**
 *
 * @author thnrg
 */
public class Student {
    protected String name;
    protected double marks;
    protected String major;

    public Student(String name, double marks, String major) {
        this.name = name;
        this.marks = marks;
        this.major = major;
    }

    public Student() {
    }
    
    public String getGrade(){
        if(this.marks < 3)
        {
            return "Kém";
        }
        if(this.marks < 5)
        {
            return "Yếu";
        }
        if(this.marks < 6.5)
        {
            return "Trung bình";
        }
        if(this.marks < 7.5)
        {
            return "Khá";
        }
        if(this.marks < 9)
        {
            return "Giỏi";
        }
        return "Xuất sắc";
    }
        
    public boolean isBonus()
    {
        return this.marks >= 7.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public static Comparator<Student> byName = (Student o1, Student o2) -> {
        return o1.getName().compareTo(o2.getName());
    };
    
    public static Comparator<Student> byMarks = (Student o1, Student o2) -> {
        return Double.compare(o2.getMarks(), o1.getMarks());
    };
}
