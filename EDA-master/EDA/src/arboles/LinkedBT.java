/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Iterator;

/**
 *
 * @author hca
 */
public class LinkedBT<T extends Comparable<T>> implements BinaryTreeADT<T> {

    protected NodoBT<T> raiz;
    protected int cont;
    
    public LinkedBT(){
        cont=0;
    }
    
    public LinkedBT(T elem){
        raiz=new NodoBT(elem);
        cont=0;
    }

    @Override
    public boolean isEmpty() {
        return raiz == null;
    }//method

    @Override
    public int size() {
        return cont;
    }//method


    public NodoBT<T> contains(T elem) {
        if (isEmpty() || elem == null)
            return null;
       
        return contains(elem, raiz) ;
    }//method

    private NodoBT<T> contains(T elem, NodoBT nodo){
        if (nodo == null || nodo.element == null)
            return null;
        if (nodo.getElement().equals(elem))
            return nodo;
         NodoBT<T> a=contains(elem, nodo.getDer());
         NodoBT<T> b=contains(elem, nodo.getDer());
         if(a!=null)
             return a;
         else return b;

    }//method

    @Override
    public T find(T elemento) {
        return null;
    }//method   

    @Override
    public Iterator<T> inOrden() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<T> preOrden() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<T> postOrden() {
        // TODO Auto-generated method stub
        return null;
    }
    
    public int Altura(){
        if (raiz!=null){
            NodoBT<T> a=raiz;
            return Altura(raiz, 0);                    
         }
        else 
            return 0;
    }

    private int Altura(NodoBT<T> a, int i) {      
        if(a==null)
            return i;
        else {
            return Math.max(Altura(a.getIzq(), i+1), Altura(a.getDer(),i+1));
        }
            
    }
    
    
    
}//method