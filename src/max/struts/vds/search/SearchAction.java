package max.struts.vds.search;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import max.struts.vds.regist.VisitorBean;
import max.struts.vds.regist.VisitorDTO;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class SearchAction extends DispatchAction {

	public ActionForward searchVisitor(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		
		System.out.println("searchVisitor");
		return mapp.findForward("search");
		
	}
	
	public ActionForward searchVisitorDetails(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		VisitorBean visitorBean=(VisitorBean)form;
		SearchDAO searchDAO=new SearchDAO();
		VisitorDTO vdto = searchDAO.fatchDeatils(visitorBean.getVisitorPhone());
		
		//BeanUtils.copyProperties(visitorBean, vdto);
		req.setAttribute("v", vdto);
		return mapp.findForward("vsearch");
		
	}
	
}
