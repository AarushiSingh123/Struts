package max.driver;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class DriverAction extends DispatchAction{
	  DriverDAO driverDAO=new DriverDAO();
	public ActionForward viewDriverLisence(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		String lno=req.getParameter("lno");
		List<DriverBeanDTO> list = driverDAO.getDetail(lno);
		
		req.setAttribute("lst", list);
		//req.getRequestDispatcher("viewdriver.jsp").forward(req, res);
		return mapp.findForward("viewdriver");
		
	}
	
	public ActionForward viewDriverDetail(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		
		List<DriverBeanDTO> list = driverDAO.getLisence();
		 List<DriverBean> listp=new ArrayList<DriverBean>();
		     
		 for(DriverBeanDTO p:list)
		 {  DriverBean d = new DriverBean();
		    d.setLno(p.getLno());
		    
			 listp.add(d);
		 }
		 
		 System.out.println("lno  "+list.size());
		req.setAttribute("llst", listp);
		//req.getRequestDispatcher("viewdriver.jsp").forward(req, res);
		return mapp.findForward("viewdriver");
		
	}
	
	
	
	public ActionForward driverRegistration(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		return mapp.findForward("driver");
		
	}
	
	public ActionForward saveDriverEntry(ActionMapping mapp,ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception
	{
		
		DriverBean db=(DriverBean)form;
		DriverBeanDTO driverBeanDTO = new DriverBeanDTO();
		BeanUtils.copyProperties(driverBeanDTO, db);
		 System.out.println(db.getName());
		 if(driverDAO.saveDetail(driverBeanDTO))
		 {
			 req.setAttribute("r", "Successsfullll");
		 }
		 else
		 {
			 req.setAttribute("r", "Un Successsfullll");
		 }
		return mapp.findForward("saveDriver");
		
	}
}
