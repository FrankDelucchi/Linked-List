package tp1;

import java.util.Comparator;

public class Nodo<T> {
	
	private T value;
	private Nodo<T> referencia;
	
	public Nodo(T value) {
		this.value = value;
		this.referencia = null;	
	}
	
	public T getValue() {
		return this.value;
	}
	
	public Nodo<T> getNext(){
		return this.referencia;
	}
	
	public void setNext(Nodo<T> sig) {
		this.referencia = sig;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public void insertNext(Nodo<T> n, Comparator<T> orden) {
		if(referencia==null) {
			referencia = n;
		}
		else if(orden.compare(referencia.getValue(), n.getValue())>0) {
			n.insertNext(referencia, orden);
			referencia = n;
		}
		else {
			referencia.insertNext(n, orden);
		}
	}
}
