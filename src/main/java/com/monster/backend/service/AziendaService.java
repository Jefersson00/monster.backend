package com.monster.backend.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.persistence.entity.Azienda;
import com.monster.repository.AziendaRepository;

@Service 
public class AziendaService {
	
	
	public static final Logger logger = LoggerFactory.getLogger(AziendaService.class);

	
	@Autowired
	private AziendaRepository aziendaRepository;
	
	
	public Azienda insert (Azienda azienda) {
		logger.info("insert() - START - with given azienda {}", azienda);
		return aziendaRepository.save(azienda);
	}
	
	
	public List<Azienda> getAll () {
		logger.info("AziendaService.getAll - START");
		return aziendaRepository.findAll();
		
	}
	
	
	
	
}
