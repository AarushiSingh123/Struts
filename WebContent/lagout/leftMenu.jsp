
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>


<table width="100%" border="1" cellspacing="1" cellpadding="2" >
 
  <tr>
    <td class="lefttdlink" ><a href="#" class="link3">Visitor Management</a>
     <ul id="list2">
     <li><a href="visitorEntry.do?method=visitorEntry">NEW VISITOR </a></li>
     
     <li><a href="searchAction.do?method=searchVisitor">Search</a></li>
     <li><a href="viewAction.do?method=viewVisitor">View</a></li>
     <li><a href="#">Update</a></li>
     
     </ul></td>
  </tr>
 
 <tr>
	<td class="lefttdlink" ><a href="#" class="link3">Taxi Management</a>
	<ul id="list2">
     <li><a href="#">New Entry</a></li>
     <li><a href="/searchtaxi.do">Search </a></li>
     <li><a href="newTaxi.do?method=viewTaxiDetail">View </a></li>
     <li><a href="/searchtaxi.do">Update</a></li>
     <li><a href="/searchtaxi.do">Delete</a></li>
     <li><a href="#">Assign Driver</a></li>
     
   </ul></td>
  </tr>
  
  <tr>
  		<td class="lefttdlink" ><a href="#" class="link3">Driver Management</a>
  		
  		<ul id="list2">
     <li><a href="newDriver.do?method=driverRegistration">New Entry</a></li>
     <li><a href="/searchDriver.do">Search</a></li>
     <li><a href="newDriver.do?method=viewDriverDetail">View</a></li>
     <li><a href="/searchDriver.do">Update</a></li>
     <li><a href="#">Assign Taxi</a></li>
     
   </ul></td>
  </tr>
  
  <tr>
  		<td class="lefttdlink" ><a href="#" class="link3">Order Management</a>
  		
  		<ul id="list2">
     <li><a href="/newOrder.do">New Order</a></li>
     <li><a href="#">Search</a></li>
     <li><a href="#">View</a></li>
     <li><a href="#">Update</a></li>
     
     
     
     
        
   </ul></td>
  </tr>
  
  </table>