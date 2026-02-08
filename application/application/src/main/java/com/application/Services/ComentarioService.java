package com.application.Services;

import java.util.List;

import com.application.Entitys.Comentario;
import com.application.Entitys.Practica;
import com.application.Entitys.Profesor;
import com.application.Repository.ComentarioRepository;

public class ComentarioService {
	
	private final ComentarioRepository repository = null;
	
	public List<Comentario> findByProfesor(Profesor profesor) {
		return repository.findByProfesor(profesor);
	}
	public List<Comentario> findByPractica(Practica practica) {
		return repository.findByPractica(practica);
	}
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

}
