<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"  src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.validate.js"></script>
	
<script type="text/javascript">

$().ready(function() {
	
	// validate signup form on keyup and submit
	$("#signupForm").validate({
		rules: {
			name: "required",
			lastName: "required",
			userName: {
				required: true,
				minlength: 2
			},
			password: {
				required: true,
				minlength: 5
			},
			confirm_password: {
				required: true,
				minlength: 5,
				equalTo: "#password"
			},
			email: {
				required: true,
				email: true
			},
			agree: "required"
		},
		messages: {
			name: "Please enter your firstname",
			lastName: "Please enter your lastname",
			userName: {
				required: "Please enter a username",
				minlength: "Your username must consist of at least 2 characters"
			},
			password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long"
			},
			confirm_password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long",
				equalTo: "Please enter the same password as above"
			},
			email: "Please enter a valid email address",
			agree: "Please accept our policy"
		}
	});
	
	// propose username by combining first- and lastname
	$("#userName").focus(function() {
		var firstname = $("#firstname").val();
		var lastname = $("#lastName").val();
		if(firstname && lastname && !this.value) {
			this.value = firstname + "." + lastname;
		}
	});
	
});
</script>
	

<title><fmt:message key="title.registration" /></title>

</head>
<body>
<center>
<form action="<%=request.getContextPath()%>/register/register.do" id="signupForm" method="post">
<fieldset>
		<legend>Validating a complete form</legend>

		<p>
			<label for="name">Name</label>
			<input id="name" name="name" />
		</p>
		<p>
			<label for="lastName">Lastname</label>
			<input id="lastName" name="lastName" />
		</p>

		<p>
			<label for="userName">Username</label>
			<input id="userName" name="userName" />
		</p>
		<p>
			<label for="password">Password</label>
			<input id="password" name="password" type="password" />
		</p>

		<p>
			<label for="confirm_password">Confirm password</label>
			<input id="confirm_password" name="confirm_password" type="password" />
		</p>
		<p>
			<label for="email">Email</label>
			<input id="email" name="email" />
		</p>

		<p>
			<label for="agree">Please agree to our policy</label>
			<input type="checkbox" class="checkbox" id="agree" name="agree" />
		</p>


<p><input class="submit" type="submit" value="Submit" /></p>
</fieldset>
</form>
</center>
</body>
</html>