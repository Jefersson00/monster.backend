package com.monster.backend.dto;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.monster.persistence.entity.Sede;
import com.monster.persistence.entity.Settore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class AziendaDTO {
	
	private Long id;
	
	private Date annoFondazione;
	
	private String descrizione;
	
	private String email;
	
	private String link;
	
	private String logo;
	
	private String nome;
	
	private int numeroDipendenti;
	
	private String password;
	
	private String settore;
}
