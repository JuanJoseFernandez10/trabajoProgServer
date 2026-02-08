package com.application.Services;

import java.util.List;

import com.application.Entitys.Empresa;
import com.application.Repository.EmpresaRepository;

public class EmpresaService {
	
	private final EmpresaRepository repository = null;
	
	public List<Empresa> findByNombre(String nombre) {
		return repository.findByNombre(nombre);
	}
	public void deleteByNombre(String nombre) {
		repository.deleteByNombre(nombre);
	}

}
