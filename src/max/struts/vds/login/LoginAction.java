package max.struts.vds.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class LoginAction extends DispatchAction
{

	public ActionForward login(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		LoginBean loginBean=(LoginBean)form;
		if(loginBean.getUid().equalsIgnoreCase(loginBean.getPass()))
		{
			return mapp.findForward("lgn");
		}
		else
		{
			return mapp.findForward("err");
		}
	}
}
