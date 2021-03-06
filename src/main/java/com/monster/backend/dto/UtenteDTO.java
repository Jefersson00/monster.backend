package com.monster.backend.dto;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.monster.persistence.entity.Annuncio;
import com.monster.persistence.entity.Azienda;
import com.monster.persistence.entity.Sede;
import com.monster.persistence.entity.Settore;
import com.monster.persistence.entity.Utente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class UtenteDTO {
	
	private Long id;
	
	private String cognome;
	
	private String cv;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dataNascita;
	
	private String email;
	
	private String nome;

	private String password;
	
	private String telefono;
	
}
