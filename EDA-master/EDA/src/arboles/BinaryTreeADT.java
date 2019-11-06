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
public interface BinaryTreeADT<T extends Comparable<T>> {
      public boolean isEmpty();
    public int size();
    public NodoBT<T> contains(T elem);
    public T find (T elem);
    public Iterator<T> inOrden();
    public Iterator<T> preOrden();
    public Iterator<T> postOrden();
}
