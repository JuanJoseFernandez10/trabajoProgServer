package com.application.Entitys;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Empresas")
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 100, nullable = false)
    private String nombre;

    @Column(length = 255, nullable = false)
    private String descripcion;

    public Empresa () {
    	
    }
    
    /**
     * Constructor de la clase Empresa
     * @param nombre
     * @param descripcion
     */
    public Empresa(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { 
    	return nombre; 
    }
    public void setNombre(String nombre) { 
    	this.nombre = nombre; 
    }

    public String getDescripcion() { 
    	return descripcion; 
    }
    public void setDescripcion(String descripcion) { 
    	this.descripcion = descripcion; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return nombre.equals(empresa.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}