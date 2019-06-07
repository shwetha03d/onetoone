package com.xworkz.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.demo.dto.CountryDTO;
import com.xworkz.hibernate.util.SFUtil;

public class CountryDAO {
	
	public Integer save(CountryDTO countryDTO) {
		SessionFactory sessionFactory=SFUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try {
			System.out.println("connection is established");
			//Integer id=(Integer)session.save(countryDTO);
			session.save(countryDTO);
			tx.commit();
			//return id;
		}
		catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
			
		}
		finally {
			session.close();
		}
		return null;
	
	
	}
			
		
		

}
