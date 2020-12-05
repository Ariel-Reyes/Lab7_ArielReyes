/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_arielreyes;

import javax.swing.JProgressBar;

/**
 *
 * @author Ariel
 */
public class barra_analicis extends Thread{
    private JProgressBar barra_uno;
    int analicis_lexico; 
    int analisis_sintactico; 
    int analisis_sematico; 

    public barra_analicis(JProgressBar barra_uno, int analicis_lexico, int analisis_sintactico, int analisis_sematico) {
        this.barra_uno = barra_uno;
        this.analicis_lexico = analicis_lexico;
        this.analisis_sintactico = analisis_sintactico;
        this.analisis_sematico = analisis_sematico;
    }

    public JProgressBar getBarra_uno() {
        return barra_uno;
    }

    public void setBarra_uno(JProgressBar barra_uno) {
        this.barra_uno = barra_uno;
    }

    public int getAnalicis_lexico() {
        return analicis_lexico;
    }

    public void setAnalicis_lexico(int analicis_lexico) {
        this.analicis_lexico = analicis_lexico;
    }

    public int getAnalisis_sintactico() {
        return analisis_sintactico;
    }

    public void setAnalisis_sintactico(int analisis_sintactico) {
        this.analisis_sintactico = analisis_sintactico;
    }
    
    public int getAnalisis_sematico() {
        return analisis_sematico;
    }
    
    public void setAnalisis_sematico(int analisis_sematico) {
        this.analisis_sematico = analisis_sematico;
    }

    @Override
    public void run() {
        
        while (true) {
            int cont = 0;
            while (cont < analicis_lexico) {
                barra_uno.setValue(cont);
                
                cont++;
            }
            if (cont > analicis_lexico) {
                barra_uno.removeAll();
                int co = 0;
                while (co < analisis_sintactico) {
                    barra_uno.setValue(analisis_sintactico-1);
                    co++;
                }
                if (co > analisis_sintactico) {
                    int c = 0;
                    while (c < analisis_sematico) {
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
