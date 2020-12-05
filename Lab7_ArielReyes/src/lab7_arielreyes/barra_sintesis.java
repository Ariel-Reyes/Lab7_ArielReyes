/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_arielreyes;

import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author Ariel
 */
public class barra_sintesis extends Thread {
      private JProgressBar barra_uno;
      int generacion_codigo; 
      int optimizador_codigo; 
      int generador_codigo; 

    public barra_sintesis(JProgressBar barra_uno, int generacion_codigo, int optimizador_codigo, int generador_codigo) {
        this.barra_uno = barra_uno;
        this.generacion_codigo = generacion_codigo;
        this.optimizador_codigo = optimizador_codigo;
        this.generador_codigo = generador_codigo;
    }

    public JProgressBar getBarra_uno() {
        return barra_uno;
    }

    public void setBarra_uno(JProgressBar barra_uno) {
        this.barra_uno = barra_uno;
    }

    public int getGeneracion_codigo() {
        return generacion_codigo;
    }

    public void setGeneracion_codigo(int generacion_codigo) {
        this.generacion_codigo = generacion_codigo;
    }

    public int getOptimizador_codigo() {
        return optimizador_codigo;
    }

    public void setOptimizador_codigo(int optimizador_codigo) {
        this.optimizador_codigo = optimizador_codigo;
    }

    public int getGenerador_codigo() {
        return generador_codigo;
    }

    public void setGenerador_codigo(int generador_codigo) {
        this.generador_codigo = generador_codigo;
    }
   
      @Override 
      public void run(){
          
          
           while (true) {
            int cont = 0;
            while (cont < generacion_codigo) {
                barra_uno.setValue(cont);
                
                cont++;
            }
            if (cont > generacion_codigo) {
                barra_uno.removeAll();
                int co = 0;
                while (co < optimizador_codigo) {
                    barra_uno.setValue(co);
                    co++;
                }
                if (co > optimizador_codigo) {
                    int c = 0;
                    while (c < generador_codigo) {
                        barra_uno.setValue(c);
                        barra_uno.repaint();
                        c++;
                    }
                }

            }
            try{
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }
          
          
      }


