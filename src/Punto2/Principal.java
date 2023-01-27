package Punto2;

import Punto1.LinkedList;
import Punto2.ComparatorAlumno.ComparatorApellido;
import Punto2.ComparatorAlumno.ComparatorDNI;
import Punto2.ComparatorAlumno.ComparatorEdad;
import Punto2.ComparatorAlumno.ComparatorMultiple;
import Punto2.ComparatorAlumno.ComparatorNombre;

public class Principal {
    
    public static void main (String [] args){

        ComparatorNombre sortByName = new ComparatorNombre();
        ComparatorApellido sortByLastName = new ComparatorApellido();
        ComparatorEdad sortByAge = new ComparatorEdad();
        ComparatorDNI sortByDni = new ComparatorDNI();
        ComparatorMultiple multipleSort = new ComparatorMultiple(sortByLastName, sortByName);
        ComparatorMultiple multipleSort1 = new ComparatorMultiple(multipleSort, sortByAge);
        ComparatorMultiple multipleSort2 = new ComparatorMultiple(multipleSort1, sortByDni);

        LinkedList<Alumno> l1 = new LinkedList<Alumno>(multipleSort2);

        Alumno a1 = new Alumno("Franco", "Delucchi", 33, 34609763);
        Alumno a2 = new Alumno("Mauro", "Delucchi", 29, 37857551);
        Alumno a3 = new Alumno("Guido", "Delucchi", 30, 36598125);
        Alumno a4 = new Alumno("Juan", "Rodriguez", 36, 32857968);
        Alumno a5 = new Alumno("Ignacio", "Ilero", 33, 34785986);
        Alumno a6 = new Alumno("Juan", "Rodriguez", 25, 46854123);

        l1.addNodo(a1);
        l1.addNodo(a2);
        l1.addNodo(a6);
        l1.addNodo(a5);
        l1.addNodo(a3);
        l1.addNodo(a4);

        for (Alumno l: l1) {
			System.out.println(l);
		}

        a1.addInterest("basquet");
        a1.addInterest("musica");
        a1.addInterest("ciencia ficcion");

        System.out.println(a1.getIntereses());
    }
}
