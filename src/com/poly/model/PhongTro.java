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
public class PhongTro {
    private String MaPTro;
    private String MaKTro;
    private String TenPhong;
    private String DienTich;
    private String MoTa;

    public PhongTro() {
    }

    public PhongTro(String MaPTro, String MaKTro, String TenPhong, String DienTich, String MoTa) {
        this.MaPTro = MaPTro;
        this.MaKTro = MaKTro;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
        this.MoTa = MoTa;
    }

    public String getMaPTro() {
        return MaPTro;
    }

    public void setMaPTro(String MaPTro) {
        this.MaPTro = MaPTro;
    }

    public String getMaKTro() {
        return MaKTro;
    }

    public void setMaKTro(String MaKTro) {
        this.MaKTro = MaKTro;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public String getDienTich() {
        return DienTich;
    }

    public void setDienTich(String DienTich) {
        this.DienTich = DienTich;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
    
    
}
