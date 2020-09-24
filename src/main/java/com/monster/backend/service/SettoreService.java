package com.monster.backend.service;

import org.springframework.stereotype.Service;

import com.monster.backend.dto.SettoreDTO;
import com.monster.persistence.entity.Settore;
import com.monster.repository.SettoreRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class SettoreService extends AbstractService<Settore , SettoreDTO> {
	
	public SettoreDTO findByNome(String nome) {
		return converter.toDTO(((SettoreRepository)repository).findByNome(nome));
	}
}
