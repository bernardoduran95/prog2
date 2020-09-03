/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Grupo {
    
    String nombre;  
    String descripcion; 
    
    public void mostrar(){
        System.out.println("\n Nombre del grupo: " + nombre);
        System.out.println("Descripcion del grupo: " + descripcion);
    }
    
    public static void main(String[] args) {
        
        // creo el vector Grupo y creo cinco objetos nuevos de la clase grupo
        
        Grupo [] grupos = new Grupo[5]; 
        Grupo grupo1=new Grupo();
        Grupo grupo2=new Grupo();
        Grupo grupo3=new Grupo();
        Grupo grupo4=new Grupo();
        Grupo grupo5=new Grupo();
                
        
        // le doy valores a los atributos
        
        grupo1.nombre="verde";
        grupo2.nombre="amarillo";
        grupo3.nombre="rojo";
        grupo4.nombre="naranja";
        grupo5.nombre="azul";
        
        grupo1.descripcion="verde como las hojas";
        grupo2.descripcion="amarillo como el sol";
        grupo3.descripcion="rojo como el tomate";
        grupo4.descripcion="naranja como la naranja";
        grupo5.descripcion="azul como el cielo";
        
        // asigno los elementos al vector        
        
        grupos[0]=grupo1; 
        grupos[1]=grupo2;
        grupos[2]=grupo3;
        grupos[3]=grupo4;
        grupos[4]=grupo5;
        
        System.out.println("Los elementos del vector son: \n");        
        // muestro los elementos del vector
        
        for(Grupo r: grupos){
            r.mostrar();
        }
        
        //b con array 
        
        // creo un array Grupis de cinco elementos
        
         ArrayList<Grupo> Grupis = new ArrayList<>();
         Grupis.add(grupo1);
         Grupis.add(grupo2);
         Grupis.add(grupo3);
         Grupis.add(grupo4);
         Grupis.add(grupo5);
         
         System.out.println("\n Los elementos del Array son: \n");
        // muestro los elementos del array
        
        for (Grupo f: Grupis){
            f.mostrar(); 
        }
        
    }
    
    
}
