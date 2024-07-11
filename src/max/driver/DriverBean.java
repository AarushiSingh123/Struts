package max.driver;

import org.apache.struts.action.ActionForm;

public class DriverBean extends ActionForm{
private String name;
private String dob;
private String lno;
private String add;
private String phone;
private String driverExp;

public String getDriverExp() {
	return driverExp;
}
public void setDriverExp(String driverExp) {
	this.driverExp = driverExp;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getLno() {
	return lno;
}
public void setLno(String lno) {
	this.lno = lno;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

	
}
