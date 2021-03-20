package com.laboratorio.tp4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.tp4.entities.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
}
