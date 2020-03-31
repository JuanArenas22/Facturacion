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
public class Proveedor {
    
    private int codigo_proveedor;
    private String nombre_proveedor;
    private String telefono, correo;
    
    public Proveedor(){
        
    }

    public Proveedor(String nombre_proveedor, String telefono, String correo) {
        
        this.nombre_proveedor = nombre_proveedor;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Proveedor(int codigo_proveedor, String nombre_proveedor, String telefono, String correo) {
        this.codigo_proveedor = codigo_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    

    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombre_proveedor;
    }
    
    
    
}
