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
public class F_sintesis {
     int num_lineas;

    public F_sintesis() {
    }

    public F_sintesis(int num_lineas) {
        this.num_lineas = num_lineas;
    }

    public int getNum_lineas() {
        return num_lineas;
    }

    public void setNum_lineas(int num_lineas) {
        this.num_lineas = num_lineas;
    }

    @Override
    public String toString() {
        return "F_sintesis{" + "num_lineas=" + num_lineas + '}';
    }
     
}
