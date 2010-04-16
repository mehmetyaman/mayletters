package com.mayletters.domain;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Indirizzo extends AbsId {

	private String via;

	private String numCivico;

	private String citta;

	private int cap;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy="indirizzi")
	private Collection<Persona> persone = new HashSet<Persona>();

	public int getCap() {
		return cap;
	}

	public String getCitta() {
		return citta;
	}

	public String getNumCivico() {
		return numCivico;
	}

	public String getVia() {
		return via;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public void setNumCivico(String numCivico) {
		this.numCivico = numCivico;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public Collection<Persona> getPersone() {
		return persone;
	}

	protected void setPersone(Collection<Persona> persone) {
		this.persone = persone;
	}

}
