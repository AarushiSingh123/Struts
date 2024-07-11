package max.struts.vds.regist;

import java.lang.reflect.InvocationTargetException;

import max.hiber.SessionUtility;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VistorDAO {
	public int saveVisitorEntry(VisitorBean visitorBean) throws IllegalAccessException, InvocationTargetException
	{
		VisitorDTO vdto = new VisitorDTO();
		
		BeanUtils.copyProperties(vdto, visitorBean);
		Session s = SessionUtility.getSession();
		Transaction tx = s.beginTransaction();
	   Integer i = (Integer)	s.save(vdto);
	   tx.commit();
	   return i;
	}

}
