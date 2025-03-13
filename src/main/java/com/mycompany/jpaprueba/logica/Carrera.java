package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Carrera implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    
    @OneToMany (mappedBy="carre")
    private LinkedList<Materia> materias;

    public Carrera() {
    }

    public Carrera(int id, String nombre, LinkedList<Materia> materias) {
        this.id = id;
        this.nombre = nombre;
        this.materias = materias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Materia> getMaterias() {
        return materias;
    }

    public void setListaMaterias(LinkedList<Materia> materias) {
        this.materias = materias;
    }

 
    
    
}
