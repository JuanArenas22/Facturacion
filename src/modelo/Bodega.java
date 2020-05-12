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
public class Bodega {
    
    private int id_bodega;
    private int producto_codigo;
    private int cantidad;
    private String fecha_ingreso;
    private String descripcion;

    public Bodega() {
    }

    public Bodega(int producto_codigo, int cantidad, String fecha_ingreso, String descripcion) {
        this.producto_codigo = producto_codigo;
        this.cantidad = cantidad;
        this.fecha_ingreso = fecha_ingreso;
        this.descripcion = descripcion;
    }

    public Bodega(int id_bodega, int producto_codigo, int cantidad, String fecha_ingreso, String descripcion) {
        this.id_bodega = id_bodega;
        this.producto_codigo = producto_codigo;
        this.cantidad = cantidad;
        this.fecha_ingreso = fecha_ingreso;
        this.descripcion = descripcion;
    }
    
    

    public int getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(int id_bodega) {
        this.id_bodega = id_bodega;
    }

    public int getProducto_codigo() {
        return producto_codigo;
    }

    public void setProducto_codigo(int producto_codigo) {
        this.producto_codigo = producto_codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
