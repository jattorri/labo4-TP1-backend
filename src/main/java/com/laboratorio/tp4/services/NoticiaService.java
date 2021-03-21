package com.laboratorio.tp4.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.laboratorio.tp4.entities.Noticia;
import com.laboratorio.tp4.repository.NoticiaRepository;

@Service
public class NoticiaService implements BaseService<Noticia>{
	
	public NoticiaRepository noticiaRepository;
	
	public NoticiaService(NoticiaRepository noticiaRepository) {
		this.noticiaRepository = noticiaRepository;
		
	}

	@Override
	@Transactional 
	public List<Noticia> findAll() throws Exception {
		try {
			List<Noticia> noticia = noticiaRepository.findAll();
			return noticia;
		}catch( Exception e){
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional 
	public Noticia findById(Long id) throws Exception {
		try {
			Optional<Noticia> noticiaOptional = noticiaRepository.findById(id);
			return noticiaOptional.get();
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional 
	public Noticia save(Noticia noticia) throws Exception {
		try {
			noticia = noticiaRepository.save(noticia);
			return noticia;
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		
	}

	@Override
	@Transactional 
	public Noticia update(Long id, Noticia entity) throws Exception {
		try {Optional<Noticia> noticiaOptional = noticiaRepository.findById(id);
		Noticia noticia = noticiaOptional.get();
		noticia = noticiaRepository.save(noticia);
		return noticia;
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
 
	@Override
	@Transactional 
	public boolean delete(Long id) throws Exception {
		try {
			if(noticiaRepository.existsById(id)) {
				noticiaRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
