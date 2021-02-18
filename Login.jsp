<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
 pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title> Login</title>	
	<style>
		
		body{
			background-image: url("bus1.jpeg");
			background-repeat: no-repeat;
			background-size: cover;
		}
		
		.loginbox{
			width: 350px;
			height:420px;
			padding: 30px ;
			background: rgba(0,0,0,0.35);
			color: #000;
			top: 15%;
			right: 15%;
			position: absolute;
		}
		
		h1.text1{
			top: 5%;
			left: 32%;
			position: relative;
			font-family: Arial,sans-serif;

		}
		
		.loginbox p{
			margin: 0;
			padding:0;
			font-weight: bold;
		}
		
		.loginbox input{
			width: 100%;
			margin-bottom: 20px;
		}
		
		.loginbox input[type="text"],input[type="password"]
		{
			border: none;
			border-bottom: 1px solid #fff;
			background: transparent;
			outline: none;
			height: 40px;
			color: #000;
			font-size: 16px;
		}
		
		.loginbox input[type=submit]
		{
			border: none;
			outline: none;
			height: 30px;
			background: #fff;
			color:#000;
			font-size:18px;
			border-radius:20px;
		}
		
		.loginbox input[type="submit"]:hover{
			cursor: pointer;
			background: #000;
			color:#fff;
		}
		
		.loginbox a{
			text-decoration: none;
			font-size: 20px;
			line-height: 20px;
			color: white;
		}
		
		.loginbox a:hover{
			color: black;
		}
		
		.avatar{
			width:75px;
			height: 75px;
			position: absolute;
			top:-50px;
			left: calc(50% - 50px);
		}
		
		.formtext{
			font-size: 25px;
		}

		.button{
			background-color: black;
			color: white;
			height: 50px;
			width: 100px;
			font-size: 14px;
			text-align: center;
			border-radius: 20px;
			padding: 15px 25px;
			cursor: pointer;
			box-shadow: 3px 3px 5px white;
			border: none;
		}

		.button:hover{
			background-color:ivory;
			color: black;
			box-shadow: 3px 3px 5px black;
		}

		.button:active{
			background-color: #999;
			box-shadow: 1px 1px white;
			transform: translateY(4px);
		}

	</style>
	</head>


	<body>
		<div class="loginbox">
			<h1 class="text1"> LOGIN </h1>
			<img src="lavatar2.png" class="avatar" >
			<div class="formtext">
				<form:form method="post" action="AllowLoginToUser" modelAttribute="login" >
					<p> Username </p>
					<form:input path="username" type="text" placeholder="Enter username"/>
					<br><p> Password</p>
					<form:input path="password" type="password" name="" placeholder="Enter password"/>
					<input type="submit" value="save" name="" placeholder="Login">
					<a href="#"> Forgot password? </a>
					<br><br><a href="#"> Don't have an account?</a>
				</form:form>
				<form:form method="post" action="signup">
					<input type="submit" value="signup"/>
				</form:form>
			</div>
		</div>
	</body>
	
</html>