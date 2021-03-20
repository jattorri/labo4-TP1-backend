package com.laboratorio.tp4.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.laboratorio.tp4.entities.Empresa;
import com.laboratorio.tp4.repository.EmpresaRepository;
@Service
public class EmpresaService implements BaseService<Empresa>{
	
	private EmpresaRepository empresaRepository;
	
	public EmpresaService(EmpresaRepository empresaRepository) {
		this.empresaRepository = empresaRepository;
	}

	@Override
	@Transactional 
	public List<Empresa> findAll() throws Exception {
		try {
			List<Empresa> empresa = empresaRepository.findAll();
			return empresa;
		}catch( Exception e){
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional 
	public Empresa findById(Long id) throws Exception {
		try {
			Optional<Empresa> empresaOptional = empresaRepository.findById(id);
			return empresaOptional.get();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional 
	public Empresa save(Empresa empresa) throws Exception {
		try {
			empresa = empresaRepository.save(empresa);
			return empresa;
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional 
	public Empresa update(Long id, Empresa entity) throws Exception {
		try {Optional<Empresa> empresaOptional = empresaRepository.findById(id);
		Empresa empresa = empresaOptional.get();
		empresa = empresaRepository.save(empresa);
		return empresa;
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
 
	@Override
	@Transactional 
	public boolean delete(Long id) throws Exception {
		try {
			if(empresaRepository.existsById(id)) {
				empresaRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
