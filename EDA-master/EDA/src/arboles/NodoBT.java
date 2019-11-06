/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author hca
 */
public class NodoBT <T extends Comparable<T>>{
    T element;
    NodoBT<T> izq, der, papa;
    public NodoBT(){
    izq = null; der = null; papa=null;
    }
    public NodoBT(T elem){
        element = elem;
        izq = null; der = null;
    }//builder

    public int numDescendientes(){
        int hijos = 0;
        if (izq != null)
            hijos += 1 + izq.numDescendientes();
        if (der != null)
            hijos += 1 + der.numDescendientes();
        return hijos;
    }//method

    public T getElement(){
        return element;
    }//method
    
    public void setElem(T eleme){
        element=eleme;
    }

    public String toString(){
        return element.toString() + "\n[" + izq.toString() +"---" + der.toString()+"]";
    }//method

    public NodoBT getDer(){
        return der;
    }//method

    public NodoBT getIzq(){
        return izq;
    }//method
    
    public NodoBT getPapa(){
        return papa;
    }//method

    public void setIzq(T elem){
        izq = new NodoBT(elem);
    }//method

    public void setDer(T elem){
        der = new NodoBT(elem);
    }//method
    public void setPapa(T elem){
        papa = new NodoBT(elem);
    }//method
    
    public void setIzqN(NodoBT nodo){
        izq = nodo;
    }//method

    public void setDerN(NodoBT nodo){
        der = nodo;
    }//method

    public void setPapaN(NodoBT nodo){
        papa = nodo;
    }//method
    
    
    public void cuelga(NodoBT<T> nodo){        
        if (nodo.getElement().compareTo(element) < 0){
            izq = nodo;                
        }//if
        else{
            der = nodo;
        }//else        
        nodo.setPapa((T) this);
    }//method

}//class
