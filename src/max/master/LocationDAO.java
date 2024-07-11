package max.master;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import max.hiber.SessionUtility;

public class LocationDAO {

	public List<StateBean> getStateDeatils()
	{
		try {
			
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			
			 Criteria cr = s.createCriteria(StateBean.class);
			 
			    cr.addOrder(Order.asc("stName"));
			    List<StateBean> list = cr.list();
			     tx.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DistBean> getDistDeatils(String stCode)
	{
		try {
			
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			
			 Criteria cr = s.createCriteria(DistBean.class);
			 
			   cr.add(Restrictions.eq("stCode", stCode)) ;  
			   cr.addOrder(Order.asc("distName"));
			    List<DistBean> list = cr.list();
			
			     tx.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
