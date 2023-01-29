package Punto3;

import java.util.ArrayList;

public class AgrupacionEstudiantil extends ElementoAcademico {
    
    private String pertenencia;
    private ArrayList <ElementoAcademico> grupoAlumnos;

    public AgrupacionEstudiantil (String pertenencia){
        this.pertenencia = pertenencia;
        this.grupoAlumnos = new ArrayList<>();
    }

    public void addAlumnos(ElementoAcademico e){
        if(!grupoAlumnos.contains(e)){
            grupoAlumnos.add(e);
        }
    }

    @Override
    public ArrayList<ElementoAcademico> getElementoAcademico(){
        ArrayList<ElementoAcademico> res = new ArrayList<>();
        for(int i=0; i<this.grupoAlumnos.size(); i++){
            ElementoAcademico hijo = grupoAlumnos.get(i);
            res.addAll(hijo.getElementoAcademico());
        }
        return res;
    }

    public String getPertenencia(){
        return this.pertenencia;
    }

    @Override
    public int getCantAlumnos() {
        int cant = 0;
        for(int i=0; i<this.grupoAlumnos.size(); i++){
            cant += grupoAlumnos.get(i).getCantAlumnos();
        }
        return cant;
    }

    public String toString(){
        
        return this.pertenencia;
        
    }
}
