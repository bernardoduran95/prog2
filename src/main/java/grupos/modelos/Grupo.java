/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

/**
 *
 * @author Bernardo
 */
public class Grupo {   
    private String nombre; 
    private String descripcion; 

    public Grupo(String n, String d){
    nombre=n;
    descripcion=d;
    }
    public void mostrarGrupo(){
        System.out.println("nombre=" + nombre + ", descripcion=" + descripcion);
    }
    
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
