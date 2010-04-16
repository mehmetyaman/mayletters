package com.mayletters.service.dao;

import com.mayletters.domain.Persona;

import java.util.Date;
import java.util.List;


public class PersonaDAO extends BaseDAO implements IPersonaDAO {

	private static final long serialVersionUID = -8987811161665939133L;

	public PersonaDAO() {
		targetEntity = Persona.class;
	}

	@Override
	public Class<?> getTargetEntityClass() {
		return targetEntity;
	}
	
	@SuppressWarnings("unchecked")
	public List<Persona> listByDataNascita(Date date) {
		return (List<Persona>) appManager.createQuery(
				"SELECT p FROM Persona p WHERE p.dataNascita = :ident")
				.setParameter("ident", date).getResultList();

	}


  @SuppressWarnings("unchecked")
	public List<Persona> listByName(String nome) {

			return (List<Persona>) appManager.createQuery(
					"SELECT p FROM Persona p WHERE p.nome = :ident")
					.setParameter("ident", nome).getResultList();

	}

}
