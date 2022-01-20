package tubes_sda;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static tubes_sda.conn.getConnection;

public class form_brA extends javax.swing.JFrame {

    public form_brA() {
        initComponents();
        kosongkan();
        tampilkantabel();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Keluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        print = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Informasi Barang Rusak");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 0, -1, -1));

        Keluar.setBackground(new java.awt.Color(5, 14, 24));
        Keluar.setForeground(new java.awt.Color(255, 255, 255));
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("No Barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nama Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Jumlah Barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Terbilang");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 127, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Keterangan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 153, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 46, 140, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 72, 140, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 98, 140, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 124, 140, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 150, 140, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 44, 140, -1));

        cari.setBackground(new java.awt.Color(5, 14, 24));
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 43, -1, -1));

        tambah.setBackground(new java.awt.Color(5, 14, 24));
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 181, -1, -1));

        hapus.setBackground(new java.awt.Color(5, 14, 24));
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 181, -1, -1));

        Edit.setBackground(new java.awt.Color(5, 14, 24));
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        getContentPane().add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 181, -1, -1));

        print.setBackground(new java.awt.Color(5, 14, 24));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 181, -1, -1));

        refresh.setBackground(new java.awt.Color(5, 14, 24));
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 181, -1, -1));

        kembali.setBackground(new java.awt.Color(5, 14, 24));
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 181, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No Barang", "Nama Barang", "Jumlah Barang", "Terbilang", "Keterangan"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 215, 600, 280));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/4trd.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void kosongkan(){
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
    }
    
    public void executeSQLQuery(String query,String pesan) throws SQLException
    {
        Connection conn = getConnection();
        Statement st;
        try{
            st = conn.createStatement();
            if ((st.executeUpdate(query))==1)
            {
                DefaultTableModel tabel = (DefaultTableModel) jTable1.getModel();
                tabel.setRowCount(0);
                
            
            JOptionPane.showMessageDialog(null,"DATA "+pesan);
        }else{
                JOptionPane.showMessageDialog(null,"DATA "+pesan);
                }
        }catch(SQLException e){
        }
    }
    
    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        //tombol cari
      DefaultTableModel tabel = new DefaultTableModel(); 
      tabel.addColumn("No Barang");
      tabel.addColumn("Nama Barang");
      tabel.addColumn("Jumlah Barang");
      tabel.addColumn("Terbilang");
      tabel.addColumn("Keterangan"); 

        try{
        String sql =" SELECT * FROM `form_br` WHERE `nama`like'%"+jTextField6.getText()+"%'";
            java.sql.Connection connect=(Connection)conn.getConnection();
            java.sql.Statement stm=connect.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                tabel.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),
                res.getString(5)});
            }
            jTable1.setModel(tabel);
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cariActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        //tombol tambah
        try {
            String sql = "INSERT INTO form_br VALUES ('"+jTextField1.getText()+"','"
                    +jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"
                    +jTextField5.getText()+"')";
            java.sql.Connection connect=(Connection)conn.getConnection();
            java.sql.PreparedStatement pst=connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "BERHASIL DISIMPAN");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    tampilkantabel();
    }//GEN-LAST:event_tambahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
      //tombol delete
        try {
            String sql ="DELETE FROM `form_br` WHERE `no`="+jTextField1.getText();
            executeSQLQuery(sql,"BERHASIL DI HAPUS");
            tampilkantabel();
        } catch (SQLException ex) {
            Logger.getLogger(from_barangA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
       //tombol edit
        try {
            String sql ="UPDATE `form_br` SET `nama`='"+jTextField2.getText()+"',`jumlah`='"
                    +jTextField3.getText()+"',`terbilang`='"+jTextField4.getText()+"',`keterangan`='"
                    +jTextField6.getText()+"' WHERE `no`='"+jTextField1.getText()+"'";
            java.sql.Connection connect=(Connection)conn.getConnection();
            java.sql.PreparedStatement pst=connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "BERHASIL DI UBAH");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "YANG DI UBAH"+e.getMessage());
        }
        tampilkantabel();
        kosongkan();
    }//GEN-LAST:event_EditActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        //print
        MessageFormat atas = new MessageFormat("INFORMASI BARANG RUSAK HIMATIF");
        MessageFormat bawah = new MessageFormat("TAHUN 2018/2019");
        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH, atas, bawah);
        }
        catch (java.awt.print.PrinterAbortException e){
        }
        catch(PrinterException ex) {
            Logger.getLogger(form_brA.class.getName()).log(Level.SEVERE, null,ex);
        }
    }//GEN-LAST:event_printActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        kosongkan();
    }//GEN-LAST:event_refreshActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        new from_barangA().setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
       new pilihanlogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       //tabel
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String no =jTable1.getValueAt(baris, 0).toString();
        jTextField1.setText(no);
        String nama = jTable1.getValueAt(baris,1).toString();
        jTextField2.setText(nama);
        String jumlah=jTable1.getValueAt(baris, 2).toString();
        jTextField3.setText(jumlah);
        String terb = jTable1.getValueAt(baris, 3).toString();
        jTextField4.setText(terb);
        String ket = jTable1.getValueAt(baris, 4).toString();
        jTextField5.setText(ket);
    }//GEN-LAST:event_jTable1MouseClicked
    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_brA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new form_brA().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton cari;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton kembali;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables

private void tampilkantabel(){
        // membuat tampilan model tabel
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("No Barang");
        tabel.addColumn("Nama Barang");
        tabel.addColumn("Jumlah Barang");
        tabel.addColumn("Terbilang");
        tabel.addColumn("Keterangan");
       
        
        //menampilkan data database kedalam tabel
        try {
            String sql = "select * from form_br";
            java.sql.Connection connect=(Connection)conn.getConnection();
            java.sql.Statement stm=connect.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                tabel.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),
                res.getString(5)});
            }
            jTable1.setModel(tabel);
        } catch (SQLException e) {
        }
}
}
