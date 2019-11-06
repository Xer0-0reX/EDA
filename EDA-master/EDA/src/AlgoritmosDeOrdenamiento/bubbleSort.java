/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeOrdenamiento;

/**
 *
 * @author hca
 */
public class bubbleSort {
    public static void bubbleSort(int[] list)
    {
        for(int i=0; i<list.length; i++)
        {
            for(int j=0; j<list.length-i; j++)
            {
                if(list[i] > list[j])
                {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }

        }
    }

}
