package com.monster.backend.converter;

import org.springframework.stereotype.Component;

import com.monster.backend.dto.UtenteDTO;
import com.monster.persistence.entity.Utente;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Component
public class UtenteConverter extends AbstractConverter<Utente,UtenteDTO> {

	@Override
	public Utente toEntity(UtenteDTO utenteDTO) {
		Utente utente = null;
		if (utenteDTO != null) {
			
			utente = new Utente(
					utenteDTO.getId()==null?-1:utenteDTO.getId(),
					utenteDTO.getCognome(),
					utenteDTO.getCv(),
					utenteDTO.getDataNascita(),
					utenteDTO.getEmail(),
					utenteDTO.getNome(),
					utenteDTO.getPassword(),
					utenteDTO.getTelefono(),
					null,
					null,
					null,
					null
					);			
		}
		return utente;
	}
	
	@Override
	public UtenteDTO toDTO(Utente utente) {
		UtenteDTO utenteDTO = null;
		if (utente != null) {
			
			utenteDTO = new UtenteDTO(
					utente.getId(),
					utente.getCognome(),
					utente.getCv(),
					utente.getDataNascita(),
					utente.getEmail(),
					utente.getNome(),
					utente.getPassword(),
					utente.getTelefono()
					);			
			
		}
		return utenteDTO;
	}
	
}
