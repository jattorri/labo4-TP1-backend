package com.laboratorio.tp4.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laboratorio.tp4.entities.Empresa;
import com.laboratorio.tp4.entities.Noticia;
import com.laboratorio.tp4.services.NoticiaService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="api/noticias")
public class NoticiaController {
	
	NoticiaService noticiaService;
	
	public NoticiaController (NoticiaService noticiaService) {
		this.noticiaService = noticiaService;
	}
	
	@GetMapping("")
	public ResponseEntity<?> getAll(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(noticiaService.findAll());
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde\" }");
		} 
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOne(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(noticiaService.findById(id));
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde\" }");
		} 
	}
	@PostMapping("")
	public ResponseEntity<?> save (@RequestBody Noticia noticia ){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(noticiaService.save(noticia));
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde\" }");
		} 
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Noticia noticia){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(noticiaService.update(id, noticia));
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde\" }");
		} 
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(noticiaService.delete(id));
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde\" }");
		} 
	}
 
	

}
