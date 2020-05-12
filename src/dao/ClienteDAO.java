/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Producto;

/**
 *
 * @author Usuario
 */
public class ClienteDAO extends Conexion{

    public ClienteDAO() {
    }
    
    public boolean guardarCliente(Cliente cliente) {
        String consulta = "INSERT INTO Cliente(cedula_cliente, nombre_cliente, nombre_usuario,direccion, telefono, correo, contrasena) VALUES "
                + "('" + cliente.getCedula_cliente() + "', '" + cliente.getNombre_cliente() + "', '" + cliente.getNombre_usuario() + "', '" + cliente.getDireccion() + "', '" + cliente.getTelefono() + "', '" + cliente.getCorreo() + "', '" + cliente.getContrasena() + "');";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public boolean eliminarCliente(int cedula) {
        String consulta = "DELETE FROM Cliente where cedula_cliente= '" + cedula + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);

    }

    public boolean editarCliente(Cliente cliente) {
        String consulta = "UPDATE Cliente SET nombre_cliente='" + cliente.getNombre_cliente() + "',"
                + "nombre_usuario= '" + cliente.getNombre_usuario() + "',"
                + "direccion= '" + cliente.getDireccion() + "',"
                + "telefono= '" + cliente.getTelefono() + "',"
                + "correo= '" + cliente.getCorreo() + "',"
                + "contrasena= '" + cliente.getContrasena() + "' "
                + "WHERE cedula_cliente='" + cliente.getCedula_cliente() + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public Cliente buscarCliente(int cedula) {
        String consulta = "select cedula_cliente, nombre_cliente, nombre_usuario, direccion, telefono,correo, contrasena from Cliente where cedula_cliente ='" + cedula + "';";
        Cliente cli = new Cliente();
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            while (resultadoDB.next()) {

                cli.setCedula_cliente(resultadoDB.getInt("cedula_cliente"));
                cli.setNombre_cliente(resultadoDB.getString("nombre_cliente"));
                cli.setNombre_usuario(resultadoDB.getString("nombre_usuario"));
                cli.setDireccion(resultadoDB.getString("direccion"));
                cli.setTelefono(resultadoDB.getString("telefono"));
                cli.setCorreo(resultadoDB.getString("correo"));
                cli.setContrasena(resultadoDB.getString("contrasena"));
            }
        } catch (SQLException ex) {
            System.out.println("Fallo al consultar");
            return null;

        }
        return cli;
    }
    
    public Cliente buscarClienteLogin(String nombre_u , String contrasena) {
        String consulta = "select cedula_cliente, nombre_cliente, nombre_usuario, direccion, telefono,correo, contrasena from Cliente where nombre_usuario='" + nombre_u + "' and contrasena='"+contrasena+"';";
        Cliente cli = new Cliente();
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            while (resultadoDB.next()) {

                cli.setCedula_cliente(resultadoDB.getInt("cedula_cliente"));
                cli.setNombre_cliente(resultadoDB.getString("nombre_cliente"));
                cli.setNombre_usuario(resultadoDB.getString("nombre_usuario"));
                cli.setDireccion(resultadoDB.getString("direccion"));
                cli.setTelefono(resultadoDB.getString("telefono"));
                cli.setCorreo(resultadoDB.getString("correo"));
                cli.setContrasena(resultadoDB.getString("contrasena"));
            }
        } catch (SQLException ex) {
            System.out.println("Fallo al consultar");
            return null;

        }
        return cli;
    }
    
    public DefaultTableModel listarCliente(){
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"CEDULA", "NOMBRE", "USUARIO", "DIRECCION", "TELEFONO","CORREO","PASSWORD"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas); // Qué hace esto?
        
        String consulta = "select cedula_cliente, nombre_cliente, nombre_usuario, direccion, telefono, correo, contrasena from Cliente;";
         System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        
        try {
            while(resultadoDB.next()){
                modelTabla.addRow(new Object[]{
                resultadoDB.getInt("cedula_cliente"),
                resultadoDB.getString("nombre_cliente"),
                resultadoDB.getString("nombre_usuario"),
                resultadoDB.getString("direccion"),
                resultadoDB.getString("telefono"),
                resultadoDB.getString("correo"),
                resultadoDB.getString("contrasena")});
            }
        } catch (SQLException ex) {
            System.out.println("ESTO SE TOSTO!");
        }
        return modelTabla;
    }
    
}
