package com.mayletters.service.dao;

import com.mayletters.domain.Persona;

import java.util.Date;
import java.util.List;

public interface IPersonaDAO {

	public abstract List<Persona> listByDataNascita(Date date);

	public abstract List<Persona> listByName(String nome);

}
