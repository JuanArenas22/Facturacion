/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Proveedor;

/**
 *
 * @author Usuario
 */
public class ProveedorDAO extends Conexion{
    
    public ProveedorDAO(){
    }
    
    public boolean guardarProveedor(Proveedor pro) {
        String consulta = "INSERT INTO Proveedor(nombre_proveedor, telefono,correo) VALUES "
                + "('" + pro.getNombre_proveedor() + "', '" + pro.getTelefono() + "', '" + pro.getCorreo() +  "');";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }
    
    public boolean eliminarProveedor(int codigo) {
        String consulta = "DELETE FROM Proveedor where codigo_proveedor= '" + codigo + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);

    }
    
    public boolean editarProveedor(Proveedor pro) {
        String consulta = "UPDATE Proveedor SET nombre_proveedor='" + pro.getNombre_proveedor() + "',"
                + "telefono= '" + pro.getTelefono() + "',"
                + "correo= '" + pro.getCorreo() +  "' "
                + "WHERE codigo_proveedor='" + pro.getCodigo_proveedor() + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }
    
    public Proveedor buscarProveedor(int codigo) {
        String consulta = "select codigo_proveedor, nombre_proveedor, telefono, correo from Proveedor where codigo_proveedor ='" + codigo + "';";
        Proveedor pro = new Proveedor();
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {
                
                pro.setCodigo_proveedor(resultadoDB.getInt("codigo_proveedor"));
                pro.setNombre_proveedor(resultadoDB.getString("nombre_proveedor"));
                pro.setTelefono(resultadoDB.getString("telefono"));
                pro.setCorreo(resultadoDB.getString("correo"));
            }
        } catch (SQLException ex) {
            System.out.println("Fallo al consultar");
            return null;

        }
        return pro;
    }
    
    public DefaultTableModel listarProveedor(){
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"CODIGO", "NOMBRE", "TELEFONO", "CORREO"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas); // Qué hace esto?
        
        String consulta = "select codigo_proveedor, nombre_proveedor, telefono, correo from Proveedor";
         System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        
        try {
            while(resultadoDB.next()){
                modelTabla.addRow(new Object[]{
                resultadoDB.getInt("codigo_proveedor"),
                resultadoDB.getString("nombre_proveedor"),
                resultadoDB.getString("telefono"),
                resultadoDB.getString("correo")});
            }
        } catch (SQLException ex) {
            System.out.println("ESTO SE TOSTO!");
        }
        return modelTabla;
    }
    
}
