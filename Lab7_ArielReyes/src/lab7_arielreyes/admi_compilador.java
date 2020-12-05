/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_arielreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Ariel
 */
public class admi_compilador {

    ArrayList<compilador> lista_compi = new ArrayList();
    File archivo = null;

    public ArrayList<compilador> getLista_compi() {
        return lista_compi;
    }

       
    
    
    public void setLista_compi(ArrayList<compilador> lista_compi) {
        this.lista_compi = lista_compi;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public admi_compilador(String path) {
        archivo = new File(path);
    }

    public void setCompilador(compilador t) {
        this.lista_compi.add(t);
    }

    public void cargarArchivo() {
        try {
            lista_compi = new ArrayList();
            compilador temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (compilador) objeto.readObject()) != null) {
                        lista_compi.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (compilador t : lista_compi) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
  

}
