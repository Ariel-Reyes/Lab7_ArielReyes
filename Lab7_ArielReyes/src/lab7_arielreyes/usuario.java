/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_arielreyes;

import java.io.Serializable;

/**
 *
 * @author Ariel
 */
public class usuario implements Serializable{
 
    String nombre; 
    String apellido; 
    String contra; 
    int nota_final; 
    String usuario; 

    public usuario(String nombre, String apellido, String contra, int nota_final, String usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.nota_final = nota_final;
        this.usuario = usuario; 
    }
    private static final long SerialVersionUID = 770L;

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getNota_final() {
        return nota_final;
    }

    public void setNota_final(int nota_final) {
        this.nota_final = nota_final;
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contra=" + contra + ", nota_final=" + nota_final + ", usuario=" + usuario + '}';
    }

    
    
    
}
