package com.application.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.application.Entitys.Profesor;
import com.application.Repository.ProfesorRepository;

@Service
public class ProfesorService {
	
	private final ProfesorRepository repository = null;
	
	public Profesor save(Profesor profesor) {
        return repository.save(profesor);
    }
	
	public Optional<Profesor> findByEmail(String email) {
		return repository.findByEmail(email);
	}

    public List<Profesor> findAll() {
        return repository.findAll();
    }
    
    public List<Profesor> findByNombre(String nombre) {
        return repository.findByApellidos(nombre);
    }

    public List<Profesor> findByApellidos(String apellidos) {
        return repository.findByApellidos(apellidos);
    }
    
    public void delete(Profesor profesor) {
    	repository.delete(profesor);
    }

    public void deleteByEmail(String email) {
        repository.deleteByEmail(email);
    }
}
