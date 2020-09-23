package com.monster.backend.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.monster.backend.dto.AnnuncioDTO;
import com.monster.persistence.entity.Annuncio;
import com.monster.repository.AziendaRepository;
import com.monster.repository.SedeRepository;
import com.monster.repository.SettoreRepository;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Component
public class AnnuncioConverter extends AbstractConverter<Annuncio,AnnuncioDTO> {

	@Autowired
	SedeRepository sedeRepository;
	
	@Autowired
	SettoreRepository settoreRepository;
	
	@Override
	public Annuncio toEntity(AnnuncioDTO annuncioDTO) {
		Annuncio annuncio = null;
		if (annuncioDTO != null) {
			annuncio = new Annuncio(
					annuncioDTO.getId()==null?-1:annuncioDTO.getId(),
					annuncioDTO.getContratto(),
					annuncioDTO.getDataPubblicazione(),
					annuncioDTO.getDescrizione(),
					sedeRepository.findById(annuncioDTO.getSede()).get(),
					settoreRepository.findById(annuncioDTO.getSettore()).get(),
					null
					);	
			
		}
		return annuncio;
	}
	
	@Override
	public AnnuncioDTO toDTO(Annuncio annuncio) {
		AnnuncioDTO annuncioDTO = null;
		if (annuncio != null) {
			
			annuncioDTO = new AnnuncioDTO(annuncio.getId(),
					annuncio.getDescrizione(),
					annuncio.getContratto(),
					annuncio.getDataPubblicazione(),
					annuncio.getSede().getId(),
					annuncio.getSettore().getId()
					);			
			
		}
		return annuncioDTO;
	}
	
}
