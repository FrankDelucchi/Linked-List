package Punto2;

import java.util.ArrayList;

import Punto3.ElementoAcademico;

public class Alumno extends ElementoAcademico{

    private String nombre;
    private String apellido;
    private int edad;
    private long dni;
    private ArrayList<String> intereses;

    public Alumno(String nombre, String apellido, int edad, long dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.intereses = new ArrayList<>();
    }

    public Alumno(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.intereses = new ArrayList<>();
    }

    public void addInterest(String n){
        if(!this.intereses.contains(n)){
            this.intereses.add(n);
        }
        
    }

    public String toString(){
        return "Alumno: " + this.apellido + " " + this.nombre + " " + this.edad + " " + this.dni;
    }

    public ArrayList<String> getIntereses(){
        return new ArrayList<String>(this.intereses);
    }

    public String getApellido() {
        return this.apellido;
    }

    public Long getDni() {
        return this.dni;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public ArrayList<ElementoAcademico> getElementoAcademico(){
        ArrayList<ElementoAcademico> res = new ArrayList<ElementoAcademico>();
        res.add(this);
        return res;
    }

    @Override
    public int getCantAlumnos() {
        return 1;
    }
}
