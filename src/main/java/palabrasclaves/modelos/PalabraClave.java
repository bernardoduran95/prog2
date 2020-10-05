/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasclaves.modelos;

/**
 *
 * @author Bernardo
 */
public class PalabraClave {
    private String nombre;
    
    public PalabraClave(String n){
    nombre=n;
    }

    public void mostrarPalabra() {
        System.out.println("PalabraClave:"+ nombre);
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
