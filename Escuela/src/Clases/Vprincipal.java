/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Vprincipal extends javax.swing.JFrame {
    logueo logi =  new logueo(this,true);
    /**
     * Creates new form Vprincipal
     */
    public Vprincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        boton_salir = new javax.swing.JButton();
        boton_imprimir = new javax.swing.JButton();
        boton_programar = new javax.swing.JButton();
        boton_iniciar_sesion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Boton_administrar = new javax.swing.JButton();
        boton_acerca_de = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 102, 0), java.awt.Color.orange));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arrow_exit.png"))); // NOI18N
        boton_salir.setText("Salir");
        boton_salir.setBorder(null);
        boton_salir.setBorderPainted(false);
        boton_salir.setContentAreaFilled(false);
        boton_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });
        jPanel2.add(boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 205, 151, -1));

        boton_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imprimir.png"))); // NOI18N
        boton_imprimir.setText("Imprimir");
        boton_imprimir.setBorder(null);
        boton_imprimir.setBorderPainted(false);
        boton_imprimir.setContentAreaFilled(false);
        boton_imprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_imprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(boton_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        boton_programar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario.png"))); // NOI18N
        boton_programar.setText("Programar");
        boton_programar.setBorder(null);
        boton_programar.setBorderPainted(false);
        boton_programar.setContentAreaFilled(false);
        boton_programar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_programar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(boton_programar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 380, -1, -1));

        boton_iniciar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preferences_system_login.png"))); // NOI18N
        boton_iniciar_sesion.setText("Iniciar Sesion");
        boton_iniciar_sesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_iniciar_sesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(boton_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 32, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 170, 700));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        Boton_administrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/64px-Plataformas.png"))); // NOI18N
        Boton_administrar.setText("Administrar");
        Boton_administrar.setBorder(null);
        Boton_administrar.setBorderPainted(false);
        Boton_administrar.setContentAreaFilled(false);
        Boton_administrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_administrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Boton_administrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_administrarActionPerformed(evt);
            }
        });

        boton_acerca_de.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/information.png"))); // NOI18N
        boton_acerca_de.setText("Acerca de");
        boton_acerca_de.setBorder(null);
        boton_acerca_de.setBorderPainted(false);
        boton_acerca_de.setContentAreaFilled(false);
        boton_acerca_de.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton_acerca_de.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boton_acerca_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_acerca_deActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton_administrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(boton_acerca_de)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_administrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_acerca_de, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_administrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_administrarActionPerformed
        // TODO add your handling code here:
        Administracion admi = new Administracion(this,true);
        admi.setVisible(true);
    }//GEN-LAST:event_Boton_administrarActionPerformed

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
        // TODO add your handling code here:
        boton_salir.setEnabled(false);
        boton_programar.setEnabled(false);
        boton_imprimir.setEnabled(false);
        Boton_administrar.setEnabled(false);
    }//GEN-LAST:event_boton_salirActionPerformed

    private void boton_acerca_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_acerca_deActionPerformed
        // TODO add your handling code here:
        AcercaDe acerca = new AcercaDe(this,true);
        acerca.setVisible(true);
    }//GEN-LAST:event_boton_acerca_deActionPerformed

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
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_administrar;
    public javax.swing.JButton boton_acerca_de;
    public javax.swing.JButton boton_imprimir;
    public javax.swing.JButton boton_iniciar_sesion;
    public javax.swing.JButton boton_programar;
    public javax.swing.JButton boton_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
