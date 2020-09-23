package com.monster.backend.service;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
public interface ServiceDTO<DTO> {
	
	public Iterable<DTO> getAll();

	public DTO getById(long id);
	
	public DTO insert (DTO dto);
	
	public DTO update (DTO dto);
	
	public void delete (long id);
	
	public void deleteAll ();
}