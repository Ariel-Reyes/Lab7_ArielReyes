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
public class Optimizar_Codigo extends F_sintesis {

    public Optimizar_Codigo() {
    }

    public Optimizar_Codigo(int num_lineas) {
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
        return "Optimizar_Codigo{" + num_lineas + '}';
    }

}
