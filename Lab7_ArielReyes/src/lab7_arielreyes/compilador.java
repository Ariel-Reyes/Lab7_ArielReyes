/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_arielreyes;

import java.io.Serializable;
import javax.swing.JTable;

/**
 *
 * @author Ariel
 */
public class compilador  implements Serializable{
    String nombre; 
    String nombre_creador; 
    int numero_linea; 
    F_analisis fase_analisis; 
    F_sintesis fase_sintesis; 
    JTable tabla;
    private static final long SerialVersionUID = 777L;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_creador() {
        return nombre_creador;
    }

    public void setNombre_creador(String nombre_creador) {
        this.nombre_creador = nombre_creador;
    }

    public int getNumero_linea() {
        return numero_linea;
    }

    public void setNumero_linea(int numero_linea) {
        this.numero_linea = numero_linea;
    }

    public F_analisis getFase_analisis() {
        return fase_analisis;
    }

    public void setFase_analisis(F_analisis fase_analisis) {
        this.fase_analisis = fase_analisis;
    }

    public F_sintesis getFase_sintesis() {
        return fase_sintesis;
    }

    public void setFase_sintesis(F_sintesis fase_sintesis) {
        this.fase_sintesis = fase_sintesis;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public String toString() {
        return "compilador{" + "nombre=" + nombre + ", nombre_creador=" + nombre_creador + ", numero_linea=" + numero_linea + ", fase_analisis=" + fase_analisis + ", fase_sintesis=" + fase_sintesis + ", tabla=" + tabla + '}';
    }


    
    
    
    
}
