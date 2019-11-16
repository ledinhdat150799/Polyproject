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
public class KhuTro {
    private String MaKhuTro;
    private String TenKTro;
    private String DiaChi;
    private int SLPhong;
    private double giaKhuTro;

    public KhuTro() {
    }

    public KhuTro(String MaKhuTro, String TenKTro, String DiaChi, int SLPhong, double giaKhuTro) {
        this.MaKhuTro = MaKhuTro;
        this.TenKTro = TenKTro;
        this.DiaChi = DiaChi;
        this.SLPhong = SLPhong;
        this.giaKhuTro = giaKhuTro;
    }

    public String getMaKhuTro() {
        return MaKhuTro;
    }

    public void setMaKhuTro(String MaKhuTro) {
        this.MaKhuTro = MaKhuTro;
    }

    public String getTenKTro() {
        return TenKTro;
    }

    public void setTenKTro(String TenKTro) {
        this.TenKTro = TenKTro;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSLPhong() {
        return SLPhong;
    }

    public void setSLPhong(int SLPhong) {
        this.SLPhong = SLPhong;
    }

    public double getGiaKhuTro() {
        return giaKhuTro;
    }

    public void setGiaKhuTro(double giaKhuTro) {
        this.giaKhuTro = giaKhuTro;
    }
    
    
}
