/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ProveedorDAO;
import javax.swing.table.DefaultTableModel;
import modelo.Proveedor;

/**
 *
 * @author Usuario
 */
public class CtlProveedor {

    ProveedorDAO dao;

    public CtlProveedor() {
        dao = new ProveedorDAO();

    }

    public boolean guardarPro(Proveedor pro) {
        return dao.guardarProveedor(pro);
    }

    public boolean eliminarProveedor(int codigo) {
        return dao.eliminarProveedor(codigo);
    }

    public boolean modificarProveedor(Proveedor pro) {
        return dao.editarProveedor(pro);
    }

    public Proveedor buscarProveedor(int codigo) {
        return dao.buscarProveedor(codigo);
    }

    public DefaultTableModel SolicitudListar() {
        return dao.listarProveedor();
    }

}
