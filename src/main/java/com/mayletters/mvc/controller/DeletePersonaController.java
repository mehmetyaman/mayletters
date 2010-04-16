package com.mayletters.mvc.controller;

import com.mayletters.util.Costanti;
import com.mayletters.domain.Persona;
import com.mayletters.service.dao.PersonaDAO;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class DeletePersonaController extends ParameterizableViewController implements Costanti {

	private PersonaDAO personaDAO;

	public void setPersonaDAO(PersonaDAO personaDAO) {
		this.personaDAO = personaDAO;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse arg1) throws Exception {

    String id = req.getParameter(PARAM_ID);
		if (id != null) {
			Long idLong = null;
			try {
				idLong = Long.valueOf(id);
				personaDAO.delete(idLong);
			} catch (NumberFormatException e) {
				throw new UnsupportedOperationException(e);
			}
		} else  {
      throw new UnsupportedOperationException("required entity id");
    }        
    
		ModelAndView mv = new ModelAndView(getViewName());

		return mv;
	}

}
