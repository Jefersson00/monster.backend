package com.monster.backend.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.monster.backend.dto.AnnuncioDTO;
import com.monster.backend.dto.CandidaturaDTO;
import com.monster.persistence.entity.Annuncio;
import com.monster.persistence.entity.Candidatura;
import com.monster.repository.AnnuncioRepository;
import com.monster.repository.UtenteRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Component
public class CandidaturaConverter extends AbstractConverter<Candidatura,CandidaturaDTO> {

	
	
	@Autowired
	AnnuncioRepository annuncioRepository;
	
	@Autowired
	UtenteRepository utenteRepository;
	
	@Override
	public Candidatura toEntity(CandidaturaDTO candidaturaDTO) {
		Candidatura candidatura = null;
		if (candidaturaDTO != null) {
			candidatura = new Candidatura(
					candidaturaDTO.getId()==null?-1:candidaturaDTO.getId(),
					annuncioRepository.findById(candidaturaDTO.getAnnuncio()).get(),
					utenteRepository.findById(candidaturaDTO.getUtente()).get()
					);	
			
		}
		return candidatura;
	}
	
	@Override
	public CandidaturaDTO toDTO(Candidatura candidatura) {
		CandidaturaDTO  candidaturaDTO = null;
		if (candidatura != null) {
			
			candidaturaDTO = new CandidaturaDTO(
					candidatura.getId(),
					candidatura.getAnnuncio().getId(),
					candidatura.getUtente().getId()
					);			
			
		}
		return candidaturaDTO;
	}
	
}
