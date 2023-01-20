<html>
<head>

<style>

div { 
       border:4px solid black;
       padding:80px;width:25%;
       margin:auto;
       background:skyblue
    }

input 
    {
       border:2px solid black;
       border-radius:8px;
       padding:10px;
       margin-left:20px
    }
#b1 {
       padding:15px 30px;
       background-color:grey;
       color:black
    }

</style>

<script>
       function change(input)
     {
       input.style.color="white";
       input.style.background="black"
     }
       
       function restore(input)
       {
    	   input.style.color="black"
    	   input.style.background="white"
       }
</script>

</head>

<form>
<div>
      <input type="text" name="username" placeholder="Enter username" onfocus="change(this)" required ><br><br>
      <input type="password" name="password" placeholder="Enter password" onfocus="change(this)"><br><br>
      <input type="text" name=mobilenumber placeholder="Enter mobilenumber" onfocus="change(this)"><br><br>
      <input type=email name="emailid" placeholder="Enter email" onfocus="change(this)"><br><br>
      <input type=date name="dateofbirth" placeholder="Enter dateofbirth" onfocus="change(this)"><br><br>
      <input type="submit" value="register" formaction="register" formmethod="post" id="b1">
</div>
</form>
</html>