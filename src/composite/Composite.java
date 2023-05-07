/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import archivo.Archivo;
import carpeta.Carpeta;

/**
 *
 * @author suare
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carpeta c1 = new Carpeta("CARPETA_1");
        c1.insertarNodo( new Archivo("Archivo1","txt") );
        c1.insertarNodo( new Archivo("Archivo2","xlm") );
        c1.insertarNodo( new Archivo("Archivo3","doc") );
        Carpeta c2 = new Carpeta("CARPETA_2");
        c2.insertarNodo( new Archivo("Archivo4","pem") );
        c2.insertarNodo( new Archivo("Archivo5","txt") );
        c1.insertarNodo( c2 );
        c1.insertarNodo( new Archivo("Archivo6","bin") );
        c1.mostrar();
        System.out.println("--------------------");
        c1.eliminarNodo( c2 );
        c1.mostrar();
    }
    
}
