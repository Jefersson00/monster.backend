package com.monster.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.monster.backend.converter.Converter;


public abstract class AbstractService<Entity,DTO> implements ServiceDTO<DTO> {
	
	@Autowired
	protected JpaRepository<Entity,Long> repository;
	
	@Autowired
	protected Converter<Entity,DTO> converter;
	
	
	
	@Override
	public DTO getById(long id) {
		System.out.println(converter.toString());
		return converter.toDTO(repository.findById(id).get());
	}
	
	@Override
	public DTO insert(DTO dto) {
		return converter.toDTO(repository.save(converter.toEntity(dto)));
	}

	@Override
	public DTO update(DTO dto) {
		return converter.toDTO(repository.save(converter.toEntity(dto)));
	}

	@Override
	public void delete(long id) {
		repository.deleteById(id);
	}
	
	
	@Override
	public void deleteAll() {
		repository.deleteAll();
	}
	
	@Override
	public Iterable<DTO> getAll() {
		return converter.toDTOList(repository.findAll());
	}
}