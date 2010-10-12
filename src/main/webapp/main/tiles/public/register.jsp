<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.validate.js"></script>

<script type="text/javascript">
	$()
			.ready(
					function() {

						// validate signup form on keyup and submit
						$("#signupForm")
								.validate(
										{
											rules : {
												name : "required",
												lastName : "required",
												userName : {
													required : true,
													minlength : 2
												},
												address1 : {
													required : true,
													minlength : 2
												},
												address2 : {
													required : true,
													minlength : 2
												},
												password : {
													required : true,
													minlength : 5
												},
												confirm_password : {
													required : true,
													minlength : 5,
													equalTo : "#password"
												},
												email : {
													required : true,
													email : true
												},
												agree : "required"
											},
											messages : {
												name : "Please enter your firstname",
												lastName : "Please enter your lastname",
												userName : {
													required : "Please enter a username",
													minlength : "Your username must consist of at least 2 characters"
												},
												password : {
													required : "Please provide a password",
													minlength : "Your password must be at least 5 characters long"
												},
												confirm_password : {
													required : "Please provide a password",
													minlength : "Your password must be at least 5 characters long",
													equalTo : "Please enter the same password as above"
												},
												email : {
													required : "Please provide an email"
												},
												agree : "Please accept our policy"
											}
										});

						// propose username by combining first- and lastname
						$("#userName").focus(function() {
							var firstname = $("#firstname").val();
							var lastname = $("#lastName").val();
							if (firstname && lastname && !this.value) {
								this.value = firstname + "." + lastname;
							}
						});

					});
</script>


<title><fmt:message key="title.registration" /></title>

</head>
<body>
<center>
<form action="<%=request.getContextPath()%>/register/register.do"
	id="signupForm" method="post">
<fieldset><legend>Please fill registration form</legend>

<p><label for="name">* Name</label> <input id="name" name="name"
	value="john" /></p>
<p><label for="lastName">* Lastname</label> <input id="lastName"
	name="lastName" value="doe" /></p>

<p><label for="userName">Username</label> <input id="userName"
	name="userName" value="john doe" /></p>
<p><label for="address1">* Address 1</label> <input
	id="address.addressLine1" name="address.addressLine1" value="addr1" /></p>
<p><label for="address2">* Address 2</label> <input
	id="address.addressLine2" name="address.addressLine2" value="addr2" /></p>
<hr>

<p><label for="city">* City</label> <input id="address.city"
	name="address.city" value="city" /></p>

<p><label for="state">State</label> <input id="address.state"
	name="address.state" value="state" /></p>

<p><label for="country">Country</label> <input id="address.country"
	name="address.country" value="country" /></p>

<p><label for="zipCode">Zip Code</label> <input id="address.zipCode"
	name="address.zipCode" value="34640" /></p>

<hr>
<p><label for="email">* Email</label> <input id="email" name="email"
	value="johndoe@doe.com" /></p>

<p><label for="password">* Password</label> <input id="password"
	name="password" type="password" value="090909" /></p>

<p><label for="confirm_password">* Confirm password</label> <input
	id="confirm_password" name="confirm_password" type="password"
	value="090909" /></p>

<p><label for="phoneNumber">Mobile</label> <input id="phoneNumber"
	name="phoneNumber" value="phoneNumber" /></p>

<p><label for="faxNumber">Fax Number</label> <input id="faxNumber"
	name="faxNumber" value="faxNumber" /></p>

<hr>


<p><label for="agree">Please agree to our policy</label> <input
	type="checkbox" class="checkbox" id="agree" name="agree"
	checked="checked" /></p>


<p><input class="submit" type="submit" value="Submit" /></p>
</fieldset>
</form>
</center>
</body>
</html>