package com.sami.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contrat")
public class Contrat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "date_debut")
	private LocalDate dateDebut;
	@Column(name = "montant")
	private Double montant;
	@Nullable
	@Column(name = "date_fin_prevue")
	private LocalDate dateFinPrevue;
	@Column(name = "etat")
	private Integer etat;
	@Column(name = "id_centre")
	private Long idCentre;
}
