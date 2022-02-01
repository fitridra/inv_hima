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

public class from_barangA extends javax.swing.JFrame {
    
    public from_barangA() {
        initComponents();
        kosongkan();
        tampilkantabel();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Form Inventaris Himatif");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 10));
        jLabel2.setText("No Barang ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 10));
        jLabel3.setText("Nama Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 10));
        jLabel4.setText("Jumlah Barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 10));
        jLabel5.setText("Terbilang");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 48, 141, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 73, 141, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 99, 141, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 125, 141, -1));

        tambah.setBackground(new java.awt.Color(5, 14, 24));
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        hapus.setBackground(new java.awt.Color(5, 14, 24));
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("Hapus");
        hapus.setMaximumSize(new java.awt.Dimension(71, 23));
        hapus.setMinimumSize(new java.awt.Dimension(71, 23));
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        cari.setBackground(new java.awt.Color(5, 14, 24));
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("Cari");
        cari.setMaximumSize(new java.awt.Dimension(71, 23));
        cari.setMinimumSize(new java.awt.Dimension(71, 23));
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        kembali.setBackground(new java.awt.Color(5, 14, 24));
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("Keluar");
        kembali.setMaximumSize(new java.awt.Dimension(71, 23));
        kembali.setMinimumSize(new java.awt.Dimension(71, 23));
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 1040));
        jTable1.setMinimumSize(new java.awt.Dimension(60, 1040));
        jTable1.setName(""); // NOI18N
        jTable1.setPreferredSize(new java.awt.Dimension(300, 1040));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 226, 590, 270));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 131, -1));

        edit.setBackground(new java.awt.Color(5, 14, 24));
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        Print.setBackground(new java.awt.Color(5, 14, 24));
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        getContentPane().add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 10));
        jLabel6.setText("Keterangan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, -1, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 151, 141, -1));

        reset.setBackground(new java.awt.Color(5, 14, 24));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Refresh");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jButton1.setBackground(new java.awt.Color(5, 14, 24));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Info Barang Rusak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/4trd.jpg")));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }

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
    
    private void cariActionPerformed(java.awt.event.ActionEvent evt) {
      //tombol cari
      DefaultTableModel tabel = new DefaultTableModel(); 
      tabel.addColumn("No Barang");
      tabel.addColumn("Nama Barang");
      tabel.addColumn("Jumlah Barang");
      tabel.addColumn("Terbilang");
      tabel.addColumn("Keterangan"); 

        try{
        String sql =" SELECT * FROM `form_barang` WHERE `nama`like'%"+jTextField5.getText()+"%'";
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
    }

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {
        //tombol tambah
        try {
            String sql = "INSERT INTO form_barang VALUES ('"+jTextField1.getText()+"','"
                    +jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"
                    +jTextField6.getText()+"')";
            java.sql.Connection connect=(Connection)conn.getConnection();
            java.sql.PreparedStatement pst=connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "BERHASIL DISIMPAN");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    tampilkantabel();
    }

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {
        //tombol delete
        try {
            String sql ="DELETE FROM `form_barang` WHERE `no`="+jTextField1.getText();
            executeSQLQuery(sql,"BERHASIL DI HAPUS");
            tampilkantabel();
        } catch (SQLException ex) {
            Logger.getLogger(from_barangA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {
    //tombol keluar
        new pilihanlogin().setVisible(true);
        dispose();
    }

    private void editActionPerformed(java.awt.event.ActionEvent evt) {
     //tombol edit
        try {
            String sql ="UPDATE `form_barang` SET `nama`='"+jTextField2.getText()+"',`jumlah`='"
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
    }

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
     //print
        MessageFormat atas = new MessageFormat("DAFTAR INVENTARIS HIMATIF");
        MessageFormat bawah = new MessageFormat("TAHUN 2018/2019");
        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH, atas, bawah);
        }
        catch (java.awt.print.PrinterAbortException e){
        }
        catch(PrinterException ex) {
            Logger.getLogger(from_barangA.class.getName()).log(Level.SEVERE, null,ex);
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
        jTextField6.setText(ket);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded

    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        kosongkan();
    }//GEN-LAST:event_resetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new form_brA().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
         
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception{
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(from_barangA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new from_barangA().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print;
    private javax.swing.JButton cari;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JButton reset;
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
            String sql = "select * from form_barang";
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
