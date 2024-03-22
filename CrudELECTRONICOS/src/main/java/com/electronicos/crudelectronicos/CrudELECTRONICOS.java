/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.electronicos.crudelectronicos;

import com.electronicos.Forms.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class CrudELECTRONICOS {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Tabla de Productos");
        
        
        
        MainForm main = new MainForm();
        
        frame.add(main);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1000, 500);

        frame.setVisible(true);

    }
}
