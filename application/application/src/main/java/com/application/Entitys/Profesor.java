package com.application.Entitys;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Profesores")
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 60, nullable = false)
    private String nombre;

    @Column(length = 100, nullable = false)
    private String apellidos;

    @Column(length = 255, nullable = false)
    private String contraseña;

    @Column(name = "directiva", columnDefinition = "TINYINT(1) DEFAULT 0")
    private int esDirectiva;   // 0 = normal, 1 = directiva

    public Profesor () {
    	
    }
    
    /**
     * Constructor de la clase Profesor
     * @param email
     * @param nombre
     * @param apellidos
     * @param contraseña
     * @param directiva
     */
    public Profesor(String email, String nombre, String apellidos, String contraseña, int directiva) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.esDirectiva = directiva;
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

    public String getContraseña() { 
    	return contraseña; 
    }
    public void setContraseña(String contraseña) { 
    	this.contraseña = contraseña; 
    }

    public int isDirectiva() { 
    	return esDirectiva; 
    }
    public void setDirectiva(int directiva) { 
    	this.esDirectiva = directiva; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return email.equals(profesor.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
}