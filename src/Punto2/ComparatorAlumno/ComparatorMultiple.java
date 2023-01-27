package Punto2.ComparatorAlumno;

import java.util.Comparator;

import Punto2.Alumno;

public class ComparatorMultiple implements Comparator<Alumno>{

    private Comparator<Alumno> c1;
    private Comparator<Alumno> c2;

    public ComparatorMultiple(Comparator<Alumno> c1, Comparator<Alumno> c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Alumno a1, Alumno a2) {
        int res = c1.compare(a1,a2);
        if (res == 0)
            return c2.compare(a1,a2);
        return res;
    }
    
}
