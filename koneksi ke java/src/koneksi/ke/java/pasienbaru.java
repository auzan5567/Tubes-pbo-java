/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi.ke.java;

import javax.swing.JOptionPane;

/**
 *
 * @author tosiba
 */
public class pasienbaru extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public pasienbaru() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nama_pasien = new javax.swing.JTextField();
        tb = new javax.swing.JTextField();
        bb = new javax.swing.JTextField();
        goldar = new javax.swing.JTextField();
        umur = new javax.swing.JTextField();
        alg_obat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        keluhan = new javax.swing.JTextArea();
        id_pasien = new javax.swing.JTextField();
        Daftar_yoehh_pasien = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        daftarpasien = new javax.swing.JMenuItem();
        daftarobat = new javax.swing.JMenuItem();
        halamanutama = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        nama_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_pasienActionPerformed(evt);
            }
        });
        getContentPane().add(nama_pasien);
        nama_pasien.setBounds(530, 130, 170, 30);
        getContentPane().add(tb);
        tb.setBounds(530, 360, 170, 30);
        getContentPane().add(bb);
        bb.setBounds(530, 440, 170, 30);
        getContentPane().add(goldar);
        goldar.setBounds(530, 270, 170, 30);
        getContentPane().add(umur);
        umur.setBounds(530, 190, 170, 30);

        alg_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alg_obatActionPerformed(evt);
            }
        });
        getContentPane().add(alg_obat);
        alg_obat.setBounds(530, 530, 170, 30);

        keluhan.setColumns(20);
        keluhan.setRows(5);
        jScrollPane1.setViewportView(keluhan);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(980, 130, 200, 150);

        id_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pasienActionPerformed(evt);
            }
        });
        getContentPane().add(id_pasien);
        id_pasien.setBounds(980, 90, 200, 20);

        Daftar_yoehh_pasien.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        Daftar_yoehh_pasien.setText("Daftar");
        Daftar_yoehh_pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Daftar_yoehh_pasienMouseClicked(evt);
            }
        });
        getContentPane().add(Daftar_yoehh_pasien);
        Daftar_yoehh_pasien.setBounds(1050, 340, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\tosiba\\Desktop\\Files\\Tubes PBO\\pasbar3.jpg")); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1330, 680);

        jMenu4.setText("Go To");

        daftarpasien.setText("Daftar Pasien");
        daftarpasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarpasienActionPerformed(evt);
            }
        });
        jMenu4.add(daftarpasien);

        daftarobat.setText("Daftar Obat");
        daftarobat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarobatActionPerformed(evt);
            }
        });
        jMenu4.add(daftarobat);

        halamanutama.setText("Halaman Utama");
        halamanutama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halamanutamaActionPerformed(evt);
            }
        });
        jMenu4.add(halamanutama);

        jMenuBar2.add(jMenu4);
        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alg_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alg_obatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alg_obatActionPerformed

    private void daftarpasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarpasienActionPerformed
        // TODO add your handling code here:
        dispose();
        pasienlama ganti=new pasienlama();
        ganti.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_daftarpasienActionPerformed

    private void halamanutamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halamanutamaActionPerformed
        // TODO add your handling code here:
        dispose();
        view home=new view();
        home.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_halamanutamaActionPerformed

    private void daftarobatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarobatActionPerformed
        // TODO add your handling code here:
        dispose();
        obat ngobat=new obat();
        ngobat.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_daftarobatActionPerformed

    private void nama_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_pasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_pasienActionPerformed

    private void id_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pasienActionPerformed

    private void Daftar_yoehh_pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Daftar_yoehh_pasienMouseClicked
        // TODO add your handling code here:
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Untuk Update Record ini???","Confirmation",JOptionPane.YES_NO_OPTION);
        if(ok==0){
            KoneksiKeJava konek=new KoneksiKeJava();
            konek.tambahpasien(nama_pasien.getText(), goldar.getText(), bb.getText(), tb.getText(), keluhan.getText(), alg_obat.getText(), Integer.parseInt(umur.getText()), id_pasien.getText());
            JOptionPane.showMessageDialog(null, "Tambah Pasien Berhasiel");
        }
        else {
            //nothing
        }
    }//GEN-LAST:event_Daftar_yoehh_pasienMouseClicked

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
            java.util.logging.Logger.getLogger(pasienbaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pasienbaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pasienbaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pasienbaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pasienbaru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Daftar_yoehh_pasien;
    private javax.swing.JTextField alg_obat;
    private javax.swing.JTextField bb;
    private javax.swing.JMenuItem daftarobat;
    private javax.swing.JMenuItem daftarpasien;
    private javax.swing.JTextField goldar;
    private javax.swing.JMenuItem halamanutama;
    private javax.swing.JTextField id_pasien;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea keluhan;
    private javax.swing.JTextField nama_pasien;
    private javax.swing.JTextField tb;
    private javax.swing.JTextField umur;
    // End of variables declaration//GEN-END:variables
}
