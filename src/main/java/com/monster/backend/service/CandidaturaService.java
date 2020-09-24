package com.monster.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.backend.converter.AnnuncioConverter;
import com.monster.backend.converter.UtenteConverter;
import com.monster.backend.dto.AnnuncioDTO;
import com.monster.backend.dto.CandidaturaDTO;
import com.monster.backend.dto.UtenteDTO;
import com.monster.persistence.entity.Candidatura;
import com.monster.repository.CandidaturaRepository;

/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class CandidaturaService extends AbstractService<Candidatura, CandidaturaDTO> {

	@Autowired
	AnnuncioConverter annuncioConverter;
	
	@Autowired
	UtenteConverter utenteConverter;
	
	public  Iterable<CandidaturaDTO>  findByAnnuncio(AnnuncioDTO annuncioDTO) {
		return converter.toDTOList(((CandidaturaRepository)repository).findByAnnuncio(annuncioConverter.toEntity(annuncioDTO)));
	}
	
	public  Iterable<CandidaturaDTO>  findByUtente(UtenteDTO utenteDTO) {
		return converter.toDTOList(((CandidaturaRepository)repository).findByUtente(utenteConverter.toEntity(utenteDTO)));
	}
	
}
