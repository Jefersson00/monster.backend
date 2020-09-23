package com.monster.backend.converter;

import org.springframework.stereotype.Component;

import com.monster.backend.dto.AziendaDTO;
import com.monster.persistence.entity.Azienda;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Component
public class AziendaConverter extends AbstractConverter<Azienda,AziendaDTO> {

	@Override
	public Azienda toEntity(AziendaDTO aziendaDTO) {
		Azienda azienda = null;
		if (aziendaDTO != null) {
			
			azienda = new Azienda(
					aziendaDTO.getId()==null?-1:aziendaDTO.getId(),
					aziendaDTO.getAnnoFondazione(),
					aziendaDTO.getDescrizione(),
					aziendaDTO.getEmail(),
					aziendaDTO.getLink(),
					aziendaDTO.getLogo(),
					aziendaDTO.getNome(),
					aziendaDTO.getNumeroDipendenti(),
					aziendaDTO.getPassword(),
					aziendaDTO.getSettore(),null);			
		}
		return azienda;
	}
	
	@Override
	public AziendaDTO toDTO(Azienda azienda) {
		AziendaDTO aziendaDTO = null;
		if (azienda != null) {
			
			aziendaDTO = new AziendaDTO(
					azienda.getId(),
					azienda.getAnnoFondazione(),
					azienda.getDescrizione(),
					azienda.getEmail(),
					azienda.getLink(),
					azienda.getLogo(),
					azienda.getNome(),
					azienda.getNumeroDipendenti(),
					azienda.getPassword(),
					azienda.getSettore()
					);			
			
		}
		return aziendaDTO;
	}
	
}
