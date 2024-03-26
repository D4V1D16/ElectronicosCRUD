/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import JDBCFactory.JDBCConnectionFactory;
import com.electronicos.models.Marca;
import com.electronicos.models.Marca;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class MarcaDao {
    Connection conexion = null;
    public void agregarMarca(Marca marca){
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "INSERT INTO `marcas` (`idMarca`, `nombre`) VALUES (?, ?);";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1,marca.getId());
            statement.setString(2,marca.getNombre());
            statement.execute();
            JOptionPane.showMessageDialog(null, "La marca se ha agregado con exito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            System.out.println("Ha ocurrido el siguiente error: " + e);
        } finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }
    }

    public void eliminarMarca(Marca marca){
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "DELETE FROM `marcas` WHERE `marcas`.`idMarca` = ?" ;
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1,marca.getId());
            statement.execute();
            JOptionPane.showMessageDialog(null, "La marca se ha eliminado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            System.out.println("Se produjo un error" + e);
        } finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }
    }

    public List<Marca> mostrarDatos(){
        List<Marca> listaMarca = new ArrayList<>();
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "SELECT * FROM `marcas`";
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while(resultado.next()){
                Marca marca = new Marca();
                marca.setId(resultado.getInt("idMarca"));
                marca.setNombre(resultado.getString("nombre"));
                listaMarca.add(marca);
            }
        } catch (Exception e){
            System.out.println("Ha ocurrido el siguiente error: " + e);
        } finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }

        return listaMarca;
    }
    
        public void actualizarMarca(Marca marca){
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "UPDATE `marcas` SET `nombre` = ? WHERE `marcas`.`idMarca` = ?;";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, marca.getNombre());
            statement.setInt(2,marca.getId());        
            statement.execute();
            JOptionPane.showMessageDialog(null, "La marca se ha actualizado con exito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            System.out.println("Ha ocurrido un erro" + e);
        } finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }
    }
    
}
