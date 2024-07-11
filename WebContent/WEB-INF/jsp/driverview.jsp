<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
    <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
    <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
function getDriverDetail()
{
	var lno=document.getElementById("lno").value;
	document.driverbean.action="newDriver.do?method=viewDriverLisence&lno="+lno+"";
	document.driverbean.submit();
	
	}

</script>

</head>
<body>
<html:form>
  <table border="2" bgcolor="yellow">
  <tr><td>Select Lisence1 No</td>
  
  <td><html:select property="lno" styleId="lno" onchange="getDriverDetail()">
  <html:option value="0">SelectLNO</html:option>
   <html:option value="all">Alll</html:option>
   
   <logic:present name="llst">

     
   <html:options collection="llst" property="lno" labelProperty="lno"></html:options>
   
   </logic:present>
  
  </html:select>
  </td>
  </tr>
  
  </table>

<logic:present name="lst">

<table border="3" bgcolor="cyan">
<tr><td>Name</td><td>DOB</td><td>L NO</td><td>Add</td><td>Phone</td><td>Exp</td></tr>


<logic:iterate id="lst" name="lst">
<tr><td><bean:write name="lst" property="name"/> </td>
<td><bean:write name="lst" property="dob"/> </td>
<td><bean:write name="lst" property="lno"/> </td>
<td><bean:write name="lst" property="add"/> </td>
<td><bean:write name="lst" property="phone"/> </td>
<td><bean:write name="lst" property="driverExp"/> </td>




</tr>

</logic:iterate>




</table>
</logic:present>
</html:form>

</body>
</html>