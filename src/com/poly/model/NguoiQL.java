/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.model;

/**
 *
 * @author Welcome
 */
public class NguoiQL {
    private String MaNguoiQL;
    private String TaiKhoan;
    private String MatKhau;
    private String HoTen;
    private String VaiTro;

    public NguoiQL() {
    }

    public NguoiQL(String MaNguoiQL, String TaiKhoan, String MatKhau, String HoTen, String VaiTro) {
        this.MaNguoiQL = MaNguoiQL;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.VaiTro = VaiTro;
    }

    public String getMaNguoiQL() {
        return MaNguoiQL;
    }

    public void setMaNguoiQL(String MaNguoiQL) {
        this.MaNguoiQL = MaNguoiQL;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }
   
    
    
}

