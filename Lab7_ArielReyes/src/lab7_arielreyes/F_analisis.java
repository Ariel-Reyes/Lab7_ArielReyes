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
public class F_analisis implements Serializable {
    int anali_lexico; 
    int anali_sintactico; 
    int anali_sematico; 

    public F_analisis(int anali_lexico, int anali_sintactico, int anali_sematico) {
        this.anali_lexico = anali_lexico;
        this.anali_sintactico = anali_sintactico;
        this.anali_sematico = anali_sematico;
    }
       private static final long SerialVersionUID = 777L;

    public int getAnali_lexico() {
        return anali_lexico;
    }

    public void setAnali_lexico(int anali_lexico) {
        this.anali_lexico = anali_lexico;
    }

    public int getAnali_sintactico() {
        return anali_sintactico;
    }

    public void setAnali_sintactico(int anali_sintactico) {
        this.anali_sintactico = anali_sintactico;
    }

    public int getAnali_sematico() {
        return anali_sematico;
    }

    public void setAnali_sematico(int anali_sematico) {
        this.anali_sematico = anali_sematico;
    }

    @Override
    public String toString() {
        return "F_analisis{" + "anali_lexico=" + anali_lexico + ", anali_sintactico=" + anali_sintactico + ", anali_sematico=" + anali_sematico + '}';
    }
       
       

}
