package max.struts.vds.search;

import java.util.List;

import max.hiber.SessionUtility;
import max.struts.vds.regist.VisitorDTO;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class SearchDAO {
	
	public VisitorDTO fatchDeatils(String mobile)
	{
		try {
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			Criteria cr = s.createCriteria(VisitorDTO.class);
			cr.add(Restrictions.eq("visitorPhone", mobile));
			tx.commit();
			return (VisitorDTO)cr.list().get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public List<VisitorDTO> viewDeatils()
	{
		try {
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			Criteria cr = s.createCriteria(VisitorDTO.class);
		List<VisitorDTO>	list=cr.list();
			tx.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
