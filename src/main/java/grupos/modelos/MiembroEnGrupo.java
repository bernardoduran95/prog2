/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Profesor;

/**
 *
 * @author Usuario
 */
public class MiembroEnGrupo {
    
    private Profesor profesor1;
    private Grupo grupo1;
    private Rol rol; 

    public MiembroEnGrupo(Profesor profesor1, Grupo grupo1, Rol rol) {
        this.profesor1 = profesor1;
        this.grupo1 = grupo1;
        this.rol = rol;
    }

    public Profesor getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public Grupo getGrupo1() {
        return grupo1;
    }

    public void setGrupo1(Grupo grupo1) {
        this.grupo1 = grupo1;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
    
    
    
}
