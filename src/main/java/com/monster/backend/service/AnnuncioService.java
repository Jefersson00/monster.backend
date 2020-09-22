package com.monster.backend.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.monster.backend.dto.AnnuncioDTO;
import com.monster.persistence.entity.Annuncio;
import com.monster.repository.AnnuncioRepository;

@Service
public class AnnuncioService extends AbstractService<Annuncio, AnnuncioDTO> {
	
	public  Iterable<AnnuncioDTO>  findByContratto(String contratto) {
		return converter.toDTOList(((AnnuncioRepository)repository).findByContratto(contratto));
	}
	
	
	public  Iterable<AnnuncioDTO>  findByDataPubblicazioneGreaterThanEqual(Date dataPubblicazione) {
		return converter.toDTOList(((AnnuncioRepository)repository).findByDataPubblicazioneGreaterThanEqual(dataPubblicazione));
	}
	
	
}
