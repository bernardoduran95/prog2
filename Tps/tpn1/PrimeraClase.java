/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progii;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class PrimeraClase {
        //atributos de la clase PrimeraClase
    
        String unaCadena="Holis";
        int unEntero = 24;
        
        //main 
        
    public static void main(String[] args) {
        
        ArrayList<PrimeraClase> Objetos = new ArrayList<>(); //creo un array con obejtos de la clase Primera Clase llamado "Objetos" 
        PrimeraClase [] Objetitos = new PrimeraClase[5]; // un vector de cinco elementos de la calse PrimeraClase
        //creo cinco objetos 
        
        PrimeraClase objeto1=new PrimeraClase();
        PrimeraClase objeto2=new PrimeraClase();
        PrimeraClase objeto3=new PrimeraClase();
        PrimeraClase objeto4=new PrimeraClase();
        PrimeraClase objeto5=new PrimeraClase();
        
        // doy valor a los atributos 
        
        objeto1.unaCadena= "Mesa";
        objeto2.unaCadena= "Silla";
        objeto3.unaCadena= "Felpon";
        objeto4.unaCadena= "Antena";
        objeto5.unaCadena= "Foco";
        
        objeto1.unEntero= 20;
        objeto2.unEntero= 21;
        objeto3.unEntero= 22;
        objeto4.unEntero= 23;
        objeto5.unEntero= 25;
        
        //muestro los valores
        
        objeto1.mostrar();
        objeto2.mostrar();
        objeto3.mostrar();
        objeto4.mostrar();
        objeto5.mostrar();
               
        // le asigno los valores al vector Objetitos 
        
       Objetitos[0]=objeto1;
       Objetitos[1]=objeto2;
       Objetitos[2]=objeto3;
       Objetitos[3]=objeto4;
       Objetitos[4]=objeto5;
       
       // modifico el nombre del objeto numero 4 
       
       objeto4.unaCadena="perro"; 
       
       // borro el elemento [4] del vector
       
       //borro el elemento 3
        int j;
        for(j = 3; j < 4; j++) {
        Objetitos[j] = Objetitos[j + 1]; // el lugar [3] copia el valor del lugar [4] para poder ser borrado
        }
       //  Objetitos[3] = 0 ;  revisar como elimino el objeto[3]
               
       // muestro los objetitos
       for (PrimeraClase r: Objetitos  ){ //la clase y los objetos
           r.mostrar(); 
       }
       
       // hago lo mismo con el array llamado Objetos
       
       //primero debo agregar a la lista
       
       Objetos.add(objeto1); 
       Objetos.add(objeto2);
       Objetos.add(objeto3);
       Objetos.add(objeto4);
       Objetos.add(objeto5); 
       
       //presento los elementos
//        for(int i=0; i<Objetos.size(); i++)
//            Objetos.get(i).mostrar();
        
       // muestro los objetos que tengo en el array 
       
       
       for(PrimeraClase f: Objetos){
           f.mostrar(); 
       }
                
    }
    
    public void mostrar(){
         
        System.out.println("\n El objeto numero "+ unEntero +
                                        " Es unx " + unaCadena);
        
    }
    
}
