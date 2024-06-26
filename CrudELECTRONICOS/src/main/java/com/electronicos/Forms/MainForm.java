/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.electronicos.Forms;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class MainForm extends javax.swing.JPanel {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        btnFrameProductos = new javax.swing.JButton();
        btnFrameCategorias = new javax.swing.JButton();
        btnFrameMarca = new javax.swing.JButton();
        javax.swing.JButton btnFrameProveedor = new javax.swing.JButton();
        lblMainForm = new javax.swing.JLabel();

        btnFrameProductos.setText("Productos");
        btnFrameProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrameProductosActionPerformed(evt);
            }
        });

        btnFrameCategorias.setText("Categorias");
        btnFrameCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrameCategoriasActionPerformed(evt);
            }
        });

        btnFrameMarca.setText("Marca");
        btnFrameMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrameMarcaActionPerformed(evt);
            }
        });

        btnFrameProveedor.setText("Proveedor");

        lblMainForm.setText("Bienvenido a la consola de la tienda de ELECTRONICOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFrameProveedor)
                            .addComponent(btnFrameCategorias)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnFrameMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFrameProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(lblMainForm)))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblMainForm)
                .addGap(26, 26, 26)
                .addComponent(btnFrameProductos)
                .addGap(18, 18, 18)
                .addComponent(btnFrameMarca)
                .addGap(18, 18, 18)
                .addComponent(btnFrameCategorias)
                .addGap(18, 18, 18)
                .addComponent(btnFrameProveedor)
                .addContainerGap(290, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFrameProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrameProductosActionPerformed
        JFrame frame = new JFrame("Panel de Productos");

        ProductoFORM producto = new ProductoFORM();
        frame.setSize(800, 500);
        frame.add(producto);
        frame.setVisible(true);
    }//GEN-LAST:event_btnFrameProductosActionPerformed

    private void btnFrameCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrameCategoriasActionPerformed
    JFrame frame = new JFrame("Panel de Categorias");

    CategoriaFORM categoria = new CategoriaFORM();
    frame.setSize(800, 500);
    frame.add(categoria);
    frame.setVisible(true);
    }//GEN-LAST:event_btnFrameCategoriasActionPerformed

    private void btnFrameMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrameMarcaActionPerformed
    JFrame frame = new JFrame("Panel de Categorias");

    MarcaFORM categoria = new MarcaFORM();
    frame.setSize(800, 500);
    frame.add(categoria);
    frame.setVisible(true);
    }//GEN-LAST:event_btnFrameMarcaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFrameCategorias;
    private javax.swing.JButton btnFrameMarca;
    private javax.swing.JButton btnFrameProductos;
    private javax.swing.JLabel lblMainForm;
    // End of variables declaration//GEN-END:variables
}
