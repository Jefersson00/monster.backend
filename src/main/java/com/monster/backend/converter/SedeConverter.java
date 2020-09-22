package com.monster.backend.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.monster.backend.controller.AziendaController;
import com.monster.backend.dto.SedeDTO;
import com.monster.backend.service.AziendaService;
import com.monster.persistence.entity.Sede;
import com.monster.repository.AziendaRepository;


@Component
public class SedeConverter extends AbstractConverter<Sede,SedeDTO> {
	
	
	@Autowired
	AziendaRepository aziendaRepository;
	
	@Override
	public Sede toEntity(SedeDTO sedeDTO) {
		Sede sede= null;
		if (sedeDTO != null) {
			sede= new Sede(sedeDTO.getId(),sedeDTO.getCitta(),sedeDTO.getRegione(),null,aziendaRepository.findById(sedeDTO.getAzienda()).get());			
		}
		return sede;
	}
	
	@Override
	public SedeDTO toDTO(Sede sede) {
		SedeDTO sedeDTO = null;
		if (sede != null) {
			sedeDTO= new SedeDTO(sede.getId(),sede.getCitta(),sede.getRegione(),sede.getAzienda().getId());			
		}
		return sedeDTO;
	}
	
}
