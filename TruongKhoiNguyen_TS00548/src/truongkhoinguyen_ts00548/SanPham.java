/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truongkhoinguyen_ts00548;

/**
 *
 * @author truon
 */
public class SanPham {
    String MaSP;
    String TenSP;
    double Gia;

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public String getMaSP() {
        return MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public double getGia() {
        return Gia;
    }

    public SanPham(String MaSP, String TenSP, double Gia) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Gia = Gia;
    }

    public SanPham() {
    }
}
