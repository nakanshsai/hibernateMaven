package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

/**
 * @author akansh_sai
 * @creation date 1st oct 2019 10:32am
 * @modification date 1st oct 2019 10:32am
 * @version 1.0
 * @description first hibernate project using maven
 *
 */
public class HibernateMain 
{
    public static void main( String[] args )
    {
    		
    	Configuration c =new Configuration().configure();
    	SessionFactory sf = c.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction t = s.beginTransaction();
    	
    	Product p = new Product();
    	p.setProductId(1010);
    	p.setName("earphones");
    	p.setBrand("jbl");
    	p.setPrice(1000);
  
    	s.save(p);
    	t.commit();
    	s.close();
    	
    	
    	
    }
}
