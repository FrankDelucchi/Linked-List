package Punto2.ComparatorAlumno;

import java.util.Comparator;

import Punto2.Alumno;

public class ComparatorNombre implements Comparator<Alumno> {

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getNombre().compareTo(a2.getNombre());
	}


}