package com.application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.Entitys.Curso;
import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, String>{

	List<Curso> findByNombre(String nombre);
	void deleteByNombre(String nombre);
}
