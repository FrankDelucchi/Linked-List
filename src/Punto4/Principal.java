package Punto4;
import Punto1.ComparatorInt;
import Punto1.ComparatorInverso;
import Punto1.ComparatorString;
import Punto1.LinkedList;
import Punto1.Nodo;

public class Principal {
    
    public static void main (String [] args){

        ComparatorInt orden = new ComparatorInt();
		
		LinkedList<Integer> l1 = new LinkedList<Integer>(orden);
        
		Nodo<Integer> n1 = new Nodo<Integer>(5);
        Nodo<Integer> n2 = new Nodo<Integer>(11);

        l1.addNodo(10);
        l1.addNodo(21);
        l1.addNodo(1);
        l1.addNodo(5);
        l1.addNodo(11);

        for (Integer l: l1) {
			System.out.println(l);
		}

        l1.deleteNodoPosicion(0);
        l1.deleteAllCases(n1);
        l1.deleteAllCases(n2);

        for (Integer l: l1) {
			System.out.println(l);
		}

        ComparatorString orden2 = new ComparatorString();
        LinkedList<String> l2 = new LinkedList<>(orden2);
        Nodo<String> n3 = new Nodo<String>("parcial");
        Nodo<String> n4 = new Nodo<String>("recuperatorio");

        l2.addNodo("facil");
        l2.addNodo("es");
        l2.addNodo("parcial");
        l2.addNodo("prog2");

        for (String l: l2) {
			System.out.println(l);
		}

        System.out.println(l2.getPosition(n3));
        System.out.println(l2.getPosition(n4));

        ComparatorInverso<String> orden3 = new ComparatorInverso<String>(orden2);
        l2.setOrden(orden3);

        for (String l: l2) {
			System.out.println(l);
		}
    }
}
