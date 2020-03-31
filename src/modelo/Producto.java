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
public class Producto {

    private int codigo_producto;
    private String nombre_producto;
    private double precio;
    private String unidad;
    private int proveedor_id, categoria_id;

    public Producto() {
    }

    public Producto(int codigo_producto, String nombre_producto, double precio, String unidad, int proveedor_id, int categoria_id) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.unidad = unidad;
        this.proveedor_id = proveedor_id;
        this.categoria_id = categoria_id;
    }

    public Producto(String nombre_producto, double precio, String unidad, int proveedor_id, int categoria_id) {
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.unidad = unidad;
        this.proveedor_id = proveedor_id;
        this.categoria_id = categoria_id;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getProveedor_id() {
        return proveedor_id;
    }

    public void setProveedor_id(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

}
