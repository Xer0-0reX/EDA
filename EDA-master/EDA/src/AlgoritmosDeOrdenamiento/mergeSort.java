/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeOrdenamiento;

/**
 *
 * @author hca
 */
public class mergeSort {
    public <T> void mergeSort(T[] d, int i, int f){
        T[] te;
        int ind,iz,de;
        if(i==f)
            return;
        int tam=f-i+1;
        int mi=(f+i)/2;
        te=(T[])(new Comparable[tam]);
        mergeSort(d,i,mi);
        mergeSort(d,mi+1,f);
    }
            
    
}
