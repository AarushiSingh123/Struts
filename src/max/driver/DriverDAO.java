package max.driver;

import java.util.List;

import max.hiber.SessionUtility;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DriverDAO {
	
	public List<DriverBeanDTO> getDetail(String lno)
	{
		try {
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			   Criteria cr = s.createCriteria(DriverBeanDTO.class);
			      cr.add(Restrictions.eq("lno", lno));
			      List<DriverBeanDTO> list=cr.list();
			        tx.commit();
			      return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<DriverBeanDTO> getLisence()
	{
		try {
			Session s = SessionUtility.getSession();
			Transaction tx = s.beginTransaction();
			   Criteria cr = s.createCriteria(DriverBeanDTO.class);
			      List<DriverBeanDTO> list=cr.list();
			        tx.commit();
			      return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
public boolean saveDetail(DriverBeanDTO driverBeanDTO)
{
	try {
		
		Session s = SessionUtility.getSession();
		Transaction tx = s.beginTransaction();
		s.save(driverBeanDTO);
		tx.commit();
		return true;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return false;
}
}
