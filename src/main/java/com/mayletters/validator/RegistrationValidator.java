package com.mayletters.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.mayletters.domain.User;

public class RegistrationValidator implements Validator {

	public boolean supports(Class candidate) {
		return User.class.isAssignableFrom(candidate);
	}

	public void validate(Object obj, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name","error.nameempty", new String[] { "Name" }, "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName","error.lastnamempty", new String[] { "LastName" },"required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName","error.usernameempty", new String[] { "UserName" },"required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email","error.emailempty", new String[] { "Email" },"required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName","error.usernameempty", new String[] { "UserName" },"required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password","error.passwordempty", new String[] { "Password" },"required");

	}
}
