<head>

<style>
#errormessage
{
	color:red;
	font-size: 20px;
	
}
body
		{
			background-color: SlateBlue;
			//background-image: url('images/1.jpg');
			//background-repeat:no-repeat;
			margin-left:400px;
			margin-top:100px;
		}
		
input
{
	border:2px solid black;
	border-radius:10px;
	padding:20px;
}
#b1
{
			padding:15px 30px;
			background-color: solid black;
			color:orange;
			
			
}

a:link
{
	border:2px solid black;
	border-radius:10px;
   background-color: yellow;
  color: blue;
  padding: 14px 25px;
  
  text-decoration: none;
  
 
}

a:hover {
  background-color: red;
}

div
{
	border:5px solid black;
	padding:50px;
	width:50%;
}
</style>


</head>



<body>
<span id="message">${message}</span>
<form>
 <div>
	<input size=45 type="text" name="username" placeholder="Enter username"  required><br><br>
	
	<input size=45 type="password" name="password"  placeholder="Enter password"><br><br>
	
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	
	<input type="submit" value="login" formaction="login" id="b1">
	
	<a href="RegisterNow"> Sign up </a>
 </div> 
</form>



<span id="errormessage">${errorMessage}</span>
<span id="errormessage">${message}</span>

<br><br>



</body>
