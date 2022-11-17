/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.copadomundo;

import javax.swing.ImageIcon;

/**
 *
 * @author dell
 */
public class MenuUsuarioComum extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuUsuarioComum() {
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        Grupo = new javax.swing.JButton();
        Times = new javax.swing.JButton();
        NomeUsuario = new javax.swing.JLabel();
        TipoUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Grupos = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Grupo.setText("Grupo");
        Grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrupoActionPerformed(evt);
            }
        });
        getContentPane().add(Grupo);
        Grupo.setBounds(220, 190, 93, 60);

        Times.setText("Times");
        Times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimesActionPerformed(evt);
            }
        });
        getContentPane().add(Times);
        Times.setBounds(120, 190, 93, 60);

        NomeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        NomeUsuario.setText("Nome:");
        getContentPane().add(NomeUsuario);
        NomeUsuario.setBounds(6, 12, 50, 20);

        TipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TipoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TipoUsuario.setText("Tipo de usuario:");
        getContentPane().add(TipoUsuario);
        TipoUsuario.setBounds(190, 10, 120, 20);

        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 10, 130, 22);

        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(300, 10, 130, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Trofeu-copa.jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 50, 100, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cad-Usuario.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 440, 640);

        Grupos.setText("File");

        jMenu3.setText("Grupos");
        Grupos.add(jMenu3);

        jMenu6.setText("Escalação");
        Grupos.add(jMenu6);

        jMenuBar1.add(Grupos);

        jMenu1.setText("Help");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GrupoActionPerformed

    private void TimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuarioComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarioComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarioComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuarioComum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuarioComum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Grupo;
    private javax.swing.JMenu Grupos;
    private javax.swing.JLabel NomeUsuario;
    private javax.swing.JButton Times;
    private javax.swing.JLabel TipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables

    private void jpg() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
