package com.application.Entitys;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Practicas")
public class Practica implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date fecha_inicio;

    @Column(nullable = false)
    private Date fecha_final;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alumno", nullable = false)
    private Alumno alumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa", nullable = false)
    private Empresa empresa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor")
    private Profesor profesor;

    /**
     * Constructor vacio de la clase Practica
     */
    public Practica() {
    }

    // Getters y setters
    public Integer getId() { 
    	return id; 
    }
    public void setId(Integer id) { 
    	this.id = id; 
    }

    public Date getFecha_inicio() { 
    	return fecha_inicio; 
    }
    public void setFecha_inicio(Date fecha_inicio) { 
    	this.fecha_inicio = fecha_inicio; 
    }

    public Date getFecha_final() { 
    	return fecha_final; 
    }
    public void setFecha_final(Date fecha_final) { 
    	this.fecha_final = fecha_final; 
    }

    public Alumno getAlumno() { 
    	return alumno; 
    }
    public void setAlumno(Alumno alumno) { 
    	this.alumno = alumno; 
    }

    public Empresa getEmpresa() { 
    	return empresa; 
    }
    public void setEmpresa(Empresa empresa) { 
    	this.empresa = empresa; 
    }

    public Profesor getProfesor() { 
    	return profesor; 
    }
    public void setProfesor(Profesor profesor) { 
    	this.profesor = profesor; 
    }
 
    
}