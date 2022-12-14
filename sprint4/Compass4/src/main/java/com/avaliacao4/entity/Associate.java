package com.avaliacao4.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.avaliacao4.entity.enums.Office;
import com.avaliacao4.entity.enums.Sexo;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Associate implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@Enumerated(EnumType.STRING)
	private Office office;
	private LocalDate birthDate;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "politicalParty_id" )
	private PoliticalParty politicalParty;

}
