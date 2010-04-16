package com.mayletters.mvc.controller;

import com.mayletters.domain.Persona;
import com.mayletters.service.dao.PersonaDAO;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class ListPersonaController extends ParameterizableViewController {

	private PersonaDAO personaDAO;

	public void setPersonaDAO(PersonaDAO personaDAO) {
		this.personaDAO = personaDAO;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		List<Persona> lista = (List<Persona>)personaDAO.listAll();
		
		logger.debug("numero Persone: " + lista.size());
		
		ModelAndView mv = new ModelAndView(getViewName());
		mv.addObject("persone", lista);

		return mv;
	}

}
