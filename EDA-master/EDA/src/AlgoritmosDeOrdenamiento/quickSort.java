/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeOrdenamiento;

/**
 *
 * @author hca
 */
public class quickSort {
    private int a[];
    private int con;

    public quickSort() {
    a=new int[10];
    con=0;
    }
    
    public boolean Alta(int d){
        boolean res=false;
        if(con<10){
            a[con]=d;
            con++;
            res=true;
        }
        return res;
    }
    
    public  void quickSort(){
            if(con>0){
                quickSort(0, con);    
        }
    }private void quickSort( int i, int f){
       if(f-i<=0){
           return;
       }
       int piv=i;
       int pfp=recorrePivote(f,piv, i+1);
            quickSort( i, pfp);
            quickSort(pfp+1,f);
       
       
    }private int recorrePivote(int f, int piv, int conn){
        if(conn!=f){
            int aux;
            if(a[conn]<a[piv]){
                aux=a[conn];
                recorreDerecha( piv, conn);
                a[piv]=aux;
                piv++;
            }
            return recorrePivote(f, piv, conn+1);
        }
        
        return piv;
    }private void recorreDerecha(int i,int f){
        if(f!=i){
            a[f]=a[f-1];
            recorreDerecha(i, f-1);
        }
        
    }
    
    public String toString(){
        StringBuilder cad=new StringBuilder();
        for(int i=0;i<con;i++)
            cad.append(a[i]+" ");
            return cad.toString();
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        quickSort b=new quickSort();
        b.Alta(25);
        b.Alta(2000);
        b.Alta(3);
        b.Alta(33);
        b.Alta(-1);
        b.Alta(666);
        b.Alta(51);
        b.Alta(777);
        b.Alta(10);
        b.Alta(2);
      
        System.out.println("\n"+b.toString());
        b.quickSort();
        System.out.println("\n"+b.toString());     
     
    
    } 
}

    