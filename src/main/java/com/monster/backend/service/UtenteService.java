package com.monster.backend.service;


import java.util.Date;

import org.springframework.stereotype.Service;

import com.monster.backend.dto.UtenteDTO;
import com.monster.backend.dto.AnnuncioDTO;
import com.monster.backend.dto.EsperienzaDTO;
import com.monster.backend.dto.PercorsoFormativoDTO;
import com.monster.backend.dto.UtenteDTO;
import com.monster.persistence.entity.Esperienza;
import com.monster.persistence.entity.PercorsoFormativo;
import com.monster.persistence.entity.Utente;
import com.monster.repository.AnnuncioRepository;
import com.monster.repository.UtenteRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class UtenteService extends AbstractService<Utente,UtenteDTO> {
		
	public UtenteDTO findByEmail(String email) {
		return converter.toDTO(((UtenteRepository)repository).findByEmail(email));
	}
	
	public UtenteDTO findByEmailAndPassword(String email, String password) {
		return converter.toDTO(((UtenteRepository)repository).findByEmailAndPassword(email,password));
	}
	
	public  Iterable<UtenteDTO>  findByDataNascitaGreaterThanEqual(Date data) {
		return converter.toDTOList(((UtenteRepository)repository).findByDataNascitaGreaterThanEqual(data));
	}
}
