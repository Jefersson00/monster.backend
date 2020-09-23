package com.monster.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monster.backend.dto.AziendaDTO;
import com.monster.backend.dto.CandidaturaDTO;
import com.monster.backend.service.AziendaService;
import com.monster.backend.service.CandidaturaService;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@RestController
@RequestMapping("/candidatura")
@CrossOrigin(origins = "http://localhost:4200")
public class CandidaturaController extends AbstractController<CandidaturaDTO>{
	
	
	@Autowired
	private CandidaturaService candidaturaService;
	
}
