package Punto2.ComparatorAlumno;

import java.util.Comparator;

import Punto2.Alumno;

public class ComparatorApellido implements Comparator<Alumno>{
    
    @Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getApellido().compareTo(a2.getApellido());
	}
}
