package com.monster.backend.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monster.backend.service.AziendaService;
import com.monster.persistence.entity.Azienda;

/**
 * @author jefersson jeferssonserrano00@gmial.com
 */

@RestController
@RequestMapping("/azienda")
public class AziendaController {

	public static final Logger logger = LoggerFactory.getLogger(AziendaController.class);
	
	@Autowired
	private AziendaService aziendaService;
	
	
	
	@GetMapping("/")
	public ResponseEntity<List<Azienda>> getAziendas() {
		List<Azienda> aziendaList = aziendaService.getAll();
		
		if (aziendaList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(aziendaList, HttpStatus.OK);
	}
	
	
	
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Azienda> createAzienda(@RequestBody final Azienda azienda) {
		logger.info("Creating azienda : {}", azienda);
		
		
//		if(false) {
////			controllo dei parametri unici per evitare. 
////			controllare se esiste gia un elemento con lo stesso campo
//			
//			return new ResponseEntity<>(HttpStatus.CONFLICT);
//		}
		
		Azienda insertedAzienda= aziendaService.insert(azienda);
		return new ResponseEntity<>(insertedAzienda, HttpStatus.CREATED);
	}
	
	
	
	
	
}
