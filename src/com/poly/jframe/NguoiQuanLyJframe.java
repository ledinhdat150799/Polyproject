/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.jframe;



import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NguoiQuanLyJframe extends javax.swing.JFrame {
  //  private NhanVienDAO dao = new NhanVienDAO();
    

    public NguoiQuanLyJframe() {
        initComponents();
        setLocationRelativeTo(null);
       /* can sua lai
        setIconImage(ShareHelper.APP_ICON);
        init();
        this.load();
        this.setStatus(true);
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCapNhat = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaQL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdTruongPhong = new javax.swing.JRadioButton();
        rdNhanVien = new javax.swing.JRadioButton();
        pwXacNhanMatKhau = new javax.swing.JPasswordField();
        txtMatKhau = new javax.swing.JPasswordField();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ TÀI KHOẢN");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã quản lý :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mật Khẩu :");

        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel3.add(btnInsert);

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate);

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);

        btnClear.setText("Mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel4.add(btnFirst);

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel4.add(btnPrev);

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel4.add(btnNext);

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel4.add(btnLast);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Xác nhận mật khẩu :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Họ và Tên :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Vai trò :");

        buttonGroup1.add(rdTruongPhong);
        rdTruongPhong.setText("quản lý");

        buttonGroup1.add(rdNhanVien);
        rdNhanVien.setText("Khách trọ");

        javax.swing.GroupLayout pnlCapNhatLayout = new javax.swing.GroupLayout(pnlCapNhat);
        pnlCapNhat.setLayout(pnlCapNhatLayout);
        pnlCapNhatLayout.setHorizontalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCapNhatLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(txtMaQL, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                                .addComponent(txtMatKhau)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCapNhatLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwXacNhanMatKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                    .addComponent(rdTruongPhong)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdNhanVien))
                                .addComponent(jLabel6))))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlCapNhatLayout.setVerticalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaQL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(pwXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdTruongPhong)
                    .addComponent(rdNhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CẬP NHẬT", pnlCapNhat);

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã QLy", "Mật khẩu", "Họ Và Tên ", "Vai Trò"
            }
        ));
        tblGridView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGridView);

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DANH SÁCH", pnlDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
       
      //  insert();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
      //  update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      
       // delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       
//        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblGridViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridViewMouseClicked
       
/*        if(evt.getClickCount() ==1){ 
            this.index = tblGridView.rowAtPoint(evt.getPoint()); 
            if (this.index >= 0) { 
                this.edit(); 
                jTabbedPane1.setSelectedIndex(0); 
            } 
} */
    }//GEN-LAST:event_tblGridViewMouseClicked

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        
//        this.index = 0;
//        this.edit();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
       
//        this.index--;
//        this.edit();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
      
//        this.index++;
//        this.edit();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
     
//        this.index = tblGridView.getRowCount() -1;
//        this.edit();
    }//GEN-LAST:event_btnLastActionPerformed

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
            java.util.logging.Logger.getLogger(NguoiQuanLyJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NguoiQuanLyJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NguoiQuanLyJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NguoiQuanLyJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NguoiQuanLyJframe().setVisible(true);
               
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JPasswordField pwXacNhanMatKhau;
    private javax.swing.JRadioButton rdNhanVien;
    private javax.swing.JRadioButton rdTruongPhong;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMaQL;
    private javax.swing.JPasswordField txtMatKhau;
    // End of variables declaration//GEN-END:variables
    int index = 0;

    void init() {

        setLocationRelativeTo(null);
    }

/**    void load() {
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        model.setRowCount(0);
        try {
            List<Nhanvien> list = dao.select();
            for (Nhanvien nv : list) {
                Object[] row = {
                    nv.getMaNV(),
                    nv.getMatKhau(),
                    nv.getHoTen(),
                    nv.isVaiTro() ? "Trưởng phòng" : "Nhân viên"};
                model.addRow(row);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void insert() {
        if (isNotEnough() || isNotValid()) {
            return;
        }
        Nhanvien model = getModel();

        String confirm = new String(pwXacNhanMatKhau.getPassword());
        if (confirm.equals(model.getMatKhau())) {
            try {
                dao.insert(model);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Thêm mới thất bại!");
            }
        } else {
            DialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
        }
    }

    void update() {
        Nhanvien model = getModel();

        String confirm = new String(pwXacNhanMatKhau.getPassword());
        if (!confirm.equals(model.getMatKhau())) {
            DialogHelper.alert(this, "Xác nhận mật khẩu không đúng!");
        } else {
            try {
                dao.update(model);
                this.load();
                DialogHelper.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Cập nhật thất bại!");
            }
        }

    }

    void delete() {
        if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")) {
            String manv = txtMaNV.getText();
            try {
                dao.Delete(manv);
                this.load();
                this.clear();
                DialogHelper.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Xóa thất bại!");
            }
        }
    }

    void edit() {
        try {
            String manv = (String) tblGridView.getValueAt(this.index, 0);
            Nhanvien model = dao.findById(manv);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void clear() {
        this.setModel(new Nhanvien());
        this.setStatus(true);
    }

    void setModel(Nhanvien model) {
        txtMaNV.setText(model.getMaNV());
        txtHoVaTen.setText(model.getHoTen());
        txtMatKhau.setText(model.getMatKhau());
        pwXacNhanMatKhau.setText(model.getMatKhau());
        rdTruongPhong.setSelected(model.isVaiTro());
        rdNhanVien.setSelected(!model.isVaiTro());
    }

    Nhanvien getModel() {
        Nhanvien model = new Nhanvien();
        model.setMaNV(txtMaNV.getText());
        model.setHoTen(txtHoVaTen.getText());
        model.setMatKhau(new String(pwXacNhanMatKhau.getPassword()));
        model.setVaiTro(rdTruongPhong.isSelected());
        return model;
        //tra ve bang Nhanvien
    }

    void setStatus(boolean insertable) {
        txtMaNV.setEditable(insertable);
        btnInsert.setEnabled(insertable);
        btnUpdate.setEnabled(!insertable);
        btnDelete.setEnabled(!insertable);

        boolean first = this.index > 0;
        boolean last = this.index < tblGridView.getRowCount() - 1;
        btnFirst.setEnabled(!insertable && first);
        btnPrev.setEnabled(!insertable && first);
        btnNext.setEnabled(!insertable && last);
        btnLast.setEnabled(!insertable && last);
    }

    public boolean isNotName() {
        if (txtHoVaTen.getText().trim().matches(".*\\d+.*") == true) {
            JOptionPane.showMessageDialog(this, "Tên không được chứa chữ số nào");
            return true;
        }
        return false;
    }

    public boolean isNotID() {
        if (txtMaNV.getText().trim().matches("^(NV)[0-9]{1,}") == false) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên phải theo cú pháp: NV...\n... có thể thay bằng số từ 0 đến 9");
            return true;
        }
        return false;
    }

    public boolean isNotXNMK() {
        if (pwXacNhanMatKhau.getText() != txtMatKhau.getText()) {
            DialogHelper.alert(this, "mật khẩu không khớp");

        }
        return false;
    }

    public boolean isNotEnoughName() {
        // ****************************************************************************************************
        // 1 - we check if user does not input ID
        if (txtHoVaTen.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên Nhân không được trống");
            txtHoVaTen.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        txtHoVaTen.setBorder(BorderFactory.createLineBorder(null, 1));

        return false;
    }

    public boolean isNotEnough() {
        // ****************************************************************************************************
        // 1 - we check if user does not input ID
        if (isNotEnoughID()) {
            txtMaNV.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        txtMaNV.setBorder(BorderFactory.createLineBorder(null, 0));
//        
//         ***********************************
//         
        if (isNotEnoughMK()) {
            txtMatKhau.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        txtMatKhau.setBorder(BorderFactory.createLineBorder(null, 0));
//        
//         * ***********************************
//         
        if (isNotEnoughXNMK()) {
            pwXacNhanMatKhau.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        pwXacNhanMatKhau.setBorder(BorderFactory.createLineBorder(null, 0));
        
   //      * ***********************************
       
        if (isNotEnoughName()) {
            txtHoVaTen.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        txtHoVaTen.setBorder(BorderFactory.createLineBorder(null, 0));

        return false;
    }

    public boolean isNotEnoughID() {
        // ****************************************************************************************************
        // 1 - we check if user does not input ID
        if (txtMaNV.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã Nhân không được trống");
            txtMaNV.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        txtMaNV.setBorder(BorderFactory.createLineBorder(null, 1));

        return false;
    }

    public boolean isNotEnoughMK() {
        // ****************************************************************************************************
        // 1 - we check if user does not input ID
        if (txtMatKhau.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được trống");
            txtMatKhau.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        txtMatKhau.setBorder(BorderFactory.createLineBorder(null, 1));

        return false;
    }

    public boolean isNotEnoughXNMK() {
        // ****************************************************************************************************
        // 1 - we check if user does not input ID
        if (pwXacNhanMatKhau.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, " Mật Khẩu xác nhận không được trống");
            pwXacNhanMatKhau.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        pwXacNhanMatKhau.setBorder(BorderFactory.createLineBorder(null, 1));

        return false;
    }

    public boolean isNotValid() {
        if (isNotID()) {
            txtMaNV.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        txtMaNV.setBorder(BorderFactory.createLineBorder(null, 0));

        if (isNotName()) {
            txtHoVaTen.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        txtHoVaTen.setBorder(BorderFactory.createLineBorder(null, 0));

        if (isNotXNMK()) {
            pwXacNhanMatKhau.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return true;
        }
        pwXacNhanMatKhau.setBorder(BorderFactory.createLineBorder(null, 0));

        return false;
    } 
*/
}