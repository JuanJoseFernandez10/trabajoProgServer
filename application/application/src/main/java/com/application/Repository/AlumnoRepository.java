package com.application.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.Entitys.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String>{
	
	List<Alumno> findByNombre(String nombre);
	List<Alumno> findByApellidos(String apellidos);
	void deleteByEmail(String email);

}
