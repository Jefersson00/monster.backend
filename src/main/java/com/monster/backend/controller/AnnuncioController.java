package com.monster.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monster.backend.dto.AnnuncioDTO;
import com.monster.backend.dto.AziendaDTO;
import com.monster.backend.service.AnnuncioService;
import com.monster.backend.service.AziendaService;

@RestController
@RequestMapping("/annuncio")
@CrossOrigin(origins = "http://localhost:4200")
public class AnnuncioController extends AbstractController<AnnuncioDTO>{
	
	
	@Autowired
	private AnnuncioService annuncioService;
	
	
	
	@GetMapping("/{id}")
	public AnnuncioDTO read(long id) {
		return annuncioService.getById(id);
	}
	
}
