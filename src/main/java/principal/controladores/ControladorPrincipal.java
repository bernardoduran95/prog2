/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMAlumnoo;
import autores.vistas.VentanaAMProfesorr;
import grupos.modelos.Grupo;
import grupos.vistas.VentanaAMGrupoo;
import idiomas.modelos.Idioma;
import idiomas.vistas.VentanaAIdiomaa;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import lugares.vistas.VentanaALugarr;
import palabrasclaves.modelos.PalabraClave;
import palabrasclaves.vistas.VentanaAPalabraClavee;
import tipos.modelos.Tipo;
import tipos.vistas.VentanaATipoo;
import autores.modelos.Cargo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import java.time.LocalDateTime;
import publicaciones.modelos.Publicacion;

/**
 *
 * @author Bernardo
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        
       //Inicio las ventanas 
       
        VentanaAMAlumnoo ventanaAlumno = new VentanaAMAlumnoo(null,true);
        VentanaAMProfesorr ventanaProfesor = new VentanaAMProfesorr (null,true);
        VentanaAMGrupoo ventanagrupo = new VentanaAMGrupoo(null,true);        
        VentanaAIdiomaa ventanaIdioma = new VentanaAIdiomaa (null,true);
        VentanaALugarr ventanaLugar = new VentanaALugarr (null,true);
        VentanaAPalabraClavee ventanaPalabraClave = new VentanaAPalabraClavee (null,true);
        VentanaATipoo ventanaTipo = new VentanaATipoo (null,true);
            
     // Creo los arraylist 
     
        ArrayList<Alumno> ListaAlumnos=new ArrayList();
        ArrayList<Profesor> ListaProfesores=new ArrayList();
        ArrayList<Idioma> ListaIdiomas=new ArrayList();
        ArrayList<Lugar> ListaLugares=new ArrayList();
        ArrayList<Tipo> ListaTipos=new ArrayList();
        ArrayList<Grupo> ListaGrupos=new ArrayList();
        ArrayList<PalabraClave> ListaPalabras=new ArrayList(); 
        ArrayList<Publicacion> ListaPublicaciones= new ArrayList();
        
       //Creo 5 alumnos
       Alumno Alumno1 = new Alumno("Y","J I",9,"ju","23");
       Alumno Alumno2 = new Alumno("G","Q I",3,"Lu","33");
       Alumno Alumno3 = new Alumno("F","S I",59,"ku","53");
       Alumno Alumno4 = new Alumno("D","D I",79,"qu","63");
       Alumno Alumno5 = new Alumno("W","F I",89,"wu","73");
       ListaAlumnos.add(Alumno1);
       ListaAlumnos.add(Alumno2);
       ListaAlumnos.add(Alumno3);
       ListaAlumnos.add(Alumno4);
       ListaAlumnos.add(Alumno5);       
       
       
       //Muestro lo cinco alumnos
       System.out.println("Lista de Alumnos\n");
       for(Alumno r: ListaAlumnos)
           r.mostrarAlumno();
       
       //       //Creo 5 profes 
       Profesor Profe1 = new Profesor("y","ASDFASDF",3,"ju",Cargo.TITULAR);
       Profesor Profe2 = new Profesor("swd","GF",3,"Lu",Cargo.ADG);
       Profesor Profe3 = new Profesor("asd","ASD",59,"ku",Cargo.ASOCIADO);
       Profesor Profe4 = new Profesor("asd","ASDA",79,"qu",Cargo.JTP);
       Profesor Profe5 = new Profesor("asd","DAFAS",89,"wu",Cargo.ADJUNTO);
       ListaProfesores.add(Profe1);
       ListaProfesores.add(Profe2);
       ListaProfesores.add(Profe3);
       ListaProfesores.add(Profe4);
       ListaProfesores.add(Profe5);
       
        //Muestro lo cinco prof
       System.out.println("\nLista de profesores\n");
       for(Profesor r: ListaProfesores){
           r.mostrarProfesor();
      }      
       
       //Creo 5 idiomas
       Idioma Idioma1 = new Idioma("Ingles");
       Idioma Idioma2 = new Idioma("Frances");
       Idioma Idioma3 = new Idioma("Aleman");
       Idioma Idioma4 = new Idioma("Portugues");
       Idioma Idioma5 = new Idioma("Español");
       ListaIdiomas.add(Idioma1);
       ListaIdiomas.add(Idioma2);
       ListaIdiomas.add(Idioma3);
       ListaIdiomas.add(Idioma4);
       ListaIdiomas.add(Idioma5);
       
        //Muestro lo cinco Idiomas
       System.out.println("\nLista de Idiomas");
       for(Idioma r: ListaIdiomas){
           r.mostrarIdioma();
       }
       System.out.println("\n");
       
       //Creo 5 Lugares
       Lugar Lugar1 = new Lugar("A1");
       Lugar Lugar2 = new Lugar("A2");
       Lugar Lugar3 = new Lugar("A3");
       Lugar Lugar4 = new Lugar("A4");
       Lugar Lugar5 = new Lugar("A5");
       ListaLugares.add(Lugar1);
       ListaLugares.add(Lugar1);
       ListaLugares.add(Lugar3);
       ListaLugares.add(Lugar4);
       ListaLugares.add(Lugar5);
       
         //Muestro lo cinco lugares
       System.out.println("\nLista de lugares");
       for(Lugar r: ListaLugares){
           r.mostrarLugar();
       }
       
       //Creo 5 tipos
//       
       Tipo Tipo1 = new Tipo("doc1");
       Tipo Tipo2 = new Tipo("doc2");
       Tipo Tipo3 = new Tipo("doc3");
       Tipo Tipo4 = new Tipo("doc4");
       Tipo Tipo5 = new Tipo("doc5");
       ListaTipos.add(Tipo1);
       ListaTipos.add(Tipo2);
       ListaTipos.add(Tipo3);
       ListaTipos.add(Tipo4);
       ListaTipos.add(Tipo5);
       
         //Muestro lo cinco tipos
       System.out.println("\nLista de tipos");
       for(Tipo r: ListaTipos){
           r.mostrarTipo();
       }
       
         //Creo 5 grupos
       
       Grupo Grupo1 = new Grupo("G1","h1");
       Grupo Grupo2 = new Grupo("G2","h2");
       Grupo Grupo3 = new Grupo("G3","h3");
       Grupo Grupo4 = new Grupo("G4","h4");
       Grupo Grupo5 = new Grupo("G5","h5");
       ListaGrupos.add(Grupo1);
       ListaGrupos.add(Grupo2);
       ListaGrupos.add(Grupo3);
       ListaGrupos.add(Grupo4);
       ListaGrupos.add(Grupo5);
       
        //Muestro los cinco grupos
       System.out.println("\nLista de grupos");
       for(Grupo r: ListaGrupos){
           r.mostrarGrupo();
       }
       
       //Creo 5 palabras claves
       
       PalabraClave Palabra1 = new PalabraClave("asf");
       PalabraClave Palabra2 = new PalabraClave("asda");
       PalabraClave Palabra3 = new PalabraClave("dfgh");
       PalabraClave Palabra4 = new PalabraClave("hj");
       PalabraClave Palabra5 = new PalabraClave("tyu");
       ListaPalabras.add(Palabra1);
       ListaPalabras.add(Palabra2);
       ListaPalabras.add(Palabra3);
       ListaPalabras.add(Palabra4);
       ListaPalabras.add(Palabra5);
       
         //Muestro las palabras
       System.out.println("\nLista de palabras claves");
       for(PalabraClave r: ListaPalabras){
           r.mostrarPalabra();
       }
       
       //Creo Miembro En Grupo
       MiembroEnGrupo miembroEnGrupo = new MiembroEnGrupo (Profe1, Grupo1, Rol.ADMINISTRADOR);
       
       
       //Creo 5 Publicaciones
       System.out.println("\nLista de publicaciones");
       //( titulo,enlace,resumen,fechaPublicacion,lugar,idioma,tipo,miembro,Array PalabrasClave)
       Publicacion Publi1 = new Publicacion("Titulo1","Enlace1","Resumen1",LocalDateTime.now(),Lugar1,Idioma1,Tipo1,miembroEnGrupo,ListaPalabras);
       ListaPublicaciones.add(Publi1);
       for(Publicacion p: ListaPublicaciones)
           p.mostrar();
       
       
      
       
       
      
    
    }

}
