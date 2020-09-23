package com.monster.backend.converter;

import org.springframework.stereotype.Component;

import com.monster.backend.dto.EsperienzaDTO;
import com.monster.persistence.entity.Esperienza;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Component
public class EsperienzaConverter extends AbstractConverter<Esperienza,EsperienzaDTO> {

	@Override
	public Esperienza toEntity(EsperienzaDTO esperienzaDTO) {
		Esperienza esperienza = null;
		if (esperienzaDTO != null) {
			
			esperienza  = new Esperienza(
					esperienzaDTO.getId()==null?-1:esperienzaDTO.getId(),
					esperienzaDTO.getDescrizione(),
					esperienzaDTO.getNomeAzienda(),
					null);
		}
		return esperienza ;
	}
	
	
	@Override
	public EsperienzaDTO toDTO(Esperienza esperienza) {
		EsperienzaDTO esperienzaDTO = null;
		if (esperienza != null) {
			
			esperienzaDTO = new EsperienzaDTO(
					esperienza.getId(),
					esperienza.getDescrizione(),
					esperienza.getNomeAzienda()
					);			
			
		}
		return esperienzaDTO;
	}
	
}
