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
public class CategoriaPro {
    
    private int codigo_cate;
    private String nombre;

    public CategoriaPro() {
    }

    public CategoriaPro(int codigo_cate, String nombre) {
        this.codigo_cate = codigo_cate;
        this.nombre = nombre;
    }

    public CategoriaPro(String nombre) {
        this.nombre = nombre;
    }
    
    

    public int getCodigo_cate() {
        return codigo_cate;
    }

    public void setCodigo_cate(int codigo_cate) {
        this.codigo_cate = codigo_cate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
