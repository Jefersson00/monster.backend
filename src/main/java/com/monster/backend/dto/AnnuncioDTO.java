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
public class AnnuncioDTO {
	
	private Long id;
	
	private String descrizione;
	
	private String contratto;
	
	private Date dataPubblicazione;
	
	private Long sede;
	
	private Long settore;
}
