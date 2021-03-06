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

public class form_brU extends javax.swing.JFrame {

public form_brU() {
        initComponents();
        tampilkantabel();
        this.setLocationRelativeTo(null);
    }
     
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        kembali = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        print = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali.setBackground(new java.awt.Color(5, 14, 24));
        kembali.setFont(new java.awt.Font("Aharoni", 0, 18));
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, -1));

        keluar.setBackground(new java.awt.Color(5, 14, 24));
        keluar.setFont(new java.awt.Font("Aharoni", 0, 15)); 
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        print.setBackground(new java.awt.Color(5, 14, 24));
        print.setFont(new java.awt.Font("Aharoni", 0, 18));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        cari.setBackground(new java.awt.Color(5, 14, 24));
        cari.setFont(new java.awt.Font("Aharoni", 0, 18)); 
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Informasi Barang Rusak");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 0, -1, -1));

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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, 589, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/4trd.jpg")));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {
        new form_barangU().setVisible(true);
        dispose();
    }

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {
        new pilihanlogin().setVisible(true);
        dispose();
    }

    private void printActionPerformed(java.awt.event.ActionEvent evt) {
        MessageFormat atas = new MessageFormat("INFORMASI BARANG RUSAK HIMATIF");
        MessageFormat bawah = new MessageFormat("TAHUN 2018/2019");
        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH, atas, bawah);
        }
        catch (java.awt.print.PrinterAbortException e){
        }
        catch(PrinterException ex) {
            Logger.getLogger(form_brU.class.getName()).log(Level.SEVERE, null,ex);
        }
    }

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel tabel = new DefaultTableModel(); 
      tabel.addColumn("No Barang");
      tabel.addColumn("Nama Barang");
      tabel.addColumn("Jumlah Barang");
      tabel.addColumn("Terbilang");
      tabel.addColumn("Keterangan"); 

        try{
        String sql =" SELECT * FROM `form_br` WHERE `nama`like'%"+jTextField1.getText()+"%'";
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
        
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_brU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new form_brU().setVisible(true);
        });
    }

    private javax.swing.JButton cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton kembali;
    private javax.swing.JButton print;

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
