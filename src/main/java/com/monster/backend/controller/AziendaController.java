package com.monster.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monster.backend.dto.AziendaDTO;
import com.monster.backend.service.AziendaService;

@RestController
@RequestMapping("/azienda")
@CrossOrigin(origins = "http://localhost:4200")
public class AziendaController extends AbstractController<AziendaDTO>{
	
	
	@Autowired
	private AziendaService aziendaService;
	
}
