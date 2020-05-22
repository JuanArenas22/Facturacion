/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Factura {
    
private int id_factura;
private String cliente_usuario;
private int producto_codigo;
private String producto;
private int cantidad ;
private double precio ;
private double detalle;
private double subtotal ;
private double igv;
private double total;

    public Factura() {
    }

    public Factura(int id_factura, String cliente_usuario, int producto_codigo, String producto, int cantidad, double precio, double detalle, double subtotal, double igv, double total) {
        this.id_factura = id_factura;
        this.cliente_usuario = cliente_usuario;
        this.producto_codigo = producto_codigo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.detalle = detalle;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
    }

        

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getCliente_usuario() {
        return cliente_usuario;
    }

    public void setCliente_usuario(String cliente_usuario) {
        this.cliente_usuario = cliente_usuario;
    }

    

    public int getProducto_codigo() {
        return producto_codigo;
    }

    public void setProducto_codigo(int producto_codigo) {
        this.producto_codigo = producto_codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDetalle() {
        return detalle;
    }

    public void setDetalle(double detalle) {
        this.detalle = detalle;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }



    

    


    
}
