
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<table width="100%" border="0" cellspacing="0" cellpadding="0">

	<tr height="20%">
		<td colspan="2">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
				     
						<tiles:insert attribute="harendra" />
					</td>
				</tr>
			</table>
		</td>
	</tr>

	<tr height="70%">
		<td width="20%" valign="top">
			<table width="100%" height="100%" border="0" cellspacing="0"
				cellpadding="0">
				<tr valign="top">
					<td class="lefttdline">
						<tiles:insert attribute="lalit" />
					</td>
				</tr>
			</table>
		<td width="80%" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<tiles:insert attribute="bhola" />
					</td>
				</tr>
			</table>
		</td>
	</tr>


	<tr height="10%">
		<td class="link1" colspan="2" align="center">
			<table>
				<tr>  
					<td>
					<tiles:insert attribute="foopa"/>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	
</table>
