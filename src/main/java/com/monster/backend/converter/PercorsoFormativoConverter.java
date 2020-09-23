package com.monster.backend.converter;

import org.springframework.stereotype.Component;

import com.monster.backend.dto.PercorsoFormativoDTO;
import com.monster.persistence.entity.PercorsoFormativo;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Component
public class PercorsoFormativoConverter extends AbstractConverter<PercorsoFormativo,PercorsoFormativoDTO> {

	@Override
	public PercorsoFormativo toEntity(PercorsoFormativoDTO percorsoFormativoDTO) {
		PercorsoFormativo percorsoFormativo = null;
		if (percorsoFormativoDTO != null) {
			
			percorsoFormativo  = new PercorsoFormativo(
					percorsoFormativoDTO.getId()==null?-1:percorsoFormativoDTO.getId(),
					percorsoFormativoDTO.getDescrizione(),
					percorsoFormativoDTO.getFormazione(),
					null);
		}
		return percorsoFormativo ;
	}
	
	
	@Override
	public PercorsoFormativoDTO toDTO(PercorsoFormativo percorsoFormativo) {
		PercorsoFormativoDTO percorsoFormativoDTO = null;
		if (percorsoFormativo != null) {
			
			percorsoFormativoDTO = new PercorsoFormativoDTO(
					percorsoFormativo.getId(),
					percorsoFormativo.getDescrizione(),
					percorsoFormativo.getFormazione()
					);			
			
		}
		return percorsoFormativoDTO;
	}
	
}
