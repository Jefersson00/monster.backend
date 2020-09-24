package com.monster.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.backend.converter.EsperienzaConverter;
import com.monster.backend.converter.UtenteConverter;
import com.monster.backend.dto.EsperienzaDTO;
import com.monster.backend.dto.UtenteEsperienzaDTO;
import com.monster.backend.dto.UtenteDTO;
import com.monster.persistence.entity.UtenteEsperienza;
import com.monster.repository.UtenteEsperienzaRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class UtenteEsperienzaService extends AbstractService<UtenteEsperienza,UtenteEsperienzaDTO> {

	@Autowired
	EsperienzaConverter EsperienzaConverter;
	
	@Autowired
	UtenteConverter utenteConverter;
	
	public  Iterable<UtenteEsperienzaDTO>  findByEsperienza(EsperienzaDTO EsperienzaDTO) {
		return converter.toDTOList(((UtenteEsperienzaRepository)repository).findByEsperienza(EsperienzaConverter.toEntity(EsperienzaDTO)));
	}
	
	public  Iterable<UtenteEsperienzaDTO>  findByUtente(UtenteDTO utenteDTO) {
		return converter.toDTOList(((UtenteEsperienzaRepository)repository).findByUtente(utenteConverter.toEntity(utenteDTO)));
	}
}
