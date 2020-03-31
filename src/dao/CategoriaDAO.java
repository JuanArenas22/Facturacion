/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.CategoriaPro;
import modelo.Proveedor;

/**
 *
 * @author Usuario
 */
public class CategoriaDAO extends Conexion {

    public CategoriaDAO() {

    }

    public boolean guardarCategoria(CategoriaPro cate) {
        String consulta = "INSERT INTO CategoriaPro(nombre) VALUES "
                + "('" + cate.getNombre() + "');";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public boolean eliminarCategoria(int codigo) {
        String consulta = "DELETE FROM CategoriaPro where codigo_Cate= '" + codigo + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);

    }

    public boolean editarCategoria(CategoriaPro cate) {
        String consulta = "UPDATE CategoriaPro SET nombre='" + cate.getNombre() + "' "
                + "WHERE codigo_Cate='" + cate.getCodigo_cate() + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public CategoriaPro buscarCategoria(int codigo) {
        String consulta = "select codigo_Cate, nombre from CategoriaPro where codigo_Cate ='" + codigo + "';";
        CategoriaPro cate = new CategoriaPro();
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                cate.setCodigo_cate(resultadoDB.getInt("codigo_Cate"));
                cate.setNombre(resultadoDB.getString("nombre"));

            }
        } catch (SQLException ex) {
            System.out.println("Fallo al consultar");
            return null;

        }
        return cate;
    }

    public DefaultTableModel listarCategoria() {
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"CODIGO", "NOMBRE"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas); // Qué hace esto?

        String consulta = "select codigo_Cate, nombre from CategoriaPro";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getInt("codigo_Cate"),
                    resultadoDB.getString("nombre")});
            }
        } catch (SQLException ex) {
            System.out.println("ESTO SE TOSTO!");
        }
        return modelTabla;
    }

   

}
