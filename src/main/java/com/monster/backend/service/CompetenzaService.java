package com.monster.backend.service;


import org.springframework.stereotype.Service;

import com.monster.backend.dto.CompetenzaDTO;
import com.monster.persistence.entity.Competenza;
import com.monster.repository.CompetenzaRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class CompetenzaService extends AbstractService<Competenza, CompetenzaDTO> {

	public CompetenzaDTO findByNome(String nome) {
		return converter.toDTO(((CompetenzaRepository)repository).findByNome(nome));
	}
}
