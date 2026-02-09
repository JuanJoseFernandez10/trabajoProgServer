package com.application.Entitys;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Alumnos")
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 60, nullable = false)
    private String nombre;

    @Column(length = 100, nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private Date fecha_nacimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso", nullable = false)
    private Curso curso;

    public Alumno () {
    	
    }
    
    /**
     * Constructor de la clase Alumno
     * @param email
     * @param nombre
     * @param apellidos
     * @param fecha_nacimiento
     * @param curso
     */
    public Alumno(String email, String nombre, String apellidos, Date fecha_nacimiento, Curso curso) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.curso = curso;
    }

    // Getters y setters
    public String getEmail() { 
    	return email;
    }
    public void setEmail(String email) { 
    	this.email = email; 
    }

    public String getNombre() { 
    	return nombre; 
    }
    public void setNombre(String nombre) { 
    	this.nombre = nombre; 
    }

    public String getApellidos() { 
    	return apellidos; 
    }
    public void setApellidos(String apellidos) { 
    	this.apellidos = apellidos; 
    }

    public Date getFecha_nacimiento() { 
    	return fecha_nacimiento; 
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) { 
    	this.fecha_nacimiento = fecha_nacimiento; 
    }

    public Curso getCurso() { 
    	return curso; 
    }
    public void setCurso(Curso curso) { 
    	this.curso = curso; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return email.equals(alumno.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
    
    
    
    
}