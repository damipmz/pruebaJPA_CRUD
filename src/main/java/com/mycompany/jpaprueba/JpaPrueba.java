package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.Date;
import java.util.LinkedList;


public class JpaPrueba {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();         
        
        //Creamos lista de materias y las agregamos
        LinkedList <Materia> listaMaterias = new LinkedList <Materia>();
        
        //Creacion carrera con lista de materias
        Carrera carre = new Carrera(25, "Ingenieria en Informatica", listaMaterias);
        
        //Guardado carrear en BD
        control.crearCarrera(carre);
        
        //Creacion Carrera
        Materia mate1 = new Materia (56, "Programacion I", "Cuatrimestral", carre);
        Materia mate2 = new Materia (57, "Programacion II", "Cuatrimestral", carre);
        Materia mate3 = new Materia (58, "Programacion Avanzada", "Anual", carre);
        
        //Guardado carrera en BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        
        //Agregasr a la lista las materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
        
        
        //Creacion carrera con lista de materias
        //Carrera carre = new Carrera(25, "Ingenieria en Informatica", listaMaterias);
        
        //Guardado carrear en BD
        //control.crearCarrera(carre);
        
        
        //Creacion alumno (con carrera) 
        Alumno alum1 = new Alumno(21, "Juan", "Pepe", new Date(), carre);
        
        //Guardamos el alumno en la BD
        control.crearAlumno(alum1);
        
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
