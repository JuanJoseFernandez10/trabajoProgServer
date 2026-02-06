package com.application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.Entitys.Comentario;
import com.application.Entitys.Profesor;

import java.util.List;
import com.application.Entitys.Practica;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer>{

	List<Comentario> findByProfesor(Profesor profesor);
	List<Comentario> findByPractica(Practica practica);
	void deleteById(Integer id);
}
