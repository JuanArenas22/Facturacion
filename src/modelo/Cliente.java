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
public class Cliente {
    
    private int cedula_cliente;
    private String nombre_cliente;
    private String nombre_usuario;
    private String direccion;
    private String telefono;
    private String correo;
    private String contrasena;

    public Cliente() {
    }
    
    

    public Cliente(int cedula_cliente, String nombre_cliente, String nombre_usuario, String direccion, String telefono, String correo, String contrasena) {
        this.cedula_cliente = cedula_cliente;
        this.nombre_cliente = nombre_cliente;
        this.nombre_usuario = nombre_usuario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
    
    
}
