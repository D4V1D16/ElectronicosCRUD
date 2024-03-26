/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import JDBCFactory.JDBCConnectionFactory;
import com.electronicos.Forms.ProductoFORM;
import com.electronicos.models.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



/**
 *
 * @author Usuario
 */
public class ProductoDao {
    
    public Connection conexion;
    
    
    public void agregarProducto(Producto producto){
            Connection conexion = null;
            try{       
                conexion = JDBCConnectionFactory.getConnection();
                String sql = "INSERT INTO `productos` (`idProducto`, `nombre`, `marca`, `cantidad`, `descripcion`, `precio`, `proveedor`, `categoria`) VALUES (NULL, ? , ? , ? , ? , ? , ? , ?);";
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1,producto.getNombre());
                statement.setInt(2,producto.getIdmarca());
                statement.setInt(3, producto.getCantidad());
                statement.setString(4,producto.getDescripcion());
                statement.setInt(5,producto.getPrecio());
                statement.setInt(6,producto.getIdProveedor());
                statement.setInt(7,producto.getIdCategoria());
                statement.execute();
                JOptionPane.showMessageDialog(null, "El producto se ha agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);           
            } catch (Exception e){
                System.out.println("Ha ocurrido el siguiente error: " + e);
            } finally{
                JDBCConnectionFactory.cerrarConexion(conexion);
            }
    }

    public List<Producto> mostrarDatos(){
        Connection conexion = null;
        List<Producto> listaProducto = new ArrayList<>();
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "SELECT * FROM `productos`";
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while(resultado.next()){
                Producto producto = new Producto();
                producto.setId(resultado.getInt("idProducto"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setIdmarca(resultado.getInt("marca"));
                producto.setCantidad(resultado.getInt("cantidad"));
                producto.setDescripcion(resultado.getString("descripcion"));
                producto.setPrecio(resultado.getInt("precio"));
                producto.setIdProveedor(resultado.getInt("proveedor"));
                producto.setIdCategoria(resultado.getInt("categoria"));
                listaProducto.add(producto);
            }
        } catch (Exception e){
            System.out.println("Ha ocurrido el siguiente error: " + e);
        } finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }

        return listaProducto;
    }
    
    public void eliminarProducto(Producto producto){
        conexion = null;
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "DELETE FROM `productos` WHERE `productos`.`idProducto` = ?" ;
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1,producto.getId());
            statement.execute();
            JOptionPane.showMessageDialog(null, "El producto se ha eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            System.out.println("Se produjo un error" + e);
        } finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }
    }
    
    public void actualizarProducto(int id,Producto producto){
        //Deje Actualizar la categoria, el id de la marca etc -->Proximo Commit
        conexion = null;
        System.out.println("El id del producto a actualizar es: " + id);
        try{
            conexion = JDBCConnectionFactory.getConnection();
            String sql = "UPDATE `productos` SET `nombre` = ?, `cantidad` = ?, `descripcion` = ?, `precio` = ? WHERE `productos`.`idProducto` =  ?;";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, producto.getNombre());
            statement.setInt(2, producto.getCantidad());
            statement.setString(3,producto.getDescripcion());
            statement.setInt(4,producto.getPrecio());
            statement.setInt(5,id);           
            statement.execute();
            JOptionPane.showMessageDialog(null, "El producto se ha actualizado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            System.out.println("Ha ocurrido un erro" + e);
        } finally{
            JDBCConnectionFactory.cerrarConexion(conexion);
        }
    }
}

