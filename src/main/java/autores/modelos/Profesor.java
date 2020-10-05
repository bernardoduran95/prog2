    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import autores.modelos.Cargo;

public class Profesor {
    private String Apellido;
    private String Nombre;
    private int dni;
    private String clave;
   // private String cargo;    
    private Cargo cargo;
    
    public void mostrarProfesor() {
        System.out.println("Apellido:" + Apellido + "\n Nombre="+ Nombre + "\n dni=" + dni + "\n clave=" + clave + "\n cargo=" + cargo );
    }
    
    public Profesor(String a,String n,int dni,String c,Cargo cargo){
        Apellido=a;
        Nombre=n;
        this.dni=dni;
        clave=c;
        this.cargo=cargo; 
    }
     
 
  
}
