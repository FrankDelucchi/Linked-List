package Punto3;

import java.util.Comparator;

public class ComparatorElemAcadem implements Comparator<ElementoAcademico> {

    @Override
    public int compare(ElementoAcademico e1, ElementoAcademico e2) {
        return e1.getCantAlumnos() - e2.getCantAlumnos();
    }
    
}
