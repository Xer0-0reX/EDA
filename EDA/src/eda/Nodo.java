/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eda;

/**
 *
 * @author edi
 */
public class Nodo<T> {
    T dato;
    Nodo<T> di;

    public Nodo() {
    }

    public Nodo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getDi() {
        return di;
    }

    public void setDi(Nodo<T> di) {
        this.di = di;
    }
    
    
    
}
