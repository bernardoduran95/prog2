/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.modelos;

/**
 *
 * @author Bernardo
 */
public class Tipo {
    private String nombre; 

       public Tipo(String n){
       nombre=n;
       }
    
     public void mostrarTipo() {
     System.out.println("Tipo:" + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
