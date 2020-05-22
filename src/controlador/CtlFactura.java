/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.FacturaDAO;
import modelo.Factura;

/**
 *
 * @author Usuario
 */
public class CtlFactura {
    
    FacturaDAO dao;

    public CtlFactura() {
        dao = new FacturaDAO();
    }
    
    public boolean GuardarFactura(Factura f){
        return dao.guardarFactura(f);
    }
    
    
    
    
}
