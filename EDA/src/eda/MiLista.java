/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eda;

import java.util.ArrayList;

/**
 *
 * @author edi
 */
public class MiLista<T> extends Nodo<T>{

   
    Nodo cabeza;
    int con;

    public MiLista() {
    cabeza=new Nodo();
    con=0;
    }
    
    public boolean isEmpty(){
        return con==0;
    }
    
    public boolean agrega(T dato){
        boolean res=false;
        if(dato!=null){
            Nodo n=new Nodo(dato);
            Nodo g=cabeza.getDi();
            cabeza.setDi(n);
            cabeza.getDi().setDi(g);
            res=true;
            con++;
        }
        
        return res;
    }
    
    public void invierte(){
        if(cabeza.getDi()!=null){
            Nodo n=cabeza.getDi();
            invierte(n);
        }
    }private void invierte(Nodo n){
        if(n.getDi()==null)
            cabeza.setDi(n);
        else{
            invierte(n.getDi());
            n.getDi().setDi(n);
            n.setDi(null);
        }
    }
    
    public String toString(){
        StringBuilder cad=new StringBuilder();
        Nodo n=cabeza.getDi();
        while(n!=null){
            cad.append(n.getDato());
            n=n.getDi();
        }
        return cad.toString();
    }
    
    public int cuenta(){
        if(isEmpty())
            return 0;
        else
            return cuenta(1,cabeza.getDi());
    }private int cuenta(int i, Nodo n){
        if(n.getDi()==null)
            return i;
        else
            return cuenta(i+1,n.getDi());
    }
    
    public boolean elimina(T dato){
        if(isEmpty())
            return false;
        else {
            Nodo n, g;
            n=cabeza;
            g=cabeza.getDi();
            return elimina(dato, n,g);
        }
    }private boolean elimina(T dato, Nodo n, Nodo g){
        if(g==null)
            return false;
    else          
        if(g.getDato().equals(dato)){
            g=g.getDi();
            n.setDi(g);
            return true;
        }
        else{
            n=g;
            g=g.getDi();
            return elimina(dato, n,g);
        
        }
    }
    
    public void voltea(){
        if(isEmpty())
           return;
        Nodo n=cabeza.getDi();
        voltea(n);
    }private Nodo<T> voltea(Nodo n){
        if(n==null)
            return cabeza;       
            Object dato=n.getDato();
            Nodo g=voltea(n.getDi()).getDi();
            g.setDato(dato);
            return g;   
           
    }
    
//    public static String comb(String cad){
//        StringBuilder ca=new StringBuilder();
//        int t=cad.length();
//        int i=0;
//        return comb(cad, ca, t,i,0).toString();
//        
//
//    } private static String comb(String cad, StringBuilder ca, int t, int i,int j) {
//        if(i<t){
//            if(j==t){
//                return comb(cad, ca, t,i+1,0);
//            }
//            else
//                if(j==i){
//                    return comb(cad, ca, t,i,j+1);
//            }
//            
//        }
//
//    }
    
    public static String reto(String cad){
       StringBuilder ca=new StringBuilder();
       int i=0,t=cad.length(),j=0,l=0;
        System.out.println(t);
       
       while (i<t){
           ca.append(cad.charAt(i));
           j=0;
           l=0;
           while(l<t-1){
               if(j==i)
                   j++;               
               if(j==t)
                   j=0;
               ca.append(cad.charAt(j));
               j++;
               l++;             
           }
           l=0;
           j=t-1;
            ca.append("\n"+cad.charAt(i));
           while(l<t-1){
               if(j==i)
                   j++;               
               if(j==t)
                   j=0;
               if(j==i)
                   j++;       
                if(j==t)
                   j=0;
               ca.append(cad.charAt(j));
               j++;
               l++;             
           }
           i++;
           ca.append("\n");
       }
       return ca.toString();
    }
    public static void permuta(String S1, String S2){
        if(S1.length()==0)
            System.out.println(S2);
        for(int i=0;i<S1.length();i++){
            char p=S1.charAt(i);
            String resto=S1.substring(0,i)+S1.substring(i+1);
            permuta(resto, p+S2);
        }
    }
    
//    Dadas 2 cadenas S1 y S2. Encontrar cual es el minimo de operacionespara
//    convertir S1 en S2 dondelas operaciones posibles son
//            sustitucion
//            remocion
//            adiciom
//    
    public static int ggogle(String s1, String s2){
        ArrayList<Character> ss1=new ArrayList<Character>();
        int con=0;
        for(int i=0;i<s1.length();i++)
            ss1.add(s1.charAt(i));
        for(int j=0;j<s2.length();j++){
            if(ss1.contains(s2.charAt(j))){
                if(s1.charAt(j)!=s2.charAt(j))
                    con++;
            
            }else
                    con++;
        } 
        if(s1.length()>s2.length())
            con+=s1.length()-s2.length();
    return con;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
    MiLista r=new MiLista();
    r.agrega("5");
    r.agrega("4");
    r.agrega("3");
    r.agrega("2");
    r.agrega("1");
        System.out.print("\n"+r.toString());
        r.invierte();
        System.out.print("\n"+r.toString());
        r.voltea();
        System.out.print("\n"+r.toString());
        System.out.print("\n"+r.cuenta());
        System.out.print("\n"+r.elimina("5"));
        System.out.print("\n"+r.elimina("6"));
        System.out.print("\n"+r.cuenta());
        System.out.print("\n"+r.toString());
        System.out.println("\n");
        permuta("123", "");
     
        
    
    } 
    
    
}
 