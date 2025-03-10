package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    //Cuando llame a este new para crear una nueva instancia
    //Llamo a la instancia del controlle que hice 
    AlumnoJpaController aluJpa = new AlumnoJpaController();

    //CREAR
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    //ELIMINAR
    //Si no existe la id, tira la excepcion
    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        
        List <Alumno> listita = aluJpa.findAlumnoEntities(); //Creo lista de tipo ALUMNO
        ArrayList <Alumno> listaAlumnos = new ArrayList <Alumno> (listita); 
        
        return listaAlumnos;
    }
    
    
    
}
