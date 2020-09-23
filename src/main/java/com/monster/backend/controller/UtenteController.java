package com.monster.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monster.backend.dto.EsperienzaDTO;
import com.monster.backend.dto.SedeDTO;
import com.monster.backend.dto.SettoreDTO;
import com.monster.backend.dto.UtenteCompetenzaDTO;
import com.monster.backend.dto.UtenteDTO;
import com.monster.backend.service.EsperienzaService;
import com.monster.backend.service.SedeService;
import com.monster.backend.service.SettoreService;
import com.monster.backend.service.UtenteCompetenzaService;
import com.monster.backend.service.UtenteService;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@RestController
@RequestMapping("/utente")
@CrossOrigin(origins = "http://localhost:4200")
public class UtenteController extends AbstractController<UtenteDTO>{
	
	
	@Autowired
	private UtenteService utenteService;
	
}
