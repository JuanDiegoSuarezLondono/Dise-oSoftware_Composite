/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import Nodo.Nodo;

/**
 *
 * @author suare
 */
public class Archivo extends Nodo{
    private String tipoDeArhivo;
    public Archivo( String nombre,String myTipoDeArchivo)
    {
        tipoDeArhivo = myTipoDeArchivo;
        this.setTipoNodo(1);
        this.setNombre( nombre );
    }
    @Override
     public void mostrar()
    {
        System.out.println( "Archivo: [" + this.getNombre() +"."+tipoDeArhivo+"]" );
    }    
}
