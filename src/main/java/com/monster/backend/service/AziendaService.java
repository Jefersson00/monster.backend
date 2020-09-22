package com.monster.backend.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.monster.backend.dto.AnnuncioDTO;
import com.monster.backend.dto.AziendaDTO;
import com.monster.persistence.entity.Annuncio;
import com.monster.persistence.entity.Azienda;
import com.monster.repository.AnnuncioRepository;
import com.monster.repository.AziendaRepository;

@Service
public class AziendaService extends AbstractService<Azienda, AziendaDTO> {
	
	public AziendaDTO findByNome(String nome) {
		return converter.toDTO(((AziendaRepository)repository).findByNome(nome));
	}
	
	public AziendaDTO findByEmail(String email) {
		return converter.toDTO(((AziendaRepository)repository).findByEmail(email));
	}
	
	public AziendaDTO findByEmailAndPassword(String email, String password) {
		return converter.toDTO(((AziendaRepository)repository).findByEmailAndPassword(email,password));
	}
	
}
