package Punto1;

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
	
	public void deleteNodoPosicion(int valor) {
		
		Nodo<T> actual = this.raiz;
		Nodo<T> ant = null;		
		int pos = 0;

		try{
			while ((pos<valor)&&(actual.getNext()!=null)){

				ant = actual;
				actual = actual.getNext();
				pos++;
			
			}
			if(actual.getNext()!=null){
				ant.setNext(actual.getNext());
			}
			else{
				ant.setNext(null);
			}
		}
		catch(Exception exc){
			System.out.print(exc);
		}
	
	}

	public void deleteAllCases(Nodo<T> otro){
		
		Nodo<T> actual = this.raiz;
		Nodo<T> aux = null;
		try{
			while (actual!=null){
				if((actual.equals(otro))&&(aux==null)){
					actual = actual.getNext();
					raiz = actual;
				}
				else if(actual.equals(otro)){
					aux.setNext(actual.getNext());
					actual = actual.getNext();
				}
				else{
					aux = actual;
					actual = actual.getNext();
				}	
			}
		}
		catch(Exception exc){
			System.out.print(exc);
		}
	}

	public int getPosition(Nodo<T> otro){

		Nodo<T> actual = this.raiz;
		int pos = 0;

		while(actual.getNext()!=null){
			if (actual.equals(otro)){
				return pos;
			}
			else{
				actual = actual.getNext();
				pos++;
			}
		}
		if(actual.getNext()==null&&(actual.equals(otro))){
			return pos;
		}
		else{
			return -1;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new IteradorLista<T>(this.raiz);
	}
}

