package com.monster.backend.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.monster.backend.dto.UtenteCompetenzaDTO;
import com.monster.persistence.entity.UtenteCompetenza;
import com.monster.repository.AziendaRepository;
import com.monster.repository.CompetenzaRepository;
import com.monster.repository.SedeRepository;
import com.monster.repository.SettoreRepository;
import com.monster.repository.UtenteRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Component
public class UtenteCompetenzaConverter extends AbstractConverter<UtenteCompetenza,UtenteCompetenzaDTO> {

	@Autowired
	UtenteRepository utenteRepository;
	
	@Autowired
	CompetenzaRepository competenzaRepository;
	
	@Override
	public UtenteCompetenza toEntity(UtenteCompetenzaDTO utenteCompetenzaDTO) {
		UtenteCompetenza utenteCompetenza = null;
		if (utenteCompetenzaDTO != null) {
			utenteCompetenza = new UtenteCompetenza(
					utenteCompetenzaDTO.getId()==null?-1:utenteCompetenzaDTO.getId(),
					competenzaRepository.findById(utenteCompetenzaDTO.getCompetenza()).get(),
					utenteRepository.findById(utenteCompetenzaDTO.getUtente()).get()
					);	
			
		}
		return utenteCompetenza;
	}
	
	@Override
	public UtenteCompetenzaDTO toDTO(UtenteCompetenza utenteCompetenza) {
		UtenteCompetenzaDTO utenteCompetenzaDTO = null;
		if (utenteCompetenza != null) {
			
			utenteCompetenzaDTO = new UtenteCompetenzaDTO(
					utenteCompetenza.getId(),
					utenteCompetenza.getCompetenza().getId(),
					utenteCompetenza.getUtente().getId()
					);			
			
		}
		return utenteCompetenzaDTO;
	}
	
}
