package com.monster.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.monster.backend.service.ServiceDTO;


public abstract class AbstractController <DTO>{

	@Autowired
	private ServiceDTO<DTO> service;
	
	@GetMapping("/")
	public Iterable<DTO> getAll(){
		return service.getAll();		
	}
	
	@GetMapping("/{id}")
	public DTO read(long id) {
		return service.getById(id);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@RequestParam("id") long id) {
		service.delete(id);
	}
	
	@DeleteMapping("/")
	public void deleteAll() {
		service.deleteAll();
	}
	
	
	@PutMapping("/{dto}")
	public DTO update(@RequestBody DTO dto){
		service.update(dto);
		return dto;
	}
	
	@PostMapping("/{dto}")
	public DTO insert (@RequestBody DTO dto) {
		service.insert(dto);
		return dto;
	}
	
	
}