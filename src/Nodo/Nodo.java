/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo;

/**
 *
 * @author suare
 */
public abstract class Nodo {
    protected String nombre = "";
    protected int tipoNodo;
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre( String nombre )
    {
        this.nombre = nombre;
    }
    public int getTipoNodo()
    {
        return this.tipoNodo;
    }
    public void setTipoNodo( int tipoNodo )
    {
        this.tipoNodo = tipoNodo;
    }    
    public abstract void mostrar();    
}
