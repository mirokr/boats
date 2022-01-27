<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="ISO-8859-1">

<title>Create Boat</title>
</head>
<body>

<form action="updateB" method="post">
<pre>
Id: <input type="text" name="id" value="${boat.id}" readonly/>
Boat Type: 
			Sport           <input type="radio" name="bType" value="1.0f" ${boat.bType=='1.0f'?'checked':''}/>
			Yacht           <input type="radio" name="bType" value="2.0f" ${boat.bType=='2.0f'?'checked':''}/>
			Trawler         <input type="radio" name="bType" value="3.0f" ${boat.bType=='3.0f'?'checked':''}/>
			Cabin Boat      <input type="radio" name="bType" value="4.0f" ${boat.bType=='4.0f'?'checked':''}/>
			Flybridge       <input type="radio" name="bType" value="5.0f" ${boat.bType=='5.0f'?'checked':''}/>
			Fishing         <input type="radio" name="bType" value="6.0f" ${boat.bType=='6.0f'?'checked':''}/>
			Other           <input type="radio" name="bType" value="0.0f"${boat.bType=='0.0f'?'checked':''}/>
Year Built: 
			2021            <input type="radio" name="yearBuilt" value="2021.0f" ${boat.yearBuilt=='2021.0f'?'checked':''}/>
			2020 to 2015    <input type="radio" name="yearBuilt" value="2017.5f" ${boat.yearBuilt=='2017.5f'?'checked':''}/>
			2015 to 2010    <input type="radio" name="yearBuilt" value="2012.5f" ${boat.yearBuilt=='2012.5f'?'checked':''}/>
			2010 to 2005    <input type="radio" name="yearBuilt" value="2007.5f" ${boat.yearBuilt=='2007.5f'?'checked':''}/>
			Older then 2005 <input type="radio" name="yearBuilt" value="2000.0f" ${boat.yearBuilt=='2000.0f'?'checked':''}/>
Boat Length: 
			1m to 4m       	<input type="radio" name="length" value="2.5f" ${boat.length=='2.5f'?'checked':''}/>
			4m to 8m        <input type="radio" name="length" value="6.0f" ${boat.length=='6.0f'?'checked':''}/>
			8m to 12m       <input type="radio" name="length" value="10.0f" ${boat.length=='10.0f'?'checked':''}/>
			12m to 16m      <input type="radio" name="length" value="14.0f" ${boat.length=='14.0f'?'checked':''}/>
			16m to 20m      <input type="radio" name="length" value="18.0f" ${boat.length=='18.0f'?'checked':''}/>
			20m to 30m      <input type="radio" name="length" value="25.0f" ${boat.length=='25.0f'?'checked':''}/>
			30m to 40m      <input type="radio" name="length" value="35.0f" ${boat.length=='35.0f'?'checked':''}/>
			longer then 40m <input type="radio" name="length" value="50.0f" ${boat.length=='50.0f'?'checked':''}/>
Boat Width: 
			1m to 2m        <input type="radio" name="width" value="1.5f" ${boat.width=='1.5f'?'checked':''}/>
			2m to 4m        <input type="radio" name="width" value="3.0f" ${boat.width=='3.0f'?'checked':''}/>
			4m to 8m        <input type="radio" name="width" value="6.0f" ${boat.width=='6.0f'?'checked':''}/>
			8m to 12m       <input type="radio" name="width" value="10.0f" ${boat.width=='10.0f'?'checked':''}/>
			12m to 16m      <input type="radio" name="width" value="14.0f" ${boat.width=='14.0f'?'checked':''}/>
			18m to 20m      <input type="radio" name="width" value="19.0f" ${boat.width=='19.0f'?'checked':''}/>
			wider then 20m  <input type="radio" name="width" value="20.0f" ${boat.width=='20.0f'?'checked':''}/>
Fuel Type: 
			No fuel         <input type="radio" name="fType" value="0.0f" ${boat.fType=='0.0f'?'checked':''}/>
			Gas             <input type="radio" name="fType" value="1.0f" ${boat.fType=='1.0f'?'checked':''}/>
			Diesel          <input type="radio" name="fType" value="4.0f" ${boat.fType=='4.0f'?'checked':''}/>
			Unleaded        <input type="radio" name="fType" value="3.0f" ${boat.fType=='3.0f'?'checked':''}/>
			Hybrid          <input type="radio" name="fType" value="2.0f" ${boat.fType=='2.0f'?'checked':''}/>
			Electric        <input type="radio" name="fType" value="5.0f" ${boat.fType=='5.0f'?'checked':''}/>
				
                            <input type="submit" value="Save"/>				
<!-- Predicted Price: <input type="radio" name=""/> -->
</pre>
</form>

</body>
</html>