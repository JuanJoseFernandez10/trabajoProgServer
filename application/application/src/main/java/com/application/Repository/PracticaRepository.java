package com.application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.Entitys.Alumno;
import com.application.Entitys.Practica;
import com.application.Entitys.Profesor;

import java.util.List;
import java.util.Optional;

import com.application.Entitys.Empresa;

@Repository
public interface PracticaRepository extends JpaRepository<Practica, Integer>{

	List<Practica> findByAlumno(Alumno alumno);
	List<Practica> findByEmpresa(Empresa empresa);
	List<Practica> findByProfesor(Profesor profesor);
	List<Practica> findByAlumnoAndEmpresa(Alumno alumno, Empresa empresa);
	void deleteByAlumno(Alumno alumno);
	void deleteByEmpresa(Empresa empresa);
	
}
