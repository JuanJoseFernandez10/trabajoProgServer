package com.application.Entitys;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cursos")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 50, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "curso")
    private List<Alumno> alumnos = new ArrayList<Alumno>();

    /**
     * Constructor de la clase Curso
     * @param nombre
     */
    public Curso(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters
    public String getNombre() { 
    	return nombre; 
    }
    public void setNombre(String nombre) { 
    	this.nombre = nombre; 
    }

    public List<Alumno> getAlumnos() { 
    	return alumnos; 
    }
    public void setAlumnos(List<Alumno> alumnos) { 
    	this.alumnos = alumnos; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return nombre.equals(curso.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}