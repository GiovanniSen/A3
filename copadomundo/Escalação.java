/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.copadomundo;

/**
 *
 * @author dell
 */
public class Escalação extends javax.swing.JFrame {

    /**
     * Creates new form Escalação
     */
    public Escalação() {
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

        Atacantes = new javax.swing.JLabel();
        Atacante = new javax.swing.JComboBox<>();
        Defesa = new javax.swing.JLabel();
        Defesas = new javax.swing.JComboBox<>();
        Goleiro = new javax.swing.JLabel();
        Goleiros = new javax.swing.JComboBox<>();
        Zagueiro = new javax.swing.JComboBox<>();
        Zagueiros = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Atacantes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Atacantes.setForeground(new java.awt.Color(255, 255, 255));
        Atacantes.setText("Atacantes:");
        getContentPane().add(Atacantes);
        Atacantes.setBounds(6, 97, 80, 20);

        Atacante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Atacante);
        Atacante.setBounds(6, 119, 114, 22);

        Defesa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Defesa.setForeground(new java.awt.Color(255, 255, 255));
        Defesa.setText("Defesa:");
        getContentPane().add(Defesa);
        Defesa.setBounds(141, 97, 60, 20);

        Defesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Defesas);
        Defesas.setBounds(138, 119, 114, 22);

        Goleiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Goleiro.setForeground(new java.awt.Color(255, 255, 255));
        Goleiro.setText("Goleiro:");
        getContentPane().add(Goleiro);
        Goleiro.setBounds(269, 97, 60, 20);

        Goleiros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Goleiros);
        Goleiros.setBounds(270, 119, 114, 22);

        Zagueiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Zagueiro);
        Zagueiro.setBounds(402, 119, 114, 22);

        Zagueiros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Zagueiros.setForeground(new java.awt.Color(255, 255, 255));
        Zagueiros.setText("Zagueiros:");
        getContentPane().add(Zagueiros);
        Zagueiros.setBounds(402, 97, 80, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("País");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(123, 39, 83, 24);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(123, 69, 131, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(282, 69, 132, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Grupo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(282, 43, 50, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade de copas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(6, 193, 150, 20);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(6, 215, 29, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cad-Usuario.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-3, -110, 570, 810);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(Escalação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escalação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escalação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escalação.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escalação().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Atacante;
    private javax.swing.JLabel Atacantes;
    private javax.swing.JLabel Defesa;
    private javax.swing.JComboBox<String> Defesas;
    private javax.swing.JLabel Goleiro;
    private javax.swing.JComboBox<String> Goleiros;
    private javax.swing.JComboBox<String> Zagueiro;
    private javax.swing.JLabel Zagueiros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
