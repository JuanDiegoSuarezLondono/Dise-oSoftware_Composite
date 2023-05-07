/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpeta;

import Nodo.Nodo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author suare
 */
public class Carpeta extends Nodo{
     private List<Nodo> nodos = new ArrayList<Nodo>();
    // ----------------------------
    public Carpeta( String nombre )
    {
        this.setTipoNodo(2);
        this.setNombre( nombre );
    }
    public void insertarNodo( Nodo nodo )
    {
        nodos.add( nodo );
    }
    public void eliminarNodo( Nodo nodo )
    {
        nodos.remove( nodo );
    }
    public List<Nodo> getNodos()
    {
        return nodos;
    }
    public Nodo getNodo( int posicion )
    {
        return nodos.get( posicion );
    }
    @Override
     public void mostrar()
    {
        System.out.println( "Listando carpeta [" + this.getNombre() + "]" );
         for (Nodo nodo : nodos)
        {
             nodo.mostrar();
        }
    }    
}
