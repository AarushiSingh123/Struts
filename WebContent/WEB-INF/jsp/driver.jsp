<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
    <head>
        <title>First Login Example Project</title>
        <script type="text/javascript">
        function submitSave()
        {
        	alert("hhii");
        	document.driverbean.action="newDriver.do?method=saveDriverEntry";
        	document.driverbean.submit();
        	 
        }
        	</script>
    </head>
   <body bgcolor="cyan" >
   <h1 align ="center">
   <font size="40px" color="black">Vehicle Monitoring System</font></h1><br>
	<h2 align ="center"><font size="20px" color="red">Driver Entry</font></h2>
	
        <html:form>
       
       
    <table border="1" align="center">
        		
        	 
        	    
        	<tr>
        	<td class="link4">Diver Name : </td>
        	<td><html:text property="name" name="driverbean"></html:text></td>
        			
        			<td class="link4">Driver Lisence Number : </td>
        			<td><html:text property="lno" name="driverbean"></html:text></td>
        		</tr>
        	
        		<tr>
        	<td class="link4">Diver DOB : </td>
        	<td><html:text property="dob" name="driverbean"></html:text></td>
        			
        			<td class="link4">Driver Add: </td>
        			<td><html:text property="add" name="driverbean"></html:text></td>
        		</tr>
        		
        		
        		<tr>
        	<td class="link4">Phone : </td>
        	<td><html:text property="phone" name="driverbean"></html:text></td>
        			
        			<td class="link4">Driving Exp: </td>
        			<td>
        			<html:select property="driverExp" name="driverbean">
        			<html:option value="0">select</html:option>
        			<html:option value="1"> 1 Year</html:option>
        			<html:option value="2"> 2 Year</html:option>
        			<html:option value="3"> 3 Year</html:option>
        			<html:option value="4"> 4 Year</html:option>
        			</html:select>
        		       </td>
        		</tr>
        		
        		
        		
        		<tr>
					
				<td><html:submit property="method" value="" onclick="submitSave();" /></td>
				
        		</tr>
        		
        	</table>
        </html:form>
    </body>
</html>
