/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Bodega;

/**
 *
 * @author Usuario
 */
public class BodegaDAO extends Conexion {

    public BodegaDAO() {
    }

    public boolean guardarBodega(Bodega bo) {
        String consulta = "INSERT INTO Bodega(producto_codigo, cantidad, fecha_ingreso, descripcion) VALUES "
                + "('" + bo.getProducto_codigo() + "', '" + bo.getCantidad() + "', '" + bo.getFecha_ingreso() + "', '" + bo.getDescripcion() + "');";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public boolean eliminarBodega(int id) {
        String consulta = "DELETE FROM Bodega where id_bodega= '" + id + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);

    }

    public boolean editarBodega(Bodega bo) {
        String consulta = "UPDATE Bodega SET producto_codigo='" + bo.getProducto_codigo() + "',"
                + "cantidad= '" + bo.getCantidad() + "',"
                + "fecha_ingreso= '" + bo.getFecha_ingreso() + "',"
                + "descripcion= '" + bo.getDescripcion() + "' "
                + "WHERE id_bodega='" + bo.getId_bodega() + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public Bodega buscarBodega(int id) {
        String consulta = "select id_bodega, producto_codigo, cantidad, fecha_ingreso, descripcion from Bodega where id_bodega ='" + id + "';";
        Bodega bo = new Bodega();
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            while (resultadoDB.next()) {

                bo.setId_bodega(resultadoDB.getInt("id_bodega"));
                bo.setProducto_codigo(resultadoDB.getInt("producto_codigo"));
                bo.setCantidad(resultadoDB.getInt("cantidad"));
                bo.setFecha_ingreso(resultadoDB.getString("fecha_ingreso"));
                bo.setDescripcion(resultadoDB.getString("descripcion"));
            }
        } catch (SQLException ex) {
            System.out.println("Fallo al consultar");
            return null;

        }
        return bo;
    }

    public DefaultTableModel listarBodega() {
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"CODIGO", "NOMBRE", "CANTIDAD", "FECHA INGRESO", "DESCRIPCION"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas); // Qué hace esto?

        String consulta = "select b.id_bodega, p.nombre_producto, b.cantidad, b.fecha_ingreso, b.descripcion \n"
                + "from bodega b \n"
                + "join producto p on producto_codigo = codigo_producto;";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getInt("b.id_bodega"),
                    resultadoDB.getString("p.nombre_producto"),
                    resultadoDB.getInt("b.cantidad"),
                    resultadoDB.getString("b.fecha_ingreso"),
                    resultadoDB.getString("b.descripcion")});
            }
        } catch (SQLException ex) {
            System.out.println("ESTO SE TOSTO!");
        }
        return modelTabla;
    }

}
