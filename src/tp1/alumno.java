package tp1;

import java.util.ArrayList;

public class alumno {
    
    private String nombre;
    private String apellido;
    private int edad;
    private long dni;
    private ArrayList<String> intereses;

    public alumno(String nombre, String apellido, int edad, long dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.intereses = new ArrayList<>();
    }

    public void addInterest(String n){
        for(int i = 0; i<this.intereses.size(); i++){
            if(!this.intereses.contains(n)){
                this.intereses.add(n);
            }
        }
    }
}
