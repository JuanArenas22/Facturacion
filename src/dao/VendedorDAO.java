/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Vendedor;

/**
 *
 * @author Usuario
 */
public class VendedorDAO extends Conexion {

    public VendedorDAO() {
    }

    public boolean guardarVendedor(Vendedor vendedor) {
        String consulta = "INSERT INTO Vendedor(cedula_vendedor, nombre_vendedor, nombre_usuario, contrasena) VALUES "
                + "('" + vendedor.getCedula_vendedor() + "', '" + vendedor.getNombre_vendedor() + "', '" + vendedor.getNombre_usuario() + "', '" + vendedor.getContrasena() + "');";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public Vendedor buscarVendedorLogin(String nombre_u, String contrasena) {
        String consulta = "select cedula_vendedor, nombre_vendedor, nombre_usuario, contrasena from Vendedor where nombre_usuario='" + nombre_u + "' and contrasena='" + contrasena + "';";
        Vendedor ven = new Vendedor();
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            while (resultadoDB.next()) {

                ven.setCedula_vendedor(resultadoDB.getInt("cedula_vendedor"));
                ven.setNombre_vendedor(resultadoDB.getString("nombre_vendedor"));
                ven.setNombre_usuario(resultadoDB.getString("nombre_usuario"));
                ven.setContrasena(resultadoDB.getString("contrasena"));
            }
        } catch (SQLException ex) {
            System.out.println("Fallo al consultar");
            return null;

        }
        return ven;
    }

    public boolean eliminarVendedor(int cedula) {
        String consulta = "DELETE FROM Vendedor where cedula_vendedor= '" + cedula + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);

    }

    public boolean editarVendedor(Vendedor vendedor) {
        String consulta = "UPDATE Vendedor SET nombre_vendedor='" + vendedor.getNombre_vendedor() + "',"
                + "nombre_usuario= '" + vendedor.getNombre_usuario() + "',"
                + "contrasena= '" + vendedor.getContrasena() + "' "
                + "WHERE cedula_vendedor='" + vendedor.getCedula_vendedor() + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public Vendedor buscarVendedor(int cedula) {
        String consulta = "select cedula_vendedor, nombre_vendedor, nombre_usuario, contrasena from Vendedor where cedula_vendedor='" + cedula + "';";
        Vendedor ven = new Vendedor();
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            while (resultadoDB.next()) {

                ven.setCedula_vendedor(resultadoDB.getInt("cedula_vendedor"));
                ven.setNombre_vendedor(resultadoDB.getString("nombre_vendedor"));
                ven.setNombre_usuario(resultadoDB.getString("nombre_usuario"));
                ven.setContrasena(resultadoDB.getString("contrasena"));
            }
        } catch (SQLException ex) {
            System.out.println("Fallo al consultar");
            return null;

        }
        return ven;
    }

    public DefaultTableModel listarVendedor() {
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"CEDULA", "NOMBRE COMPLETO", "NOMBRE USUARIO", "PASSWORD"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas); // Qué hace esto?

        String consulta = "select cedula_vendedor, nombre_vendedor, nombre_usuario, contrasena from Vendedor";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getInt("cedula_vendedor"),
                    resultadoDB.getString("nombre_vendedor"),
                    resultadoDB.getString("nombre_usuario"),
                    resultadoDB.getString("contrasena")});
            }
        } catch (SQLException ex) {
            System.out.println("ESTO SE TOSTO!");
        }
        return modelTabla;
    }
}
