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

    @Column(nullable = false)
    private boolean directiva = false;

    /**
     * Constructor de la clase Profesor
     * @param email
     * @param nombre
     * @param apellidos
     * @param contraseña
     * @param directiva
     */
    public Profesor(String email, String nombre, String apellidos, String contraseña, boolean directiva) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.directiva = directiva;
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

    public boolean isDirectiva() { 
    	return directiva; 
    }
    public void setDirectiva(boolean directiva) { 
    	this.directiva = directiva; 
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