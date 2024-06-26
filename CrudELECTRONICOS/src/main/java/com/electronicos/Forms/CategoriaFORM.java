/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.electronicos.Forms;

import com.electronicos.models.Categoria;
import dao.CategoriaDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class CategoriaFORM extends javax.swing.JPanel {
    CategoriaDao dao = new CategoriaDao();
    List <Categoria> listaCategorias = new ArrayList<>();
    
    /**
     * Creates new form CategoriaFORM
     */
    public CategoriaFORM() {
        initComponents();
        mostrarDatos();
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
        txtFieldNombreCategoria = new javax.swing.JTextField();
        lblIngresarNombre = new javax.swing.JLabel();
        btnAgregarCategoria = new javax.swing.JButton();
        btnActualizarCategoria = new javax.swing.JButton();
        btnEliminarCategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        lblWarningMessage = new javax.swing.JLabel();

        jLabel1.setText("Bienvenido al Panel de Categorias");

        txtFieldNombreCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNombreCategoriaActionPerformed(evt);
            }
        });

        lblIngresarNombre.setText("Ingrese el nombre");

        btnAgregarCategoria.setText("Agregar");
        btnAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCategoriaActionPerformed(evt);
            }
        });

        btnActualizarCategoria.setText("Actualizar");
        btnActualizarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCategoriaActionPerformed(evt);
            }
        });

        btnEliminarCategoria.setText("Eliminar");
        btnEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCategoriaActionPerformed(evt);
            }
        });

        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id ", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(tblCategorias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblIngresarNombre)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblWarningMessage)
                                .addGap(43, 43, 43))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregarCategoria)
                                .addGap(37, 37, 37)))
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnEliminarCategoria)
                        .addGap(122, 122, 122)
                        .addComponent(btnActualizarCategoria)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblIngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarCategoria)
                        .addGap(93, 93, 93)
                        .addComponent(lblWarningMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarCategoria)
                    .addComponent(btnActualizarCategoria))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNombreCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNombreCategoriaActionPerformed
    private void mostrarDatos(){
        List <Categoria> lista = new ArrayList<>();
        lista = dao.mostrarDatos();
        DefaultTableModel modelo = (DefaultTableModel) tblCategorias.getModel();
        modelo.setRowCount(0);
        for(Categoria categoria: lista){
            Object[] fila = {
                    categoria.getId(),
                    categoria.getNombre(),
            };
            modelo.addRow(fila);
        }
    }


    private void btnAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaActionPerformed
        Categoria categoria = new Categoria();
        categoria.setNombre(this.txtFieldNombreCategoria.getText());
        dao.agregarCategoria(categoria);
        mostrarDatos();
    }//GEN-LAST:event_btnAgregarCategoriaActionPerformed

    private void btnEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaActionPerformed
       try{
        int indice = this.tblCategorias.getSelectedRow();
        listaCategorias = dao.mostrarDatos();
        Categoria categoria = listaCategorias.get(indice);
        dao.eliminarCategoria(categoria);
        mostrarDatos();  
       }catch(Exception e){
            this.lblWarningMessage.setText("Haga click sobre la fila que desea eliminar");
       } finally{
           mostrarDatos();
       }
    }//GEN-LAST:event_btnEliminarCategoriaActionPerformed

    private void btnActualizarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCategoriaActionPerformed
       try{
            int indice = this.tblCategorias.getSelectedRow();
            listaCategorias = dao.mostrarDatos();
            Categoria categoria = listaCategorias.get(indice);

            JFrame frame = new JFrame("Panel de Actualizacion");

            ActualizarCategoria actualizar = new ActualizarCategoria(categoria);
            frame.setSize(800, 500);
            frame.add(actualizar);
            frame.setVisible(true);
            mostrarDatos();
       }catch(Exception e){
            this.lblWarningMessage.setText("Haga click sobre la fila que quiere actualizar");
       } finally{
           mostrarDatos();
       }

    }//GEN-LAST:event_btnActualizarCategoriaActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCategoria;
    private javax.swing.JButton btnAgregarCategoria;
    private javax.swing.JButton btnEliminarCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIngresarNombre;
    private javax.swing.JLabel lblWarningMessage;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTextField txtFieldNombreCategoria;
    // End of variables declaration//GEN-END:variables
}
