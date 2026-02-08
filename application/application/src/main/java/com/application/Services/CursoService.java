package com.application.Services;

import java.util.List;

import com.application.Entitys.Curso;
import com.application.Repository.CursoRepository;

public class CursoService {
	
	private final CursoRepository repository = null;
	
	public List<Curso> findByNombre(String nombre) {
		return repository.findByNombre(nombre);
	}
	public void deleteByNombre(String nombre) {
		repository.deleteByNombre(nombre);
	}

}
