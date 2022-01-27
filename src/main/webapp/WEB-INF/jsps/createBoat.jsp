<%@ page language="java" contentType="text/html; ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Boat</title>

</head>
<body>
<h3>${msg}</h3>

<form action="saveBoat" method="post">
<pre>



Boat Type:
			Sport           	<input type="radio" name="bType" value="1.0f"/>
			Yacht           	<input type="radio" name="bType" value="2.0f"/>
			Trawler        		<input type="radio" name="bType" value="3.0f"/>
			Cabin Boat     		<input type="radio" name="bType" value="4.0f"/>
			Flybridge      		<input type="radio" name="bType" value="5.0f"/>
			Fishing	       		<input type="radio" name="bType" value="6.0f"/>
			Other          		<input type="radio" name="bType" value="0.0f"/>

Year Built:
			2021        		<input type="radio" name="yearBuilt" value="2021.0"/>
			2020 to 2015 		<input type="radio" name="yearBuilt" value="2017.5f"/>
			2015 to 2010 		<input type="radio" name="yearBuilt" value="2012.5f"/>
			2010 to 2005 		<input type="radio" name="yearBuilt" value="2007.5f"/>
			Older then 2005 	<input type="radio" name="yearBuilt" value="2000.0f"/>

Boat Length:
			1m to 4m       		<input type="radio" name="length" value="2.5f"/>
			4m to 8m       		<input type="radio" name="length" value="6.0f"/>
			8m to 12m      		<input type="radio" name="length" value="10.0f"/>
			12m to 16m     		<input type="radio" name="length" value="14.0f"/>
			16m to 20m     		<input type="radio" name="length" value="18.0f"/>
			20m to 30m     		<input type="radio" name="length" value="25.0f"/>
			30m to 40m     		<input type="radio" name="length" value="35.0f"/>
			longer then 40m	 	<input type="radio" name="length" value="50.0f"/>

Boat Width:
			1m to 2m      		<input type="radio" name="width" value="1.5f"/>
			2m to 4m      		<input type="radio" name="width" value="3.0f"/>
			4m to 8m      		<input type="radio" name="width" value="6.0f"/>
			8m to 12m     		<input type="radio" name="width" value="10.0f"/>
			12m to 16m    		<input type="radio" name="width" value="14.0f"/>
			18m to 20m    		<input type="radio" name="width" value="19.0f"/>
			wider then 20m 		<input type="radio" name="width" value="20.0f"/>

Fuel Type: 
			No fuel        		<input type="radio" name="fType" value="0.0f"/>
			Gas                	<input type="radio" name="fType" value="1.0f"/>
			Diesel          	<input type="radio" name="fType" value="4.0f"/>
			Unleaded      		<input type="radio" name="fType" value="3.0f"/>
			Hybrid          	<input type="radio" name="fType" value="2.0f"/>
			Electric       		<input type="radio" name="fType" value="5.0f"/>

		
                                <input type="submit" value="Save"/>				
<!-- Predicted Price: <input type="radio" name=""/> -->

</pre>	
</form>
	
<h3><a href="displayBoats">View All</a>	</h3>			


</body>
</html>