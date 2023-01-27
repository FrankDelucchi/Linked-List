package Punto1;

public class Principal {

	public static void main (String [] args) {
		
		ComparatorInt orden = new ComparatorInt();
		
		LinkedList<Integer> l1 = new LinkedList<Integer>(orden);
		Nodo<Integer> n1 = new Nodo<Integer>(8);

		//n1.setNext(null);
		
		l1.addNodo(3);
		l1.addNodo(1);
		l1.addNodo(5);
		l1.addNodo(7);
		l1.addNodo(5);

		for (Integer l: l1) {
			System.out.println(l);
		}

		System.out.println(l1.getPosition(n1));

		l1.deleteAllCases(n1);

		for (Integer l: l1) {
			System.out.println(l);
		}
		
	}

}
