<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
    <head>
        <title>First Login Example Project</title>
        <script type="text/javascript">
        function submitSave()
        {
        	
        	document.ve.action="visitorEntry.do?method=saveVistorEntry";
        	document.ve.submit();
        }
        
        
        
        
     
        
        function getDistList()
        {  
        var stCode=document.getElementById("stCode").value;
        
         document.ve.action="visitorEntry.do?method=getDistList&stcode="+stCode+"";
         document.ve.submit();
        }
        </script>
        
        
      
        
        
        
        
    </head>
   <body bgcolor="cyan" >
   <h1 align ="center">
   <font size="40px" color="black">Vehicle Monitoring System</font></h1><br>
	<h2 align ="center"><font size="20px" color="red">Visitor Entry</font></h2>
	
        <html:form action="visitorEntry" >
       
       
    <table border="1" align="center">
        		
        	 <tr><td colspan="3">
        	 
        	 <logic:present name="s">
        	 <bean:write name="s"/>
        	 </logic:present>
        	 </td></tr>
        	
        	    
        	<tr>
        			<td class="link4">State Name : </td>
        			<td>
        			
        			<html:select property="stCode" styleId="stCode" onchange="getDistList();">
        			<html:option value="0">select state</html:option>
        			
        			<logic:present name="lst">
        			
   <html:options collection="lst" property="stCode" labelProperty="stName" />
        			
        </logic:present>
        			
        			
        			
     </html:select>
        			
        			<td class="link4">District Name : </td>
        			
        			  <td>
        			<html:select property="distCode" styleId="distCode">
        			<html:option value="0">--select District--</html:option>
        			
        			<logic:present name="dlst">
        			
        			<html:options collection="dlst" property="distCode" labelProperty="distName" />
     
        			</logic:present>
        			
        			</html:select>
        			
        		</tr>
        	
        		<tr>
        			<td class="link4">User Name : </td>
        			<td ><html:text name="ve" property="visitorName" /><br></td>
        		<td class="link4">Email  : </td>
        			<td><html:text name="ve" property="visitorEmail" /><br></td>
        		</tr>
        		
        		<tr>
        			<td class="link4"> Addres : </td>
        			<td ><html:text name="ve" property="visitorAdd" /><br></td>
        		<td class="link4">Phone  : </td>
        			<td><html:text name="ve" property="visitorPhone" /><br></td>
        		</tr>
        		
        		<tr>
					
				<td><html:submit property="method" value="" onclick="submitSave();" /></td>
				
        		</tr>
        		
        	</table>
        </html:form>
    </body>
</html>
