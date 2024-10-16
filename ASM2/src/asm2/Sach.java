/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2;

/**
 *
 * @author truon
 */
public class Sach {
    double MaSach;
    String TenSach;
    double Gia;

    

    public void setMaSach(double MaSach) {
        this.MaSach = MaSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public double getMaSach() {
        return MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public double getGia() {
        return Gia;
    }

    public Sach(double MaSach, String TenSach, double Gia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.Gia = Gia;
    }

    public Sach() {
    }
    
    
}
