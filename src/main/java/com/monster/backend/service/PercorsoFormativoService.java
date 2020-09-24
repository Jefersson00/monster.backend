package com.monster.backend.service;


import org.springframework.stereotype.Service;

import com.monster.backend.dto.PercorsoFormativoDTO;
import com.monster.persistence.entity.PercorsoFormativo;
import com.monster.repository.PercorsoFormativoRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class PercorsoFormativoService extends AbstractService<PercorsoFormativo,PercorsoFormativoDTO> {

	public PercorsoFormativoDTO findByFormazione(String formazione) {
		return converter.toDTO(((PercorsoFormativoRepository)repository).findByFormazione(formazione));
	}
}
