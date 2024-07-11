package max.struts.vds.regist;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;









import max.master.DistBean;
import max.master.LocationDAO;
import max.master.StateBean;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class VisitorAction extends DispatchAction{

	public ActionForward visitorEntry(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		
		ServletContext ctx = getServlet().getServletContext();
		@SuppressWarnings("unchecked")
		List<StateBean> list=(List<StateBean>)ctx.getAttribute("lst");
		req.setAttribute("lst", list);
		
		return mapp.findForward("ve");
		
	}
	
	public ActionForward getDistList(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		String stcode = req.getParameter("stcode");
		
		LocationDAO locationDAO=new LocationDAO();
		req.setAttribute("dlst", locationDAO.getDistDeatils(stcode));
		return mapp.findForward("ve");
		
	}
	public ActionForward saveVistorEntry(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		VisitorBean visitorBean=(VisitorBean)form;
		
		VistorDAO vistorDAO=new VistorDAO();
		  int i=vistorDAO.saveVisitorEntry(visitorBean);
		  if(i>0)
		  {
			  req.setAttribute("s", "Successful Registration");
			  return mapp.findForward("ve");  
		  }
		  else
		  {
			  return mapp.findForward("E");
		  }
		
		
	}
	
	
	
		
}
