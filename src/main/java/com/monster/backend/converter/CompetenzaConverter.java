package com.monster.backend.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.monster.backend.dto.AnnuncioDTO;
import com.monster.backend.dto.CompetenzaDTO;
import com.monster.persistence.entity.Annuncio;
import com.monster.persistence.entity.Competenza;
import com.monster.repository.AnnuncioRepository;
import com.monster.repository.UtenteRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Component
public class CompetenzaConverter extends AbstractConverter<Competenza,CompetenzaDTO> {

	
	
	@Override
	public Competenza toEntity(CompetenzaDTO competenzaDTO) {
		Competenza competenza = null;
		if (competenzaDTO != null) {
			competenza = new Competenza(
					competenzaDTO.getId()==null?-1:competenzaDTO.getId(),
					competenzaDTO.getDescrizione(),
					competenzaDTO.getNome(),		
					null
					);	
			
		}
		return competenza;
	}
	
	@Override
	public CompetenzaDTO toDTO(Competenza competenza) {
		CompetenzaDTO  competenzaDTO = null;
		if (competenza != null) {
			
			competenzaDTO = new CompetenzaDTO(
					competenza.getId(),
					competenza.getDescrizione(),
					competenza.getNome()
					);			
			
		}
		return competenzaDTO;
	}
	
}
