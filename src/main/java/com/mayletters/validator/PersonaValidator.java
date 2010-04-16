package com.mayletters.validator;

import com.mayletters.domain.Persona;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonaValidator implements Validator {
	public boolean supports(Class candidate) {
		return Persona.class.isAssignableFrom(candidate);
	}

	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nome",
				"errore.campoRichiesto", new String[] { "Nome" }, "required");
		ValidationUtils
				.rejectIfEmptyOrWhitespace(errors, "cognome",
						"errore.campoRichiesto", new String[] { "Cognome" },
						"required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dataNascita",
				"errore.campoRichiesto", new String[] { "Data" }, "required");
		ValidationUtils
				.rejectIfEmptyOrWhitespace(errors, "impiego",
						"errore.campoRichiesto", new String[] { "Impiego" },
						"required");
	}
}
