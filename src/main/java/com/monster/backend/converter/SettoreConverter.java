package com.monster.backend.converter;

import org.springframework.stereotype.Component;

import com.monster.backend.dto.SettoreDTO;
import com.monster.persistence.entity.Settore;

@Component
public class SettoreConverter extends AbstractConverter<Settore,SettoreDTO> {

	@Override
	public Settore toEntity(SettoreDTO settoreDTO) {
		Settore settore = null;
		if (settoreDTO != null) {
			settore = new Settore(settoreDTO.getId(),settoreDTO.getDescrizione(),settoreDTO.getNome(),null);			
		}
		return settore;
	}
	
	@Override
	public SettoreDTO toDTO(Settore settore) {
		SettoreDTO settoreDTO = null;
		if (settore != null) {
			settoreDTO = new SettoreDTO(settore.getId(),settore.getDescrizione(),settore.getNome());			
		}
		return settoreDTO;
	}
	
}
