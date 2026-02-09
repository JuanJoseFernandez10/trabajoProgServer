package com.application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.Entitys.Profesor;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, String>{
	
	List<Profesor> findByNombre(String nombre);
	Optional<Profesor> findByEmail(String email);
	List<Profesor> findByApellidos(String apellidos);
	void deleteByEmail(String email);
}
