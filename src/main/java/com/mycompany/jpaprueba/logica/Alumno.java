package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity //Marco la clase que quiero que se convierta en una tabla
public class Alumno implements Serializable {
    
    @Id //Para la ID
    @GeneratedValue(strategy=GenerationType.AUTO) //Genero ID random con AUTO
    private int id;
    @Basic //Para los campos que no se usan para nada particular. NO ES OBLIGATORIO
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    
    @OneToOne
    //@JoinColumn(name = "carrera_id")
    private Carrera carre; //RELACION ALUMNO - CARRERA

    
    //Contructor vacio
    public Alumno() {
    }
    

    
    //Constructor 
    public Alumno(int id, String nombre, String apellido, Date fechaNac, Carrera carre) {   
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.carre = carre;
    }

    //Getters y Setters

    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + '}';
    }
    
    
    
}


