/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author hca
 */
public interface HeapADT <T extends Comparable <T>> {
    public void add(T elem);
    public T delete();
    public T find(T elem);
    public boolean isEmpty();
}//interface
