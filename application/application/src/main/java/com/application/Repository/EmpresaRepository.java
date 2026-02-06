package com.application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.Entitys.Empresa;
import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, String>{

	List<Empresa> findByNombre(String nombre);
	void deleteByNombre(String nombre);
}
