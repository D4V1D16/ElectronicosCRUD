/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import JDBCFactory.JDBCConnectionFactory;
import com.electronicos.models.Categoria;
import com.electronicos.models.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CategoriaDao {
    
    public Connection conexion;
    
    public void agregarCategoria(Categoria categoria){
        conexion = null;
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "INSERT INTO `categorias` (`idCategoria`, `nombre`) VALUES (NULL, ?);";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1,categoria.getNombre());
            statement.execute();
            JOptionPane.showMessageDialog(null, "La categoria se ha ingresado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido el siguiente error: ", "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }
    }
    
    public List<Categoria> mostrarDatos(){
        Connection conexion = null;
        List<Categoria> listaCategoria = new ArrayList<>();
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "SELECT * FROM `categorias`";
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while(resultado.next()){
                Categoria categoria = new Categoria();
                categoria.setId(resultado.getInt("idCategoria"));
                categoria.setNombre(resultado.getString("nombre"));
                listaCategoria.add(categoria);
            }
        } catch (Exception e){
            System.out.println("Ha ocurrido el siguiente error: " + e);
        } finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }

        return listaCategoria;
    }
    
    public void eliminarCategoria(Categoria categoria){
        conexion = null;
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "DELETE FROM `categorias` WHERE `categorias`.`idCategoria` = ?" ;
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1,categoria.getId());
            statement.execute();
            JOptionPane.showMessageDialog(null, "La categoria se ha eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            System.out.println("Se produjo un error" + e);
        } finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }
    }
    
    
    public void actualizarCategoria(Categoria categoria){
        //Deje Actualizar la categoria, el id de la marca etc -->Proximo Commit
        conexion = null;
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "UPDATE `categorias` SET `nombre` = ? WHERE `categorias`.`idCategoria` = ?;";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, categoria.getNombre());
            statement.setInt(2,categoria.getId());        
            statement.execute();
            JOptionPane.showMessageDialog(null, "La categoria se ha actualizado con exito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            System.out.println("Ha ocurrido un erro" + e);
        } finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }
    }
    
    
}
