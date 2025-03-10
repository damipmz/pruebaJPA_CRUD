package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
//import java.util.ArrayList;
import java.util.Date;


public class JpaPrueba {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();            
        
        //Creacion Carrera
        Carrera carre = new Carrera(25, "Ingeniería en Informática");
        
        //Guardado carrera en BD
        control.crearCarrera(carre);
        
        Alumno alum2 = new Alumno(21, "Juan", "Pepe", new Date(), carre);
        
        //Guardamos el alumno en la BD
        control.crearAlumno(alum2);
        
        //Resultados
        System.out.println("-------------");
        System.out.println("-----DATOS ALUMNO-----");
        Alumno alu = control.traerAlumno(21);
        System.out.println("Alumno: " + alu.getNombre() + "" + alu.getApellido() );
        System.out.println("Cursa la carrera de:" + alu.getCarre().getNombre());
        
        
        /*
        Alumno alum = new Alumno(55, "Pedro", "Cucito", new Date());       
        control.crearAlumno(alum);
        
        /*
        //control.eliminarAlumno(30);
        
        //Edito apellido
        alu.setApellido("Panflin");
        control.editarAlumno(alu);
        
        
        //FIND
        Alumno alu = control.traerAlumno(15);
        System.out.println("---------BUSQUEDA INDIVIDUAL------");
        System.out.println("El alumno es: " + alu.toString());
        
        System.out.println("----------BUSQUEDA DE TODOS-------");
        ArrayList <Alumno> listaAlumnos = control.traerListaAlumnos();
        for(Alumno al : listaAlumnos){
            System.out.println("Alumno buscado: " + al.toString());
        }
        */
    
    }
}
