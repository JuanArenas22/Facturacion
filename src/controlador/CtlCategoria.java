/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.CategoriaDAO;
import javax.swing.table.DefaultTableModel;
import modelo.CategoriaPro;

/**
 *
 * @author Usuario
 */
public class CtlCategoria {
    
    CategoriaDAO dao;
    
    public CtlCategoria(){
        dao = new CategoriaDAO();
    }
    
    public boolean guardarCate(CategoriaPro cate) {
        return dao.guardarCategoria(cate);
    }

    public boolean eliminarCate(int codigo) {
        return dao.eliminarCategoria(codigo);
    }

    public boolean modificarCate(CategoriaPro cate) {
        return dao.editarCategoria(cate);
    }

    public CategoriaPro buscarCate(int codigo) {
        return dao.buscarCategoria(codigo);
    }

    public DefaultTableModel SolicitudListar() {
        return dao.listarCategoria();
    }
    
    
    
}
