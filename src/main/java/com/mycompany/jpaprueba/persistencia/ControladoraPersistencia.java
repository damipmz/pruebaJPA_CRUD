package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Materia;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    //Cuando llame a este new para crear una nueva instancia
    //Llamo a la instancia del controlle que hice 
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController mateJpa = new MateriaJpaController();

    
    //----------------ALUMNO---------------------
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

    
    //----------------CARRERA-----------------------
    
    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void crearCarrera(Carrera Carre) {
        carreJpa.create(Carre);
    }

    public void editarCarrera(Carrera Carre) {
        try {
            carreJpa.edit(Carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        
        List <Carrera> listaCarr = carreJpa.findCarreraEntities(); //Creo lista de tipo CARRERA
        ArrayList <Carrera> listaCarreras = new ArrayList <> (listaCarr); 
        
        return listaCarreras;
    }
    
    //--------------MATERIA-------------

    public Materia traerMateria(int id) {
        return mateJpa.findMateria(id);
    }

    public LinkedList<Materia> traerListaMaterias(int id) {
        List<Materia> lista = mateJpa.findMateriaEntities();
        LinkedList<Materia> listaMaterias = new LinkedList(lista);
        return listaMaterias;
    }

    public void editarMateria(Materia mate) {
    }

    public void eliminarMateria(int id) {
        try {
            mateJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearMateria(Materia mate) {
        mateJpa.create(mate);
    }
    
    
    
}
