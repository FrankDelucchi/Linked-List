package Punto2.ComparatorAlumno;

import java.util.Comparator;

import Punto2.Alumno;

public class ComparatorEdad implements Comparator<Alumno>{

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getEdad() - a2.getEdad();
	}
    
}
