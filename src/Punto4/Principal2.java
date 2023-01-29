package Punto4;

import Punto1.LinkedList;
import Punto2.Alumno;
import Punto3.AgrupacionEstudiantil;
import Punto3.ComparatorElemAcadem;
import Punto3.ElementoAcademico;

public class Principal2 {
    
    public static void main (String [] args){

        Alumno a1 = new Alumno("Federico", "Lopez", 35999888);
        Alumno a2 = new Alumno("Juana", "Garcia", 27123455);
        Alumno a3 = new Alumno("Flora", "Rivas", 34555111);
        Alumno a4 = new Alumno("Martin", "Gomez", 34111222);
        Alumno a5 = new Alumno("Roman", "Bazan", 32555111);
        Alumno a6 = new Alumno("Mora", "Diaz", 37124425);
        Alumno a7 = new Alumno("Jhon", "Doe", 1200000);

        a1.addInterest("redes");
        a1.addInterest("php");
        a1.addInterest("java");
        a1.addInterest("phyton");

        a2.addInterest("programacion");
        a2.addInterest("php");
        a2.addInterest("java");

        a3.addInterest("historia");
        a3.addInterest("antigua");

        a4.addInterest("romanos");
        a4.addInterest("egipcios");
        a4.addInterest("griegos");

        a5.addInterest("argentina");

        a6.addInterest("psicologia");
        a6.addInterest("freud");

        a7.addInterest("intercambio");

        AgrupacionEstudiantil elem1 = new AgrupacionEstudiantil("Historia");
        elem1.addAlumnos(a3);
        elem1.addAlumnos(a4);
        elem1.addAlumnos(a5);

        AgrupacionEstudiantil elem2 = new AgrupacionEstudiantil("Exactas");
        elem2.addAlumnos(a1);
        elem2.addAlumnos(a2);

        AgrupacionEstudiantil elem3 = new AgrupacionEstudiantil("Humanas");
        elem3.addAlumnos(elem1);
        elem3.addAlumnos(a5);

        AgrupacionEstudiantil elem4 = new AgrupacionEstudiantil("Unicen");
        elem4.addAlumnos(elem2);
        elem4.addAlumnos(elem3);
        elem4.addAlumnos(a7);

        ComparatorElemAcadem orden = new ComparatorElemAcadem();

        LinkedList<ElementoAcademico> l1 = new LinkedList<ElementoAcademico>(orden);

        l1.addNodo(elem1);
        l1.addNodo(elem2);
        l1.addNodo(elem3);
        l1.addNodo(elem4);

        for (ElementoAcademico l: l1) {
			System.out.println(l);
		}
    }
}
