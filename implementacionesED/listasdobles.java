package implementacionesED; 

public class listasDobles<T> {
    private nodoDoble init, fin;

    public listasdobles() {
        init = fin = null;
    }

    public boolean estaVacia() {
        return init == null;  //saber si está vacía
    }

    public void agregarFinal(int element) {
        if (!estaVacia()) {
            fin = new nodoDoble(element, null, fin);
            fin.prev.next = fin;

        } else {
            init = fin = new nodoDoble(element);
        }
    }

    public void agregarInicio(int element) {
        if (!vacio()) {
            init = new nodoDoble(element, init, null);
            iniciador.next.prev = init;

        } else {
            init = fin = new nodoDoble(element);
        }
    }

    public void imprimirListaInicioFin() {
        if (!EstaVacia()) {
            String datRet" <=> ";
            nododoble aux = init;
            while (aux != null) {
                datRet = datRet + "{"+aux.dato+"}";
                aux = aux.next;
            }
            System.out.println(datRet);
        }
    }
    
    public void mostrar_lista_finxinicio() {
        if (!EstaVacia()) {
            String datRet="<=>";
            nododoble aux = fin;
            while (aux != null) {
                datRet = datRet + "{"+aux.dato+"}";
                aux = aux.prev;
            }
            System.out.println(datRet);
        }
    }
    
    public int eliminarInicio(){
        int element = init.dato;
        if(init == fin){
            init = fin = null;
        }else{
            init = init.next;
            init.prev = null;

        }
        return element;
    }
    
    public int eliminarFinal(){
        int elemento = fin.dato;
        if(init == fin){
            init = finv = null;
        }else{
            fin = fin.pre;
            fin.next = null;
        }
        return elemento;
    }
    }

