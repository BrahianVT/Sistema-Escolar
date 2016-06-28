/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import javax.swing.table.DefaultTableModel;
public class Administracion extends javax.swing.JDialog {
     public Modelo modelo = new Modelo();
     //public Conexion conn = new Conexion();
     public Object[][] datosUniversitario, dAsignatura , dProgramacion;
     DefaultTableModel datosUniv;
     DefaultTableModel datosAsignatura;
     DefaultTableModel datosProgramacion;
    public Administracion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        updateTablaUniv();
        updateTablaAsignatura();
        updateTablaProgramacion();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        pf_contra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alumnos = new javax.swing.JTable();
        tf_carnet2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        boton_registrar1 = new javax.swing.JButton();
        boton_modificar1 = new javax.swing.JButton();
        boton_eliminar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_asignaturas = new javax.swing.JTable();
        sigla = new javax.swing.JLabel();
        tf_sigla2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_curso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_tipo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        tf_universitario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_matricula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        boton_registrar2 = new javax.swing.JButton();
        boton_modificar2 = new javax.swing.JButton();
        boton_eliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_alumnos1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        tf_materia1 = new javax.swing.JTextField();
        tf_grupo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 35, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        jLabel2.setText("Carnet");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 87, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 139, -1, -1));
        jPanel1.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 34, 144, -1));
        jPanel1.add(pf_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 144, -1));

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 203, -1, -1));

        jButton2.setBackground(java.awt.SystemColor.activeCaption);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Modificar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 203, -1, -1));

        jButton3.setBackground(java.awt.SystemColor.activeCaption);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 203, -1, -1));

        tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_alumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_alumnos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 237, 409, 224));
        jPanel1.add(tf_carnet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 86, 144, -1));

        jTabbedPane1.addTab("Alumnos", jPanel1);

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 65, -1, -1));
        jPanel2.add(tf_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 64, 144, -1));

        boton_registrar1.setBackground(java.awt.SystemColor.activeCaption);
        boton_registrar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_registrar1.setText("Registrar");
        boton_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar1ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 228, -1, -1));

        boton_modificar1.setBackground(java.awt.SystemColor.activeCaption);
        boton_modificar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_modificar1.setText("Modificar ");
        boton_modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificar1ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 228, -1, -1));

        boton_eliminar1.setBackground(java.awt.SystemColor.activeCaption);
        boton_eliminar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_eliminar1.setText("Eliminar");
        boton_eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminar1ActionPerformed(evt);
            }
        });
        jPanel2.add(boton_eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 228, -1, -1));

        tabla_asignaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_asignaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_asignaturasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_asignaturas);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 289, 409, 163));

        sigla.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        sigla.setText("Sigla");
        jPanel2.add(sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, -1, -1));
        jPanel2.add(tf_sigla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 64, 144, -1));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        jLabel6.setText("Curso");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 126, -1, -1));
        jPanel2.add(tf_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 125, 144, -1));

        jLabel7.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        jLabel7.setText("Tipo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 126, -1, -1));
        jPanel2.add(tf_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 125, 144, -1));

        jTabbedPane1.addTab("Asignaturas", jPanel2);

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(tf_universitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 13, 144, -1));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        jLabel5.setText("Universitario");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 14, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        jLabel8.setText("Materia");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 66, -1, -1));
        jPanel3.add(tf_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 144, -1));

        jLabel9.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        jLabel9.setText("Grupo");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 118, -1, -1));

        boton_registrar2.setBackground(java.awt.SystemColor.activeCaption);
        boton_registrar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_registrar2.setText("Registrar");
        boton_registrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar2ActionPerformed(evt);
            }
        });
        jPanel3.add(boton_registrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

        boton_modificar2.setBackground(java.awt.SystemColor.activeCaption);
        boton_modificar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_modificar2.setText("Modificar ");
        boton_modificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificar2ActionPerformed(evt);
            }
        });
        jPanel3.add(boton_modificar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 216, -1, -1));

        boton_eliminar.setBackground(java.awt.SystemColor.activeCaption);
        boton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_eliminar.setText("Eliminar");
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });
        jPanel3.add(boton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 216, -1, -1));

        tabla_alumnos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_alumnos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_alumnos1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_alumnos1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 250, 409, 224));

        jLabel10.setFont(new java.awt.Font("Calibri Light", 3, 15)); // NOI18N
        jLabel10.setText("Matricula");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 165, -1, -1));
        jPanel3.add(tf_materia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 65, 144, -1));

        tf_grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_grupoActionPerformed(evt);
            }
        });
        jPanel3.add(tf_grupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 144, -1));

        jTabbedPane1.addTab("Programaciones", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String carnet = tf_carnet2.getText();
        String nombre = tf_nombre.getText();
        String contra = pf_contra.getText();
        modelo.insertarUniversitario(carnet , contra,nombre);
        updateTablaUniv();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String carnet = datosUniv.getValueAt(
                        tabla_alumnos.getSelectedRow(),0).toString();
        modelo.eliminarUniversitario(carnet);
        updateTablaUniv();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void boton_registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar1ActionPerformed
        // TODO add your handling code here:
        String sigla = tf_sigla2.getText();
        String nombre = tf_nombre1.getText();
        String curso = tf_curso.getText();
        String tipo = tf_tipo.getText();
        modelo.insertarAsignatura(sigla, nombre, curso, tipo);
        updateTablaAsignatura();
    }//GEN-LAST:event_boton_registrar1ActionPerformed

    private void boton_eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminar1ActionPerformed
        // TODO add your handling code here:
        String sigla = datosAsignatura.getValueAt(
                        tabla_asignaturas.getSelectedRow(),0).toString();
        modelo.eliminarProgramacion(sigla);
    }//GEN-LAST:event_boton_eliminar1ActionPerformed

    private void boton_registrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar2ActionPerformed
        // TODO add your handling code here:
        String matricula = tf_matricula.getText();
        String universitario = tf_universitario.getText();
        String grupo = tf_grupo.getText();
        String materia = tf_materia1.getText();
        modelo.insertarProgramacion(matricula, universitario, materia, grupo);
        updateTablaProgramacion();
    }//GEN-LAST:event_boton_registrar2ActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        String matricula = datosProgramacion.getValueAt(
          tabla_alumnos1.getSelectedRow(),2).toString();
        modelo.eliminarProgramacion(matricula);
        updateTablaProgramacion();
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String carnet = tf_carnet2.getText();
        String contra = pf_contra.getText();
        String nombre = tf_nombre.getText();
        modelo.modificarUniver(carnet, contra, nombre);
        updateTablaUniv();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boton_modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificar1ActionPerformed
        // TODO add your handling code here:
         String sigla = tf_sigla2.getText();
        String nombre = tf_nombre1.getText();
        String curso = tf_curso.getText();
        String tipo = tf_tipo.getText();
        modelo.modificarAsignatura(sigla, nombre, curso, tipo);
        updateTablaAsignatura();
    }//GEN-LAST:event_boton_modificar1ActionPerformed

    private void tf_grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_grupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_grupoActionPerformed

    private void boton_modificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificar2ActionPerformed
        String matricula = tf_matricula.getText();
        String universitario = tf_universitario.getText();
        String grupo = tf_grupo.getText();
        String materia = tf_materia1.getText();
        modelo.modificarProgramacion(matricula, universitario, materia, grupo);
        updateTablaProgramacion();
    }//GEN-LAST:event_boton_modificar2ActionPerformed

    private void tabla_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_alumnosMouseClicked
        String carnet = datosUniv.getValueAt(
                        tabla_alumnos.getSelectedRow(),0).toString();
        String contra = datosUniv.getValueAt(
                        tabla_alumnos.getSelectedRow(),1).toString();
        String nombre = datosUniv.getValueAt(
                        tabla_alumnos.getSelectedRow(),2).toString();
        tf_carnet2.setText(carnet);
        pf_contra.setText(contra);
        tf_nombre.setText(nombre);
    }//GEN-LAST:event_tabla_alumnosMouseClicked

    private void tabla_asignaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_asignaturasMouseClicked
        String sigla = datosAsignatura.getValueAt(
                       tabla_asignaturas.getSelectedRow(),0).toString();
        String nombre = datosAsignatura.getValueAt(
                        tabla_asignaturas.getSelectedRow(),1).toString();
        String cursos = datosAsignatura.getValueAt(
                        tabla_asignaturas.getSelectedRow(),2).toString();
        String tipo = datosAsignatura.getValueAt(
                        tabla_asignaturas.getSelectedRow(),3).toString();
        tf_sigla2.setText(sigla);
        tf_nombre1.setText(nombre);
        tf_curso.setText(cursos);
        tf_tipo.setText(tipo);
    }//GEN-LAST:event_tabla_asignaturasMouseClicked

    private void tabla_alumnos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_alumnos1MouseClicked
        // TODO add your handling code here:
            try{
        String universitario = datosProgramacion.getValueAt(
                tabla_alumnos1.getSelectedRow(),1).toString();
        String materia = datosProgramacion.getValueAt(
                tabla_alumnos1.getSelectedRow(),2).toString();
        String grupo = datosProgramacion.getValueAt(
                tabla_alumnos1.getSelectedRow(),3).toString();
        String matricula = datosProgramacion.getValueAt(
                tabla_alumnos1.getSelectedRow(),0).toString();
        tf_universitario.setText(universitario);
        tf_materia1.setText(materia);
        tf_grupo.setText(grupo);
        tf_matricula.setText(matricula);
            }catch  (Exception e){
                System.out.println("Tabla actualmente vacia");
            }
        
    }//GEN-LAST:event_tabla_alumnos1MouseClicked

    
    private void updateTablaUniv(){
        String[] NombreColumna = {"Usuario","Contrasena","Nombre"};
        datosUniversitario = modelo.getUniversitarios();
        //colocamos los datos del universitario en la tabla
        datosUniv = new DefaultTableModel(datosUniversitario,NombreColumna);
        tabla_alumnos.setModel(datosUniv);
        
    }
    private void updateTablaAsignatura(){
        String[] NombreColumna= {"Sigla","Nombre","Curso","Tipo"};
        dAsignatura = modelo.getAsignaturas();
        //colocamos los datos en la tabla
        datosAsignatura = new DefaultTableModel(dAsignatura, NombreColumna);
        tabla_asignaturas.setModel(datosAsignatura);
    }
    private void updateTablaProgramacion(){
        String[]NombreColumna = {"Matricula","Universitario","Materia","Grupo"};
        dProgramacion = modelo.getProgramaciones();
        
        datosProgramacion = new DefaultTableModel(dProgramacion, NombreColumna);
        tabla_alumnos1.setModel(datosProgramacion);
    }
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
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Administracion dialog = new Administracion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton boton_eliminar;
    public javax.swing.JButton boton_eliminar1;
    public javax.swing.JButton boton_modificar1;
    public javax.swing.JButton boton_modificar2;
    public javax.swing.JButton boton_registrar1;
    public javax.swing.JButton boton_registrar2;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField pf_contra;
    private javax.swing.JLabel sigla;
    public javax.swing.JTable tabla_alumnos;
    public javax.swing.JTable tabla_alumnos1;
    public javax.swing.JTable tabla_asignaturas;
    public javax.swing.JTextField tf_carnet2;
    public javax.swing.JTextField tf_curso;
    public javax.swing.JTextField tf_grupo;
    public javax.swing.JTextField tf_materia1;
    public javax.swing.JTextField tf_matricula;
    public javax.swing.JTextField tf_nombre;
    public javax.swing.JTextField tf_nombre1;
    public javax.swing.JTextField tf_sigla2;
    public javax.swing.JTextField tf_tipo;
    public javax.swing.JTextField tf_universitario;
    // End of variables declaration//GEN-END:variables
}
