package implementacionesED;

import java.util.EmptyStackException;

public class listaDoble<T> {
    private nodoDoble init, fin;

    public listaDoble() {
        init = fin = null;
    }

    public boolean estaVacia() {
        return init == null;  //saber si está vacía
    }

    public boolean encontrarElemento(T element) {
		nodoDoble<T> aux = this.init;
		boolean equal = false;
		//Recorrer lista
		while(aux != null){
			//Comparar y encontrar
			if( element ==  aux.dato ) {
				equal = true;
				break;
			}
		aux = aux.next;
		}
	return equal;
	}

    public nodoDoble<T> retornarElemento(T dataIn){
		nodoDoble<T> retNode = null;
		nodoDoble<T> aux = this.init;
	
		//Recorrer lista
		while(aux != null) {
			//Comparar y encontrar
			if(aux.dato == dataIn) {
				retNode = aux;
				break;
			}
		aux = aux.next;
		}
		//Si no existe
		if(aux.dato != dataIn) {
			return null;
		}
	return retNode;
	}
    
    public void eliminar(T element) {
    	nodoDoble<T> temp = init;
    	nodoDoble<T> prev = null;
    	
    		if(estaVacia()){
    			throw new EmptyStackException();
    		}
    	
    		if(temp != null && temp.dato == element ) {
    			init = init.next;
    			return;
    		}
    		
    		while(temp != null && temp.dato != element) {
    			prev = temp;
    			temp = temp.next;
    		}
    		if(temp == null) {
    			return;
    		}
    		prev.next = temp.next;
    		
    	}
    
    public void agregarFinal(T element) {
        if (!estaVacia()) {
            fin = new nodoDoble(element, null, fin);
            fin.prev.next = fin;

        } else {
            init = fin = new nodoDoble(element);
        }
    }

    public void agregarInicio(T element) {
        if (!estaVacia()) {
            init = new nodoDoble(element, init, null);
            init.next.prev = init;

        } else {
            init = fin = new nodoDoble(element);
        }
    }

    public void imprimirListaInicioFin() {
        if (!estaVacia()) {
            String datRet = " ";
            nodoDoble aux = init;
            while (aux != null) {
                datRet = datRet + " " + aux.dato +" ";
                aux = aux.next;
            }
            System.out.println(datRet + " ");
        }
    }
    
    public void imprimirListaFinInicio() {
        if (!estaVacia()) {
            String datRet=" ";
            nodoDoble<T> aux = fin;
            while (aux != null) {
                datRet = datRet + " "+ aux.dato +" ";
                aux = aux.prev;
            }
            System.out.println(datRet);
        }
    }
    
    public void eliminarInicio(){
        if(init == fin){
            init = fin = null;
        }else{
            init = init.next;
            init.prev = null;

        }
    }
    
    public void eliminarFinal(){
        if(init == fin){
            init = fin = null;
        }else{
            fin = fin.prev;
            fin.next = null;
        }
    }
}

