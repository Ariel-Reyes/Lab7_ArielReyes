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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public class admi_usuario {
    ArrayList<usuario> lista_usuario = new ArrayList(); 
    File archivo= null; 

    public ArrayList<usuario> getLista_usuario() {
        return lista_usuario;
    }

    public void setLista_usuario(ArrayList<usuario> lista_usuario) {
        this.lista_usuario = lista_usuario;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     public admi_usuario(String path) {
        archivo = new File(path);
    }
    
       public void setUsuario(usuario t) {
        this.lista_usuario.add(t);
    }
       
       
        public void cargarArchivo() {
        try {            
            lista_usuario = new ArrayList();
            usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (usuario) objeto.readObject()) != null) {
                        lista_usuario.add(temp);
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
            for (usuario t : lista_usuario) {
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
