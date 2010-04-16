package com.mayletters.domain;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Basic;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona extends AbsEntita {

	
	@Basic(optional=false)
	protected String cognome;
	
	@Temporal(TemporalType.DATE)
	protected Date dataNascita;

	protected String impiego;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinTable(name = "TABELLA_JOIN_PERSONE_INDIRIZZI")
	protected Collection<Indirizzo> indirizzi = new HashSet<Indirizzo>();

	public Date getDataNascita() {
		return dataNascita;
	}

	public String getImpiego() {
		return impiego;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public void setImpiego(String impiego) {
		this.impiego = impiego;
	}

	public Collection<Indirizzo> getIndirizzi() {
		return indirizzi;
	}

	protected void setIndirizzi(Collection<Indirizzo> indirizzi) {
		this.indirizzi = indirizzi;
	}

	public void addIndirizzo(Indirizzo indirizzo) {
		indirizzi.add(indirizzo);
		indirizzo.getPersone().add(this);
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

}
