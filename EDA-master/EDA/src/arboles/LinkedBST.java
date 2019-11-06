/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author hca
 */
public class LinkedBST<T extends Comparable<T>> extends LinkedBT<T> implements BSTADT<T> {

    @Override
    public  void add(T elem) {
       if(elem!=null){
        if(!isEmpty()){
            if(elem.compareTo(raiz.element)<0){
                add(elem, raiz.getIzq(), raiz);
            }
            else
                add(elem,raiz.getDer(), raiz);
        }
        else
            raiz=new NodoBT(elem);
       }
    }private void add(T elem, NodoBT<T> a, NodoBT<T> p){
        if(a!= null){
            if(elem.compareTo(a.element)<0)
                add(elem, a.getIzq(), p=a);
            
            else
                add(elem,a.getDer(), p=a);
        }
        else {
            if(elem.compareTo(p.element)<0)
                p.setIzq(elem);
            
            else
                p.setDer(elem);
        }
    }

    @Override
    public T remove(T dato) {
//        NodoBT<T> a=contains(dato);
//        if(a!=null){
//            if(a.getDer()==null && a.getIzq()==null){
//                
//            }
//        }
        return null;
             
    }
    
    
    private NodoBT<T> busca (NodoBT<T> n, T elem){
        boolean enc = false;
        while(!enc && n!=null){
            if (elem.compareTo(n.getElement())<0)
                n=n.getIzq();
                else
                if(elem.compareTo(n.getElement())>0)
                    n=n.getDer();
                    else
                    enc = true;
        }
        return n;
    }

    
     public boolean elimina(T elem){
        NodoBT n = busca(raiz, elem);
        if (n == null)
            return false;
        //Si la raiz es una hoja
        if (n.getDer().getElement()==null && n.getIzq().getElement()==null){
            if (n.getPapa()==null)
                n = null;
            else
                if (n.getElement().compareTo(n.getPapa().getElement())<0)
                    n.getPapa().setIzqN(null);
                else
                    n.getPapa().setDerN(null);        
            
        }
        else//Si solo tiene un hijo
            if (n.getIzq()==null){
            if(n == raiz){
                raiz = n.getDer();
                raiz.setPapa(null);
            }else
                n.getPapa().cuelga(n.getDer());
            }else
            if (n.getDer()==null){
            if(n == raiz){
                raiz = n.getIzq();
                raiz.setPapa(null);
            }else
                n.getPapa().cuelga(n.getIzq());
            }
            else{//Si tiene dos hijos. 
                NodoBT<T> suc = n.getDer();
                while(suc.getIzq()!=null)
                    suc = suc.getIzq();
                n.setElem(suc.getElement());
                if(suc == n.getDer())
                    n.setDer((Comparable) suc.getDer());
                else
                    suc.getPapa().setIzq((Comparable) suc.getDer());
            }        
            cont--;
            return true;
    }


    @Override
    public T removeMin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T findMin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeMax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T findMax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void imprime(NodoBT<T> a){
        if(a!=null){
            System.out.println(a.element);
            System.out.println("por izquierda de "+ a.element+": ");
            imprime(a.getIzq());
            System.out.println("Por derecha de "+ a.element+": ");
           imprime(a.getDer());
            
        }
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
     LinkedBST<Integer> a =new LinkedBST<Integer>();
//     a.add(20);
//     a.add(30);
//     a.add(15);
//     a.add(20);
//     a.add(14);
//     a.add(21);
//     a.add(20);
     a.add(1);
     a.add(2);
     a.add(-1);
     a.imprime(a.raiz);
        
     }
    
}
