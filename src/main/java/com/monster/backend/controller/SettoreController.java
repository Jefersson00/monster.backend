package com.monster.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monster.backend.dto.EsperienzaDTO;
import com.monster.backend.dto.SedeDTO;
import com.monster.backend.dto.SettoreDTO;
import com.monster.backend.service.EsperienzaService;
import com.monster.backend.service.SedeService;
import com.monster.backend.service.SettoreService;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@RestController
@RequestMapping("/settore")
@CrossOrigin(origins = "http://localhost:4200")
public class SettoreController extends AbstractController<SettoreDTO>{
	
	
	@Autowired
	private SettoreService settoreService;
	
}
