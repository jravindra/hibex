package com.mkyong;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.mkyong.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate one to many (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		 
        PiHashInfo piHashInfo = new PiHashInfo();
        piHashInfo.setBillingAgreementId("121");
        piHashInfo.setClientId("sdf");
        piHashInfo.setDefaultBilling("tre");
        piHashInfo.setPiHash("PIHASH.3q434");
        piHashInfo.setStatus("Y");
        piHashInfo.setDefaultBilling("1");
        
        piHashInfo.setId(1);
        
        PiHashInfo piHashInfo2 = new PiHashInfo();
        piHashInfo2.setBillingAgreementId("121");
        piHashInfo2.setClientId("sdf");
        piHashInfo2.setDefaultBilling("tre");
        piHashInfo2.setPiHash("PIHASH.3q4343");
        piHashInfo2.setStatus("Y");
        piHashInfo2.setDefaultBilling("1");
        
        piHashInfo2.setId(2);
        
        CustFundingSource custFundingSource = new CustFundingSource();
        custFundingSource.setCustomerId("erere");
        custFundingSource.setId(1001L);
        custFundingSource.setPiHashInfo(piHashInfo);
//        HashSet<PiHashInfo> piHashInfos = new HashSet<PiHashInfo>();
//        piHashInfos.add(piHashInfo);
//        custFundingSource.setPiHashInfos(piHashInfos);
        
        CustFundingSource custFundingSource2 = new CustFundingSource();
        custFundingSource2.setCustomerId("erere");
        custFundingSource2.setId(1002L);
        custFundingSource2.setPiHashInfo(piHashInfo2);
        
//        session.save(piHashInfo);
//        session.save(piHashInfo2);
        session.save(custFundingSource);
        session.save(custFundingSource2);

		session.getTransaction().commit();
		
		session.getTransaction().begin();
		
		Criteria criteria = session.createCriteria(CustFundingSource.class);
		criteria.add(Restrictions.eq("customerId","erere"));
		List<CustFundingSource> list = criteria.list();
		for (CustFundingSource cs : list) {
            System.out.println(cs.getCustomerId());
            System.out.println(cs.getPiHashInfo().getPiHash());
        }
		
	        
//		CustFundingSource src =session.find(CustFundingSource.class, customerId);
//	    System.out.println("customer " + src);
	        
	    session.getTransaction().commit();
	    
	    session.close();
	        
		System.out.println("Done");
	}
}
