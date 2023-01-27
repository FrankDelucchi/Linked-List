package Punto2.ComparatorAlumno;

import java.util.Comparator;

import Punto2.Alumno;

public class ComparatorDNI implements Comparator<Alumno>{

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return (int) (a1.getDni() - a2.getDni());
	} 
    
}
