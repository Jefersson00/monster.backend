package com.monster.backend.dto;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.monster.persistence.entity.Annuncio;
import com.monster.persistence.entity.Azienda;
import com.monster.persistence.entity.Competenza;
import com.monster.persistence.entity.Esperienza;
import com.monster.persistence.entity.PercorsoFormativo;
import com.monster.persistence.entity.Sede;
import com.monster.persistence.entity.Settore;
import com.monster.persistence.entity.Utente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter 
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class UtentePercorsoDTO {
	
	private Long id;
	
	private Long percorsoFormativo;
	
	private Long utente;
}
