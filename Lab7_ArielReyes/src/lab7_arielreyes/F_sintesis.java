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
public class F_sintesis implements Serializable{
   int generacion_codigo_inter; 
   int optimizador_code;
   int generador_codigo; 

    public F_sintesis(int generacion_codigo_inter, int optimizador_code, int generador_codigo) {
        this.generacion_codigo_inter = generacion_codigo_inter;
        this.optimizador_code = optimizador_code;
        this.generador_codigo = generador_codigo;
    }
   
       private static final long SerialVersionUID = 737L;

    public int getGeneracion_codigo_inter() {
        return generacion_codigo_inter;
    }

    public void setGeneracion_codigo_inter(int generacion_codigo_inter) {
        this.generacion_codigo_inter = generacion_codigo_inter;
    }

    public int getOptimizador_code() {
        return optimizador_code;
    }

    public void setOptimizador_code(int optimizador_code) {
        this.optimizador_code = optimizador_code;
    }

    public int getGenerador_codigo() {
        return generador_codigo;
    }

    public void setGenerador_codigo(int generador_codigo) {
        this.generador_codigo = generador_codigo;
    }

    @Override
    public String toString() {
        return "F_sintesis{" + "generacion_codigo_inter=" + generacion_codigo_inter + ", optimizador_code=" + optimizador_code + ", generador_codigo=" + generador_codigo + '}';
    }
       
       

   
     
}
