/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.VendedorDAO;
import javax.swing.table.DefaultTableModel;
import modelo.Vendedor;

/**
 *
 * @author Usuario
 */
public class CtlVendedor {
    
    VendedorDAO dao;

    public CtlVendedor() {
        dao = new VendedorDAO();
    }
    
    public boolean GuardarVendedor(Vendedor vendedor){
        return dao.guardarVendedor(vendedor);
    }
    
    public Vendedor buscarVendedorLogin(String nombre, String contrasena){
        return dao.buscarVendedorLogin(nombre, contrasena);
    }
    
    public Vendedor buscarVendedor(int cedula){
        return dao.buscarVendedor(cedula);
    }
    
    public boolean modificarVendedor(Vendedor vendedor){
        return dao.editarVendedor(vendedor);
    }
    
    public boolean EliminarVendedor(int cedula){
        return dao.eliminarVendedor(cedula);
    }
    
    public DefaultTableModel SolicitudListar() {
        return dao.listarVendedor();
    }
    
    
}
