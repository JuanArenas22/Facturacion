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
public class Vendedor {
    
    private int cedula_vendedor;
    private String nombre_vendedor;
    private String nombre_usuario;
    private String contrasena;

    public Vendedor() {
    }

    public Vendedor(int cedula_vendedor, String nombre_vendedor, String nombre_usuario, String contrasena) {
        this.cedula_vendedor = cedula_vendedor;
        this.nombre_vendedor = nombre_vendedor;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
    }

    public int getCedula_vendedor() {
        return cedula_vendedor;
    }

    public void setCedula_vendedor(int cedula_vendedor) {
        this.cedula_vendedor = cedula_vendedor;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
