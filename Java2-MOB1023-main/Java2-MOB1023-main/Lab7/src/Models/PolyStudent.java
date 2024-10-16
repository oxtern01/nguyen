/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Enums.Career;

/**
 *
 * @author thnrg
 */
public class PolyStudent {
    protected String fullname;
    protected Career career;
    
    public void print()
    {
        System.out.println(">Fullname: " + this.fullname);
        switch(this.career)
        {
            case UDPM -> System.out.println(">Career: Ung dung phan me");
            case TKTW -> System.out.println(">Career: Thiet ke trang web");
            case LTDD -> System.out.println(">Career: Lap trinh di dong");
            case TKDH -> System.out.println(">Career: Thiet ke do hoa");
        }
    }

    public PolyStudent(String fullname, Career career) {
        this.fullname = fullname;
        this.career = career;
    }

    public PolyStudent() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }
    
    
}
