package com.monster.backend.dto;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.monster.persistence.entity.Annuncio;
import com.monster.persistence.entity.Azienda;
import com.monster.persistence.entity.Competenza;
import com.monster.persistence.entity.Sede;
import com.monster.persistence.entity.Settore;
import com.monster.persistence.entity.Utente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class UtenteCompetenzaDTO {
	
	private Long id;
	
	private Competenza competenza;
	
	private Utente utente;
}
