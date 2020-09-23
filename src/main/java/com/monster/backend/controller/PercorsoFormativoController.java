package com.monster.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monster.backend.dto.EsperienzaDTO;
import com.monster.backend.dto.PercorsoFormativoDTO;
import com.monster.backend.service.EsperienzaService;
import com.monster.backend.service.PercorsoFormativoService;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@RestController
@RequestMapping("/percorsoFormativo")
@CrossOrigin(origins = "http://localhost:4200")
public class PercorsoFormativoController extends AbstractController<PercorsoFormativoDTO>{
	
	
	@Autowired
	private PercorsoFormativoService percorsoFormativoService;
	
}
