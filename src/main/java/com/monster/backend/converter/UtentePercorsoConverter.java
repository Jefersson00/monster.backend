package com.monster.backend.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.monster.backend.dto.UtentePercorsoDTO;
import com.monster.persistence.entity.UtentePercorso;
import com.monster.repository.EsperienzaRepository;
import com.monster.repository.PercorsoFormativoRepository;
import com.monster.repository.UtenteRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Component
public class UtentePercorsoConverter extends AbstractConverter<UtentePercorso,UtentePercorsoDTO> {

	@Autowired
	UtenteRepository utenteRepository;
	
	@Autowired
	PercorsoFormativoRepository percorsoFormativoRepository;
	
	@Override
	public UtentePercorso toEntity(UtentePercorsoDTO utentePercorsoDTO) {
		UtentePercorso utentePercorso = null;
		if (utentePercorsoDTO != null) {
			utentePercorso = new UtentePercorso(
					utentePercorsoDTO.getId()==null?-1:utentePercorsoDTO.getId(),
					percorsoFormativoRepository.findById(utentePercorsoDTO.getPercorsoFormativo()).get(),
					utenteRepository.findById(utentePercorsoDTO.getUtente()).get()
					);	
			
		}
		return utentePercorso;
	}
	
	@Override
	public UtentePercorsoDTO toDTO(UtentePercorso utentePercorso) {
		UtentePercorsoDTO utentePercorsoDTO = null;
		if (utentePercorso != null) {
			
			utentePercorsoDTO = new UtentePercorsoDTO(
					utentePercorso.getId(),
					utentePercorso.getPercorsoFormativo().getId(),
					utentePercorso.getUtente().getId()
					);			
			
		}
		return utentePercorsoDTO;
	}
	
}
