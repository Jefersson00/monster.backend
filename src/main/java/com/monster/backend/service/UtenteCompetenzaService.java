package com.monster.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.backend.converter.CompetenzaConverter;
import com.monster.backend.converter.UtenteConverter;
import com.monster.backend.dto.CompetenzaDTO;
import com.monster.backend.dto.UtenteCompetenzaDTO;
import com.monster.backend.dto.UtenteDTO;
import com.monster.persistence.entity.UtenteCompetenza;
import com.monster.repository.UtenteCompetenzaRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class UtenteCompetenzaService extends AbstractService<UtenteCompetenza,UtenteCompetenzaDTO> {

	@Autowired
	CompetenzaConverter competenzaConverter;
	
	@Autowired
	UtenteConverter utenteConverter;
	
	public  Iterable<UtenteCompetenzaDTO>  findByCompetenza(CompetenzaDTO competenzaDTO) {
		return converter.toDTOList(((UtenteCompetenzaRepository)repository).findByCompetenza(competenzaConverter.toEntity(competenzaDTO)));
	}
	
	public  Iterable<UtenteCompetenzaDTO>  findByUtente(UtenteDTO utenteDTO) {
		return converter.toDTOList(((UtenteCompetenzaRepository)repository).findByUtente(utenteConverter.toEntity(utenteDTO)));
	}
}
