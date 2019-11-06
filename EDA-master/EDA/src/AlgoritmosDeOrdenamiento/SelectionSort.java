/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeOrdenamiento;

/**
 *
 * @author hca
 */
public class SelectionSort {
    
    public static <T extends Comparable<T>> void selectionSort(T[] a, int t){
        for(int i=0;i<t;i++){
            int min=i;
            for(int j=i+1;j<t;j++){
                if(a[j].compareTo(a[min])<0)
                    min=j;
            }
            T aux=a[i];
            a[i]=a[min];
            a[min]=aux;
        }
 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Integer a[]=new Integer[10];
       a[0]=25;
       a[1]=2000;
       a[2]=3;
       a[3]=33;
       a[4]=-1;
       a[5]=666;
       a[6]=51;
       a[7]=777;
       a[8]=10;
       a[9]=2;
      for(int i=0;i<10;i++)
            System.out.print(a[i]+" ");
      
        System.out.println("\n");
        selectionSort(a, 10);
           
      for(int i=0;i<10;i++)
            System.out.print(a[i]+" ");
    
    }
    
}
