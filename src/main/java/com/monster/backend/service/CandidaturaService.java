package com.monster.backend.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.backend.converter.AnnuncioConverter;
import com.monster.backend.converter.AziendaConverter;
import com.monster.backend.dto.AnnuncioDTO;
import com.monster.backend.dto.AziendaDTO;
import com.monster.backend.dto.CandidaturaDTO;
import com.monster.persistence.entity.Annuncio;
import com.monster.persistence.entity.Azienda;
import com.monster.persistence.entity.Candidatura;
import com.monster.repository.AnnuncioRepository;
import com.monster.repository.AziendaRepository;
import com.monster.repository.CandidaturaRepository;

/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class CandidaturaService extends AbstractService<Candidatura, CandidaturaDTO> {

//	@Autowired
//	AnnuncioConverter annuncioConverter;
//	
//	public  Iterable<CandidaturaDTO>  findByAnnuncio(AnnuncioDTO annuncioDTO) {
//		return converter.toDTOList(((CandidaturaRepository)repository).findByAnnuncio(converter.toEntity(annuncioDTO)));
//	}
	
}
