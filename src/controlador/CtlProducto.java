/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ProductoDAO;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.Proveedor;

/**
 *
 * @author Usuario
 */
public class CtlProducto {
    
    ProductoDAO dao;
    
    public CtlProducto(){
        dao = new ProductoDAO();
    }
    
     public boolean guardarProducto(Producto pro) {
        return dao.guardarProducto(pro);
    }

    public boolean eliminarProducto(int codigo) {
        return dao.eliminarProducto(codigo);
    }

    public boolean modificarProducto(Producto pro) {
        return dao.editarProducto(pro);
    }

    public Producto buscarProducto(int codigo) {
        return dao.buscarProducto(codigo);
    }

    public DefaultTableModel SolicitudListar() {
        return dao.listarProducto();
    }
    
    
    
    
    
}
