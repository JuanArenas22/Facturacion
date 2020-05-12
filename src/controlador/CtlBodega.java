/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.BodegaDAO;
import javax.swing.table.DefaultTableModel;
import modelo.Bodega;

/**
 *
 * @author Usuario
 */
public class CtlBodega {

    BodegaDAO dao;
    public CtlBodega() {
        dao = new BodegaDAO();
    }
    
    public boolean guardarBodega(Bodega bo) {
        return dao.guardarBodega(bo);
    }

    public boolean eliminarBodega(int codigo) {
        return dao.eliminarBodega(codigo);
    }

    public boolean modificarBodega(Bodega bo) {
        return dao.editarBodega(bo);
    }

    public Bodega buscarBodega(int codigo) {
        return dao.buscarBodega(codigo);
    }

    public DefaultTableModel SolicitudListar() {
        return dao.listarBodega();
    }
    
}
