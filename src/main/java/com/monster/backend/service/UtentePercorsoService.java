package com.monster.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.backend.converter.PercorsoFormativoConverter;
import com.monster.backend.converter.UtenteConverter;
import com.monster.backend.dto.PercorsoFormativoDTO;
import com.monster.backend.dto.UtentePercorsoDTO;
import com.monster.backend.dto.UtenteDTO;
import com.monster.persistence.entity.UtentePercorso;
import com.monster.repository.UtentePercorsoRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class UtentePercorsoService extends AbstractService<UtentePercorso,UtentePercorsoDTO> {

	@Autowired
	PercorsoFormativoConverter percorsoFormativoConverter;
	
	@Autowired
	UtenteConverter utenteConverter;
	
	public  Iterable<UtentePercorsoDTO>  findByPercorso(PercorsoFormativoDTO percorsoFormativoDTO) {
		return converter.toDTOList(((UtentePercorsoRepository)repository).findByPercorsoFormativo(percorsoFormativoConverter.toEntity(percorsoFormativoDTO)));
	}
	
	public  Iterable<UtentePercorsoDTO>  findByUtente(UtenteDTO utenteDTO) {
		return converter.toDTOList(((UtentePercorsoRepository)repository).findByUtente(utenteConverter.toEntity(utenteDTO)));
	}
}
