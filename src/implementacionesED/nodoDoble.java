package implementacionesED;

public class nodoDoble<T>{
    public T dato;
    nodoDoble<T> next, prev;
    public nodoDoble(T element){
        this(element,null,null);	//para cuando aún no hay nodos
    }
    public nodoDoble(T element, nodoDoble<T> s, nodoDoble<T> p){
        dato = element;
        next= s;
        prev = p;   //para cuando ya hay nodos
    }
}