<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
    <head>
        <title>First Login Example Project</title>
        <script type="text/javascript">
        function submitSearch()
        {
        	
        	document.ve.action="searchAction.do?method=searchVisitorDetails";
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
	<h2 align ="center"><font size="20px" color="red">Search Visitor Entry</font></h2>
	
        <html:form action="visitorEntry" >
       
       
    <table border="1" align="center">
        		
        	 
        	
        		
        		<logic:present name="lst" >
        		<tr><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td></tr>
        		
        		<logic:iterate id="lst" name="lst">
        		<tr>
        		<td><bean:write name="lst" property="vid"/></td>
        		<td><bean:write name="lst" property="stCode"/></td>
        		<td><bean:write name="lst" property="distCode"/></td>
        		<td><bean:write name="lst" property="visitorName"/></td>
        		<td><bean:write name="lst" property="visitorEmail"/></td>
        		<td><bean:write name="lst" property="visitorAdd"/></td>
        		<td><bean:write name="lst" property="visitorPhone"/></td>
        		</logic:iterate>
        		</logic:present>
        		
        	</table>
        </html:form>
    </body>
</html>
