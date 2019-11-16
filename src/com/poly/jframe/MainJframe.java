/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.jframe;

import com.poly.jdbc.DialogHelper;
import com.poly.jdbc.ShareHelper;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author TechCare
 */
public class MainJframe extends javax.swing.JFrame {

   
    int timerun = 0;

    public MainJframe() {
        initComponents();
        setLocationRelativeTo(null);
        time();
//        this.openWelcome();
//        this.openLogin();
    }
     public void time() {
        new Thread() {
            public void run() {
                while (timerun == 0) {
                    Calendar cal = new GregorianCalendar();
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR_OF_DAY);
                    int AM_PM = cal.get(Calendar.AM_PM);
                    String day_night = "";
                    if (AM_PM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    String str = hour + ":" + minute + ":" + second + " " + day_night;
                    lblDongHo.setText(str);
                }
            }
        }.start();
    }
//         void openLogin() {
//        new DangNhap(this, true).setVisible(true);
//    }
//
//    void openWelcome() {
//        new Welcome(this, true).setVisible(true);
//    }

//    void logoff() {
//        ShareHelper.logoff();
//        this.openLogin();
//    }

    void exit() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")) {
            System.exit(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator8 = new javax.swing.JSeparator();
        toolBar = new javax.swing.JToolBar();
        btnQuanLy = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btnKhachTro = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnKhuTro = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnPhongTro = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnHopDong = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnDangXuat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnThoat = new javax.swing.JButton();
        pnlTrangThai = new javax.swing.JPanel();
        lblNoiDung = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        toolBar.setRollover(true);

        btnQuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/QLy.png"))); // NOI18N
        btnQuanLy.setText("Quản Lý");
        btnQuanLy.setFocusable(false);
        btnQuanLy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuanLy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyActionPerformed(evt);
            }
        });
        toolBar.add(btnQuanLy);
        toolBar.add(jSeparator9);

        btnKhachTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KhachTro.png"))); // NOI18N
        btnKhachTro.setText("Khách Trọ");
        btnKhachTro.setFocusable(false);
        btnKhachTro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhachTro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhachTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachTroActionPerformed(evt);
            }
        });
        toolBar.add(btnKhachTro);
        toolBar.add(jSeparator6);

        btnKhuTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KhuTro.png"))); // NOI18N
        btnKhuTro.setText("Khu Trọ");
        btnKhuTro.setFocusable(false);
        btnKhuTro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhuTro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhuTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuTroActionPerformed(evt);
            }
        });
        toolBar.add(btnKhuTro);
        toolBar.add(jSeparator5);

        btnPhongTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PhongTro.png"))); // NOI18N
        btnPhongTro.setText("Phòng Trọ");
        btnPhongTro.setFocusable(false);
        btnPhongTro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPhongTro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPhongTro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongTroActionPerformed(evt);
            }
        });
        toolBar.add(btnPhongTro);
        toolBar.add(jSeparator3);

        btnHopDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hopDong.png"))); // NOI18N
        btnHopDong.setText("Hợp Đồng");
        btnHopDong.setFocusable(false);
        btnHopDong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHopDong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHopDongActionPerformed(evt);
            }
        });
        toolBar.add(btnHopDong);
        toolBar.add(jSeparator2);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DangXuat.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        toolBar.add(btnDangXuat);
        toolBar.add(jSeparator1);

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Out.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setFocusable(false);
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        toolBar.add(btnThoat);

        lblNoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.jpg"))); // NOI18N

        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Info.png"))); // NOI18N
        lblTrangThai.setText("Hệ quản lý nhà trọ");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Alarm.png"))); // NOI18N
        lblDongHo.setText("Time");

        javax.swing.GroupLayout pnlTrangThaiLayout = new javax.swing.GroupLayout(pnlTrangThai);
        pnlTrangThai.setLayout(pnlTrangThaiLayout);
        pnlTrangThaiLayout.setHorizontalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangThai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addContainerGap())
            .addComponent(lblNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        pnlTrangThaiLayout.setVerticalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addComponent(lblNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDongHo)
                    .addComponent(lblTrangThai)))
        );

        mnuHeThong.setText("Menu");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Key.png"))); // NOI18N
        mniDangNhap.setText("Đăng Nhập");
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mniDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mniDangNhapKeyPressed(evt);
            }
        });
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        mniDangXuat.setText("Đăng Xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator4);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Stop.png"))); // NOI18N
        mniKetThuc.setText("Kết Thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        jMenuBar1.add(mnuHeThong);

        mnuTroGiup.setText("Trợ Giúp");

        mniHuongDan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Globe.png"))); // NOI18N
        mniHuongDan.setText("Hướng Dẫn");
        mniHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongDanActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniHuongDan);
        mnuTroGiup.add(jSeparator7);

        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Brick house.png"))); // NOI18N
        mniGioiThieu.setText("Giới Thiệu");
        mniGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniGioiThieu);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mniDangNhapKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mniDangNhapKeyPressed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mniDangNhapActionPerformed

    private void btnKhachTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachTroActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnKhachTroActionPerformed

    private void mniHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongDanActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mniHuongDanActionPerformed

    private void btnKhuTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuTroActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnKhuTroActionPerformed

    private void btnQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnQuanLyActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    private void btnHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHopDongActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnHopDongActionPerformed

    private void btnPhongTroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongTroActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPhongTroActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    exit();
    }//GEN-LAST:event_btnThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHopDong;
    private javax.swing.JButton btnKhachTro;
    private javax.swing.JButton btnKhuTro;
    private javax.swing.JButton btnPhongTro;
    private javax.swing.JButton btnQuanLy;
    private javax.swing.JButton btnThoat;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblNoiDung;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JPanel pnlTrangThai;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
