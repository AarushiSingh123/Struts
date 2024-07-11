package max.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import max.struts.vds.regist.VisitorBean;
import max.struts.vds.regist.VisitorDTO;
import max.struts.vds.search.SearchDAO;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class ViewAction extends DispatchAction{
	public ActionForward viewVisitor(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		
		SearchDAO b=	new SearchDAO();
		List<VisitorDTO> list = b.viewDeatils();
		req.setAttribute("lst", list);
	return mapp.findForward("view");
	
}
}
