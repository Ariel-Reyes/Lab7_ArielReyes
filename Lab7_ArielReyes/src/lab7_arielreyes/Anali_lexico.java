/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_arielreyes;

/**
 *
 * @author Ariel
 */
public class Anali_lexico extends F_analisis{

    public Anali_lexico() {
    }

    public Anali_lexico(int num_lineas) {
        super(num_lineas);
    }

    public int getNum_lineas() {
        return num_lineas;
    }

    public void setNum_lineas(int num_lineas) {
        this.num_lineas = num_lineas;
    }

    @Override
    public String toString() {
        return "Anali_lexico{" + num_lineas + '}';
    }


}
