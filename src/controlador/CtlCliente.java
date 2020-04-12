/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ClienteDAO;
import modelo.Cliente;

/**
 *
 * @author Usuario
 */
public class CtlCliente {
    
    ClienteDAO dao;

    public CtlCliente() {
        dao = new ClienteDAO();
    }
    
    public boolean guardarCliente(Cliente cliente){
        return dao.guardarCliente(cliente);
    }
    
    public Cliente buscarCliente(int cedula){
        return dao.buscarCliente(cedula);
    }
    
    public Cliente buscarClienteLogin(String nombre, String contrasena){
        return dao.buscarClienteLogin(nombre, contrasena);
    }
    
    public boolean modificarCliente(Cliente cliente){
        return dao.editarCliente(cliente);
    }
    
    public boolean eliminarCliente(int cedula){
        return dao.eliminarCliente(cedula);
    }
    
    
    
}
