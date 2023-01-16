package tp1;

import java.util.Iterator;

public class IteradorLista<T> implements Iterator<T> {

	private Nodo<T> puntero;
	
	public IteradorLista(Nodo<T> N) {
		this.puntero = N;
	}
	
	@Override
	public boolean hasNext() {
		return this.puntero!=null;
	}

	@Override
	public T next() {
		T value = this.puntero.getValue();
		puntero = this.puntero.getNext();
		return value;
	}

}
