/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class Alumno {
    private String Apellido;
    private String Nombre;
    private int dni;
    private String clave;
    private String cx; 
     ArrayList<Alumno> ListaAlumnos = new ArrayList<>();

    public  Alumno(String a,String n,int dni,String c,String cx){
        this.Apellido=a;
        this.Nombre=n;
        this.dni=dni;
        clave=c;
        this.cx=cx; 
    }
    
    
    
    
    //Metodos ver y asignar 

    
    public void mostrarAlumno() {
        System.out.println("Apellido:" + Apellido + ", Nombre="+ Nombre + ", dni=" + dni + ", clave=" + clave + ", cx=" + cx );
    }

   
    
    
   public String verApellido() {
        return Apellido;
    }

    public void asignarApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String verNombre() {
        return Nombre;
    }

    public void asignarNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }
    

    
}
