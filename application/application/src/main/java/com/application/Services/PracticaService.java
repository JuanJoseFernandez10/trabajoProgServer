package com.application.Services;

import java.util.List;

import com.application.Entitys.Alumno;
import com.application.Entitys.Empresa;
import com.application.Entitys.Practica;
import com.application.Repository.PracticaRepository;

public class PracticaService {
	
	private final PracticaRepository repository = null;
	
	public List<Practica> findByAlumno(Alumno alumno) {
		return repository.findByAlumno(alumno);
	}
	public List<Practica> findeByEmpresa(Empresa empresa) {
		return repository.findeByEmpresa(empresa);
	}
	public List<Practica> findByAlumnoAndEmpresa(Alumno alumno, Empresa empresa) {
		return repository.findByAlumnoAndEmpresa(alumno, empresa);
	}
	public void deleteByAlumno(Alumno alumno) {
		repository.deleteByAlumno(alumno);
	}
	public void deleteByEmpresa(Empresa empresa) {
		repository.deleteByEmpresa(empresa);
	}

}
