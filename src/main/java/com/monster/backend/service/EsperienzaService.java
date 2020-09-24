package com.monster.backend.service;


import org.springframework.stereotype.Service;

import com.monster.backend.dto.EsperienzaDTO;
import com.monster.persistence.entity.Esperienza;
import com.monster.repository.EsperienzaRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Service
public class EsperienzaService extends AbstractService<Esperienza,EsperienzaDTO> {

	public  Iterable<EsperienzaDTO>  findByNomeAzienda(String nomeAzienda) {
		return converter.toDTOList(((EsperienzaRepository)repository).findByNomeAzienda(nomeAzienda));
	}
}
