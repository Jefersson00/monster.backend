package com.monster.backend.service;

import org.springframework.stereotype.Service;

import com.monster.backend.dto.SedeDTO;
import com.monster.persistence.entity.Sede;
import com.monster.repository.SedeRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class SedeService extends AbstractService<Sede, SedeDTO> {
	
	public  Iterable<SedeDTO>  findByCitta(String citta) {
		return converter.toDTOList(((SedeRepository)repository).findByCitta(citta));
	}
	
	public  Iterable<SedeDTO>  findByRegione(String regione) {
		return converter.toDTOList(((SedeRepository)repository).findByCitta(regione));
	}
}
