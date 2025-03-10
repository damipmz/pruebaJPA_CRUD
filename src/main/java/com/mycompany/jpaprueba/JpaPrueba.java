package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;


public class JpaPrueba {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();            
        
        Alumno alum = new Alumno(55, "Pedro", "Cucito", new Date());       
        control.crearAlumno(alum);
        
        /*
        //control.eliminarAlumno(30);
        
        //Edito apellido
        alu.setApellido("Panflin");
        control.editarAlumno(alu);
        */
        
        //FIND
        Alumno alu = control.traerAlumno(15);
        System.out.println("---------BUSQUEDA INDIVIDUAL------");
        System.out.println("El alumno es: " + alu.toString());
        
        System.out.println("----------BUSQUEDA DE TODOS-------");
        ArrayList <Alumno> listaAlumnos = control.traerListaAlumnos();
        for(Alumno al : listaAlumnos){
            System.out.println("Alumno buscado: " + al.toString());
        }
    
    }
}
