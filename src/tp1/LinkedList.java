package tp1;

import java.util.Comparator;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
	
	private Nodo<T> raiz;
	private Comparator<T> orden;
	
	public LinkedList(Comparator<T> C) {
		this.raiz = null;//The list its void at the beginning
		this.orden = C;
	}
	
	public void setOrden(Comparator<T> C) {
		this.orden=C;
	}
	
	public void addNodo(T valor) {
		
		Nodo<T> nuevo = new Nodo<T>(valor); 
		if(raiz==null) {
			raiz = nuevo;
		}
		else if(orden.compare(raiz.getValue(), nuevo.getValue())>0) {
			nuevo.insertNext(raiz, orden);
			raiz = nuevo;
		}
		else {
			raiz.insertNext(nuevo, orden);
		}
	}
	
	public void deleteNodo(T valor) {
		
		//Nodo<T> buscado = new Nodo<T>(valor);
	}
	@Override
	public Iterator<T> iterator() {
		return new IteradorLista<T>(this.raiz);
	}
}

