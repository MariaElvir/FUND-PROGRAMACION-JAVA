/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.s3.ejercicio1.gui.panel;

/**
 *
 * @author Usuario
 */
public class panel3 extends javax.swing.JPanel {

    /**
     * Creates new form panel3
     */
    public panel3() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sliderNota1 = new javax.swing.JSlider();
        sliderNota2 = new javax.swing.JSlider();
        sliderNota3 = new javax.swing.JSlider();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        btbPromMayor = new javax.swing.JButton();
        btnPromMenor = new javax.swing.JButton();
        btnPromedioDePromedios = new javax.swing.JButton();

        jLabel1.setText("Nombre:");

        jLabel2.setText("PC1");

        jLabel3.setText("PC2");

        jLabel4.setText("PC3");

        sliderNota1.setMajorTickSpacing(10);
        sliderNota1.setMaximum(20);
        sliderNota1.setMinorTickSpacing(1);
        sliderNota1.setPaintLabels(true);
        sliderNota1.setPaintTicks(true);
        sliderNota1.setToolTipText("");
        sliderNota1.setValue(10);

        sliderNota2.setMajorTickSpacing(10);
        sliderNota2.setMaximum(20);
        sliderNota2.setMinorTickSpacing(1);
        sliderNota2.setPaintLabels(true);
        sliderNota2.setPaintTicks(true);
        sliderNota2.setValue(10);

        sliderNota3.setMajorTickSpacing(10);
        sliderNota3.setMaximum(20);
        sliderNota3.setMinorTickSpacing(1);
        sliderNota3.setPaintLabels(true);
        sliderNota3.setPaintTicks(true);
        sliderNota3.setValue(10);

        btnAgregar.setText("Agregar Alumnos");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        btbPromMayor.setText("Promedio Mayor");
        btbPromMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbPromMayorActionPerformed(evt);
            }
        });

        btnPromMenor.setText("Promedio Menor");
        btnPromMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromMenorActionPerformed(evt);
            }
        });

        btnPromedioDePromedios.setText("Promedio de Promedios");
        btnPromedioDePromedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioDePromediosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombre))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sliderNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addComponent(sliderNota2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sliderNota3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btbPromMayor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromMenor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromedioDePromedios)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sliderNota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sliderNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbPromMayor)
                    .addComponent(btnPromMenor)
                    .addComponent(btnPromedioDePromedios))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
//Declaracion de variables globales
    String[] nombres = new String[5];
    double[] promedios = new double[5];
    int i=0;

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        nombres[i]= txtNombre.getText();
        promedios[i] =(sliderNota1.getValue()+sliderNota2.getValue()+sliderNota3.getValue())/3;
        
        txtSalida.setText("");
        for(int j=0; j<=i; j++){
            txtSalida.append(nombres[j]+ "\t");
            txtSalida.append(promedios[j]+ "\n");
        }
        
        i++;
        //para que se desavilite el boton
        if(i==5) btnAgregar.setEnabled(false);
        

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btbPromMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbPromMayorActionPerformed
        // TODO add your handling code here:
        double mayor =0;
        for(int k=0; k<5; k++){
            if(promedios[k]>mayor)
                mayor = promedios[k];
        }
        txtSalida.append("Promedio mayor: "+mayor+"\n");

    }//GEN-LAST:event_btbPromMayorActionPerformed

    private void btnPromMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromMenorActionPerformed
        // TODO add your handling code here:
        double menor =20;
        for(int k=0; k<5; k++){
            if(promedios[k]<menor)
                menor = promedios[k];
        }
        txtSalida.append("Promedio menor: "+menor+"\n");

    }//GEN-LAST:event_btnPromMenorActionPerformed

    private void btnPromedioDePromediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioDePromediosActionPerformed
        // TODO add your handling code here:
        double suma=0, Promedios=0;
        int k;
        for( k=0; k<5; k++){
            suma+=promedios[k];
        }
        txtSalida.append("Promedio de pomedios: "+(suma/5)+"\n");

    }//GEN-LAST:event_btnPromedioDePromediosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbPromMayor;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnPromMenor;
    private javax.swing.JButton btnPromedioDePromedios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider sliderNota1;
    private javax.swing.JSlider sliderNota2;
    private javax.swing.JSlider sliderNota3;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
