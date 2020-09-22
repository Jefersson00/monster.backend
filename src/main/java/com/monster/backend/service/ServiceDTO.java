package com.monster.backend.service;

public interface ServiceDTO<DTO> {
	
	public Iterable<DTO> getAll();

	public DTO getById(long id);
	
	public DTO insert (DTO dto);
	
	public DTO update (DTO dto);
	
	public void delete (long id);
	
	public void deleteAll ();
}