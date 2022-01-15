package tubes_sda;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class form_barangU extends javax.swing.JFrame {
    
   public form_barangU() {
        initComponents();
        tampilkantabel();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        kembali = new javax.swing.JButton();
        cetak = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Form Inventaris Himatif");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 149, 30));

        kembali.setBackground(new java.awt.Color(5, 14, 24));
        kembali.setFont(new java.awt.Font("Aharoni", 0, 15)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("Keluar");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cetak.setBackground(new java.awt.Color(5, 14, 24));
        cetak.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        cetak.setForeground(new java.awt.Color(255, 255, 255));
        cetak.setText("Print");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        getContentPane().add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        cari.setBackground(new java.awt.Color(5, 14, 24));
        cari.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 30));

        jTable1.setAutoCreateRowSorter(true);
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
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusCycleRoot(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 570, 360));

        jButton1.setBackground(new java.awt.Color(5, 14, 24));
        jButton1.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Info Barang Rusak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/4trd.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        pack();
    }

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
      DefaultTableModel tabel = new DefaultTableModel(); 
      tabel.addColumn("No Barang");
      tabel.addColumn("Nama Barang");
      tabel.addColumn("Jumlah Barang");
      tabel.addColumn("Terbilang");
      tabel.addColumn("Keterangan"); 

        try{
        String sql =" SELECT * FROM `form_barang` WHERE `nama`like'%"+jTextField1.getText()+"%'";
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

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {
        new pilihanlogin().setVisible(true);
        dispose();
    }

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {
        MessageFormat atas = new MessageFormat("DATA INVENTARIS HIMATIF");
        MessageFormat bawah = new MessageFormat("TAHUN 2018/2019");
        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH, atas, bawah);
        }
        catch (java.awt.print.PrinterAbortException e){
        }
        catch(PrinterException ex) {
            Logger.getLogger(form_barangU.class.getName()).log(Level.SEVERE, null,ex);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       new form_brU().setVisible(true);
        dispose(); 
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_barangU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new form_barangU().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JButton cetak;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton kembali;
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
