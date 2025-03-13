package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.LinkedList;


public class Controladora {
    
   
    //Instancia EN CONTROLADORA DE PERSISTENCIA TENGO LOS METODOS
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //CREATE
    //Creo los metodos para poder crear alumnos(registros)
    public void crearAlumno(Alumno alu){ //Asi lo hago si recibo de la IGU un alumno
        
        controlPersis.crearAlumno (alu);
    }
    
    //DELETE
    public void eliminarAlumno(int id){
        
        controlPersis.eliminarAlumno(id);
        
    }
    
    //EDITAR
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    //FUNCION PARA TRAER ALUMNO EN PARTICULAR
    public Alumno traerAlumno(int id){  
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList <Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
    
    
    //------------------------CARRERA-------------------------
    
       //CREATE
    //Creo los metodos para poder crear carreras
    public void crearCarrera(Carrera Carre){ //Asi lo hago si recibo de la IGU un alumno
        
        controlPersis.crearCarrera (Carre);
    }
    
    //DELETE
    public void eliminarCarrera(int id){
        
        controlPersis.eliminarCarrera(id);
        
    }
    
    //EDITAR
    public void editarCarrera(Carrera Carre){
        controlPersis.editarCarrera(Carre);
    }
    
    //FUNCION PARA TRAER ALUMNO EN PARTICULAR
    public Carrera traerCarrera(int id){  
        return controlPersis.traerCarrera(id);
    }
    
    public ArrayList <Carrera> traerListaCarreras(){
        return controlPersis.traerListaCarreras();
    }
    
    //-------------------MATERIA-------------------
      //CREATE
    //Creo los metodos para poder crear Materia
    public void crearMateria(Materia mate){ //Asi lo hago si recibo de la IGU un alumno
        
        controlPersis.crearMateria(mate);
    }
    
    //DELETE
    public void eliminarMateria(int id){
        
        controlPersis.eliminarMateria(id);
        
    }
    
    //EDITAR
    public void editarMateria(Materia mate){
        controlPersis.editarMateria(mate);
    }
    
    //FUNCION PARA TRAER ALUMNO EN PARTICULAR
    public Materia traerMateria(int id){  
        return controlPersis.traerMateria(id);
    }
    
    public LinkedList<Materia> traerListaMaterias(){
        return controlPersis.traerListaMaterias();
    }
    
    
  
}
