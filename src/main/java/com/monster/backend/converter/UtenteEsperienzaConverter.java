package com.monster.backend.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.monster.backend.dto.UtenteEsperienzaDTO;
import com.monster.persistence.entity.UtenteEsperienza;
import com.monster.repository.EsperienzaRepository;
import com.monster.repository.UtenteRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Component
public class UtenteEsperienzaConverter extends AbstractConverter<UtenteEsperienza,UtenteEsperienzaDTO> {

	@Autowired
	UtenteRepository utenteRepository;
	
	@Autowired
	EsperienzaRepository esperienzaRepository;
	
	@Override
	public UtenteEsperienza toEntity(UtenteEsperienzaDTO utenteEsperienzaDTO) {
		UtenteEsperienza utenteEsperienza = null;
		if (utenteEsperienzaDTO != null) {
			utenteEsperienza = new UtenteEsperienza(
					utenteEsperienzaDTO.getId()==null?-1:utenteEsperienzaDTO.getId(),
					utenteEsperienzaDTO.getDataFine(),
					utenteEsperienzaDTO.getDataInizio(),
					esperienzaRepository.findById(utenteEsperienzaDTO.getEsperienza()).get(),
					utenteRepository.findById(utenteEsperienzaDTO.getUtente()).get()
					);	
			
		}
		return utenteEsperienza;
	}
	
	@Override
	public UtenteEsperienzaDTO toDTO(UtenteEsperienza utenteEsperienza) {
		UtenteEsperienzaDTO utenteEsperienzaDTO = null;
		if (utenteEsperienza != null) {
			
			utenteEsperienzaDTO = new UtenteEsperienzaDTO(
					utenteEsperienza.getId(),
					utenteEsperienza.getDataFine(),
					utenteEsperienza.getDataInizio(),
					utenteEsperienza.getEsperienza().getId(),
					utenteEsperienza.getUtente().getId()
					);			
			
		}
		return utenteEsperienzaDTO;
	}
	
}
