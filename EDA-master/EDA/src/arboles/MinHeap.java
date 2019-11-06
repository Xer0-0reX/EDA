/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author hca
 */
public class MinHeap <T extends Comparable <T>> implements HeapADT{

    private NodoHeap<T>[] heap;
    private int cont;
    
    public MinHeap(){
        heap = (NodoHeap[])(new Object[10]);
        cont = 0;
    }//builder
    
    
    @Override
    public void add(Comparable elem) {
        NodoHeap<T> n = new NodoHeap(elem), temp;
        
        if (isEmpty()){
            heap[1] = n;
            return;
        }//if
        else{
            if (cont == heap.length - 1)
                expand();
            heap[++cont] = n;
            int papa = cont >> 1, pos = cont;
            while (papa != 0)
                if (heap[pos].getElem().compareTo(heap[papa].getElem()) < 0){
                    temp = heap[pos];
                    heap[pos] = heap[papa];
                    heap[papa] = temp;
                    pos = papa;
                    papa = papa >> 1;                    
                }//if
            
        }//else
            
        
        return;
    }//method
    
    private void expand(){
        NodoHeap<T> [] nuevo = (NodoHeap[])(new Object[heap.length * 2]);
        for (int i = 1; i < heap.length; i ++)
            nuevo[i] = heap[i];
        heap = nuevo;
    }//method

    @Override
    public Comparable delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparable find(Comparable elem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }//method
    
    @Override
    public boolean isEmpty(){
        return cont == 0;
    }//method
    
    
}//class
