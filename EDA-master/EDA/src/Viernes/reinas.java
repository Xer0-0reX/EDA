/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Viernes;

/**
 *
 * @author hca
 */
public class reinas {
    private String a[][];
    int z;
    
    public reinas() {
        a=new String[8][8];
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                a[i][j]="0";
        z=0;
    }
    
    public String toString(){
        StringBuilder cad=new StringBuilder();
        for(int i=0;i<8;i++){
            cad.append("[");
            for(int j=0;j<8;j++){
                cad.append(a[i][j]+" ");
            }
            cad.append("]\n");
        }
        
        return cad.toString();
    }
    public void reinicio(){
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                a[i][j]="0";
    }
    
    
    public void permuta(String S1, String S2){
        if(S1.length()==0){
            agrega(S2);
            reinicio();
        }
            
        for(int i=0;i<S1.length();i++){
            char p=S1.charAt(i);
            String resto=S1.substring(0,i)+S1.substring(i+1);
            permuta(resto, p+S2);
        }
    }
    
    public void agrega(String d){
        for(int i=0;i<8;i++){
            int f=d.charAt(i)-49;
//            System.out.println("f es "+f);
            a[i][f]="1";           
        }   
         boolean res=true;
        for(int i=0;i<8;i++){
            int f=d.charAt(i)-49;
            int m=i,g=f;
            while(m<7 &&  g<7 && res ){
                m++;
                g++;
                if(a[m][g].equals(a[i][f])){
//                    System.out.println("No se puede");
                    res=false;
                    m=8;
                }
            }
            
            m=i;
            g=f;
            while(g>0 && m<7 && res){
             m++;
             g--;
                if(a[m][g].equals(a[i][f])){
//                    System.out.println("No se puede");
                    res=false; 
                    m=0;
                }
            } 
        } 
        if(res){
            System.out.println("Si se puede "+z++);
         System.out.println(toString());   
        }
        
    }
    
      public static void main(String[] args) {
        // TODO code application logic here
          reinas a= new reinas();
          
          System.out.println(a.toString());
          a.permuta("12345678", "");
      }
    
}
