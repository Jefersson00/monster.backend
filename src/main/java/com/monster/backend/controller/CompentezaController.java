package com.monster.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monster.backend.dto.AziendaDTO;
import com.monster.backend.dto.CandidaturaDTO;
import com.monster.backend.dto.CompetenzaDTO;
import com.monster.backend.service.AziendaService;
import com.monster.backend.service.CandidaturaService;
import com.monster.backend.service.CompetenzaService;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@RestController
@RequestMapping("/competenza")
@CrossOrigin(origins = "http://localhost:4200")
public class CompentezaController extends AbstractController<CompetenzaDTO>{
	
	
	@Autowired
	private CompetenzaService competenzaService;
	
}
