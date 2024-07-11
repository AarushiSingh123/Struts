package max.struts.vds.regist;

import org.apache.struts.action.ActionForm;

public class VisitorBean extends ActionForm{
 String stCode;
 String distCode;
 String visitorName;
 String visitorEmail;
 
 String visitorAdd;
 String visitorPhone;

public String getStCode() {
	return stCode;
}
public void setStCode(String stCode) {
	this.stCode = stCode;
}
public String getDistCode() {
	return distCode;
}
public void setDistCode(String distCode) {
	this.distCode = distCode;
}
public String getVisitorName() {
	return visitorName;
}
public void setVisitorName(String visitorName) {
	this.visitorName = visitorName;
}
public String getVisitorEmail() {
	return visitorEmail;
}
public void setVisitorEmail(String visitorEmail) {
	this.visitorEmail = visitorEmail;
}
public String getVisitorAdd() {
	return visitorAdd;
}
public void setVisitorAdd(String visitorAdd) {
	this.visitorAdd = visitorAdd;
}
public String getVisitorPhone() {
	return visitorPhone;
}
public void setVisitorPhone(String visitorPhone) {
	this.visitorPhone = visitorPhone;
}
 
 
 
}
