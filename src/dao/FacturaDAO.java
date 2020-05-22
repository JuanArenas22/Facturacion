/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import modelo.Factura;

/**
 *
 * @author Usuario
 */
public class FacturaDAO extends Conexion{

    public FacturaDAO() {
    }
    
    
    public boolean guardarFactura(Factura factura) {
        String consulta = "INSERT INTO Factura(id_factura, cliente_usuario, producto_codigo, producto, cantidad, precio, detalle, subtotal, igv, total) VALUES "
                + "('" + factura.getId_factura() + "','" + factura.getCliente_usuario() + "', '" + factura.getProducto_codigo() + "', '" + factura.getProducto() + "', '" + factura.getCantidad() + "', '" + factura.getPrecio() + "', '" + factura.getDetalle() + "', '" + factura.getSubtotal() + "', '" + factura.getIgv() + "', '" + factura.getTotal() + "');";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }
}
