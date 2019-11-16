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
public class KhachTro {

    private String MaKhachTro;
    private String MaNguoiQL;
    private String MaKhuTro;
    private String MaPhongTro;
    private String HoTen;
    private String Email;
    private int Sdt;
    private boolean GioiTinh;

    public KhachTro() {
    }

    public KhachTro(String MaKhachTro, String MaNguoiQL, String MaKhuTro, String MaPhongTro, String HoTen, String Email, int Sdt, boolean GioiTinh) {
        this.MaKhachTro = MaKhachTro;
        this.MaNguoiQL = MaNguoiQL;
        this.MaKhuTro = MaKhuTro;
        this.MaPhongTro = MaPhongTro;
        this.HoTen = HoTen;
        this.Email = Email;
        this.Sdt = Sdt;
        this.GioiTinh = GioiTinh;
    }

    public String getMaKhachTro() {
        return MaKhachTro;
    }

    public void setMaKhachTro(String MaKhachTro) {
        this.MaKhachTro = MaKhachTro;
    }

    public String getMaNguoiQL() {
        return MaNguoiQL;
    }

    public void setMaNguoiQL(String MaNguoiQL) {
        this.MaNguoiQL = MaNguoiQL;
    }

    public String getMaKhuTro() {
        return MaKhuTro;
    }

    public void setMaKhuTro(String MaKhuTro) {
        this.MaKhuTro = MaKhuTro;
    }

    public String getMaPhongTro() {
        return MaPhongTro;
    }

    public void setMaPhongTro(String MaPhongTro) {
        this.MaPhongTro = MaPhongTro;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getSdt() {
        return Sdt;
    }

    public void setSdt(int Sdt) {
        this.Sdt = Sdt;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
    
}
