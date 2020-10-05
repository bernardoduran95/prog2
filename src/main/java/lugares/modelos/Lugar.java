/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lugares.modelos;

/**
 *
 * @author Bernardo
 */
public class Lugar {
    private String nombre;
    
    public Lugar(String lugar){
    nombre=lugar;
    }

   
    public void mostrarLugar() {
        System.out.println("Lugar:" + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
