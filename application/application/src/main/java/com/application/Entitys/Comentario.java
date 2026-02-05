package com.application.Entitys;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Comentarios")
public class Comentario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "texto", nullable = false)
    private String texto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "practica", nullable = false)
    private Practica practica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor", nullable = false)
    private Profesor profesor;

    /**
     * Constructor vacio de la clase Comentario
     */
    public Comentario() {
    }

    // Getters y setters
    public Integer getId() { 
    	return id; 
    }
    public void setId(Integer id) { 
    	this.id = id; 
    }

    public String getTexto() { 
    	return texto; 
    }
    public void setTexto(String texto) { 
    	this.texto = texto; 
    }

    public Practica getPractica() { 
    	return practica; 
    }
    public void setPractica(Practica practica) { 
    	this.practica = practica; 
    }

    public Profesor getProfesor() { 
    	return profesor; 
    }
    public void setProfesor(Profesor profesor) { 
    	this.profesor = profesor; 
    }
}