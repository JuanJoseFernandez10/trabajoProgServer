package com.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.Entitys.Alumno;
import com.application.Repository.AlumnoRepository;

@Service
public class AlumnoService {

	private final AlumnoRepository repository = null;
	
	public Alumno save(Alumno alumno) {
        return repository.save(alumno);
    }

    public List<Alumno> findAll() {
        return repository.findAll();
    }
    
    public List<Alumno> findByNombre(String nombre) {
        return repository.findByApellidos(nombre);
    }

    public List<Alumno> findByApellidos(String apellidos) {
        return repository.findByApellidos(apellidos);
    }
    
    public void delete(Alumno profesor) {
    	repository.delete(profesor);
    }

    public void deleteByEmail(String email) {
        repository.deleteByEmail(email);
    }
	
}
