/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author Usuario
 */
public class Publicacion {
    
   private String titulo;
   private String enlace;
   private String resumen; 
   private LocalDateTime fechaPublicacion;    
   private Lugar lugar;
   private Idioma idioma;
   private Tipo tipo;
   private MiembroEnGrupo miembro;
   private ArrayList<PalabraClave> PalabrasClave;
   
   DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd // MM //  YYYY");// formato de fechas
    //    System.out.println("\nFecha= "+ formato.format(fecha));


    public Publicacion(String titulo, String enlace, String resumen, LocalDateTime fechaPublicacion, Lugar lugar, Idioma idioma, Tipo tipo, MiembroEnGrupo miembro, ArrayList<PalabraClave> PalabrasClave) {
        this.titulo = titulo;
        this.enlace = enlace;
        this.resumen = resumen;
        this.fechaPublicacion = fechaPublicacion;
        this.lugar = lugar;
        this.idioma = idioma;
        this.tipo = tipo;
        this.miembro = miembro;
        this.PalabrasClave = PalabrasClave;
    }
    
    public void mostrar(){
    
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: ");
        System.out.println("Grupo: "+ miembro.getGrupo1().verNombre());
        System.out.println("Rol: " + miembro.getRol().name());
        System.out.println("Fecha de publicacion: " + formato.format(fechaPublicacion) );
        System.out.println("Tipo: " + tipo.getNombre());
        System.out.println("Idioma: " + idioma.getNombre());
        System.out.println("Lugar: " + lugar.getNombre());
        System.out.println("Palabras Claves: \n---------------");
        for(PalabraClave palabra: PalabrasClave){
            palabra.mostrarPalabra();
            System.out.println("\t" );}//+ palabr
        System.out.println("Enlace: " + enlace);
        System.out.println("Resumen: "+ resumen);
        
    
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public MiembroEnGrupo getMiembro() {
        return miembro;
    }

    public void setMiembro(MiembroEnGrupo miembro) {
        this.miembro = miembro;
    }

    public ArrayList<PalabraClave> getPalabrasClave() {
        return PalabrasClave;
    }

    public void setPalabrasClave(ArrayList<PalabraClave> PalabrasClave) {
        this.PalabrasClave = PalabrasClave;
    }
  
   
    

    
   
    
}
