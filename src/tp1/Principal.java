package tp1;

public class Principal {

	public static void main (String [] args) {
		
		ComparatorInt orden = new ComparatorInt();
		
		LinkedList<Integer> l1 = new LinkedList<Integer>(orden);
		
		l1.addNodo(3);
		l1.addNodo(1);
		l1.addNodo(5);
		l1.addNodo(7);
		l1.addNodo(5);
		
		
		for (Integer l: l1) {
			System.out.println(l);
		}
		
	}

}
