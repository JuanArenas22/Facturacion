/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.CategoriaPro;
import modelo.Producto;
import modelo.Proveedor;

/**
 *
 * @author Usuario
 */
public class ProductoDAO extends Conexion {

    public ProductoDAO() {
    }

    public boolean guardarProducto(Producto pro) {
        String consulta = "INSERT INTO Producto(nombre_producto, precio, unidad, proveedor_id, categoria_id) VALUES "
                + "('" + pro.getNombre_producto() + "', '" + pro.getPrecio() + "', '" + pro.getUnidad() + "', '" + pro.getProveedor_id() + "', '" + pro.getCategoria_id() + "');";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public boolean eliminarProducto(int codigo) {
        String consulta = "DELETE FROM Producto where codigo_producto= '" + codigo + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);

    }

    public boolean editarProducto(Producto pro) {
        String consulta = "UPDATE Producto SET nombre_producto='" + pro.getNombre_producto() + "',"
                + "precio= '" + pro.getPrecio() + "',"
                + "unidad= '" + pro.getUnidad() + "',"
                + "proveedor_id= '" + pro.getProveedor_id() + "',"
                + "categoria_id= '" + pro.getCategoria_id() + "' "
                + "WHERE codigo_producto='" + pro.getCodigo_producto() + "';";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public Producto buscarProducto(int codigo) {
        String consulta = "select codigo_producto, nombre_producto, precio, unidad, proveedor_id, categoria_id from Producto where codigo_producto ='" + codigo + "';";
        Producto pro = new Producto();
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            while (resultadoDB.next()) {

                pro.setCodigo_producto(resultadoDB.getInt("codigo_producto"));
                pro.setNombre_producto(resultadoDB.getString("nombre_producto"));
                pro.setPrecio(resultadoDB.getDouble("precio"));
                pro.setUnidad(resultadoDB.getString("unidad"));
                pro.setProveedor_id(resultadoDB.getInt("proveedor_id"));
                pro.setCategoria_id(resultadoDB.getInt("categoria_id"));
            }
        } catch (SQLException ex) {
            System.out.println("Fallo al consultar");
            return null;

        }
        return pro;
    }

    public DefaultTableModel listarProducto() {
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"CODIGO", "NOMBRE", "PRECIO", "UNIDAD", "PROVEEDOR", "CATEGORIA"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas); // Qué hace esto?

        String consulta = "select Pro.codigo_producto, Pro.nombre_producto, Pro.precio, Pro.unidad, P.nombre_proveedor, C.nombre from Producto Pro "
                + "join Proveedor p on p.codigo_proveedor = Pro.proveedor_id "
                + "join CategoriaPro C on C.codigo_Cate = pro.Categoria_id;";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getInt("Pro.codigo_producto"),
                    resultadoDB.getString("Pro.nombre_producto"),
                    resultadoDB.getDouble("Pro.precio"),
                    resultadoDB.getString("Pro.unidad"),
                    resultadoDB.getString("P.nombre_proveedor"),
                    resultadoDB.getString("C.nombre")});
            }
        } catch (SQLException ex) {
            System.out.println("ESTO SE TOSTO!");
        }
        return modelTabla;
    }

    public void CargarComboProveedor(JComboBox combo) {
        String consulta = "select codigo_proveedor, nombre_proveedor from Proveedor ;";

        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            combo.addItem("Escoja una opcion");
            while (resultadoDB.next()) {

                Proveedor pro = new Proveedor();
                pro.setCodigo_proveedor(resultadoDB.getInt(1));
                pro.setNombre_proveedor(resultadoDB.getString(2));
                combo.addItem(pro);

            }
        } catch (SQLException ex) {
            System.out.println("Fallo al consultar");

        }

    }

    public void CargarComboCategoria(JComboBox combo) {
        String consulta = "select * from CategoriaPro;";

        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            combo.addItem("Selecciona una dato");
            while (resultadoDB.next()) {
                CategoriaPro ce = new CategoriaPro();
                ce.setCodigo_cate(resultadoDB.getInt(1));
                ce.setNombre(resultadoDB.getString(2));
                combo.addItem(ce);

            }
        } catch (Exception e) {
            System.out.println("esto se tosto");
        }

    }

    //Llenar el combo mediante un buscar
    public void CargarComboCategoria2(JComboBox combo, int codigo) {
        String consulta = "select codigo_cate, nombre from Producto Pro join Proveedor p on p.codigo_proveedor = Pro.proveedor_id join CategoriaPro C on C.codigo_Cate = pro.Categoria_id where Pro.codigo_producto= '"+codigo+"';";

        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            
            while (resultadoDB.next()) {
                CategoriaPro ce = new CategoriaPro();
                ce.setCodigo_cate(resultadoDB.getInt(1));
                ce.setNombre(resultadoDB.getString(2));
                combo.addItem(ce);

            }
        } catch (Exception e) {
            System.out.println("esto se tosto");
        }

    }
    
    //Esta Lista Sirve para el carrito de compras
    public DefaultTableModel listarProductoCarrito() {
        DefaultTableModel modelTabla;
        String nombreColumnas[] = {"CODIGO", "NOMBRE", "PRECIO"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas); // Qué hace esto?

        String consulta = "select codigo_producto, nombre_producto, precio from producto;";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getInt("codigo_producto"),
                    resultadoDB.getString("nombre_producto"),
                    resultadoDB.getDouble("precio")});
            }
        } catch (SQLException ex) {
            System.out.println("ESTO SE TOSTO!");
        }
        return modelTabla;
    }
    
    

}
