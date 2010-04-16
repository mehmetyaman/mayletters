package com.mayletters.mvc.controller;

import com.mayletters.util.Costanti;
import com.mayletters.domain.Persona;
import com.mayletters.service.dao.PersonaDAO;

import java.text.DateFormat;
import java.util.Date;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class MyFormController extends SimpleFormController implements Costanti {

	private PersonaDAO personaDAO;

	public void setPersonaDAO(PersonaDAO personaDAO) {
		this.personaDAO = personaDAO;
	}
	
	@Override
	protected Object formBackingObject(HttpServletRequest req) throws Exception {
		String id = req.getParameter(PARAM_ID);
		Persona persona = null;
		if (id != null) {
			Long idLong = null;
			try {
				idLong = Long.valueOf(id);
			} catch (NumberFormatException e) {
				throw new UnsupportedOperationException(e);
			}

			persona = (Persona) personaDAO.findById(idLong);
			if (persona == null)
				throw new EntityNotFoundException();
		} else
			persona = new Persona();
		return persona;

	}

	@Override
	protected ModelAndView onSubmit(Object arg0) throws Exception {
		Persona p = (Persona) arg0;
		personaDAO.persist(p);
		return super.onSubmit(arg0);
	}

	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, request
				.getLocale());
		binder.registerCustomEditor(Date.class, new CustomDateEditor(df, true));

	}
}
