/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.model;

import java.util.Date;

/**
 *
 * @author Welcome
 */
public class HopDong {
    private String MaHD;
    private String MaKtro;
    private Date NgayTao;
    private Date NgayTra;
    private String MaNguoiQL;

    public HopDong() {
    }

    public HopDong(String MaHD, String MaKtro, Date NgayTao, Date NgayTra, String MaNguoiQL) {
        this.MaHD = MaHD;
        this.MaKtro = MaKtro;
        this.NgayTao = NgayTao;
        this.NgayTra = NgayTra;
        this.MaNguoiQL = MaNguoiQL;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaKtro() {
        return MaKtro;
    }

    public void setMaKtro(String MaKtro) {
        this.MaKtro = MaKtro;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getMaNguoiQL() {
        return MaNguoiQL;
    }

    public void setMaNguoiQL(String MaNguoiQL) {
        this.MaNguoiQL = MaNguoiQL;
    }
    
    
}
