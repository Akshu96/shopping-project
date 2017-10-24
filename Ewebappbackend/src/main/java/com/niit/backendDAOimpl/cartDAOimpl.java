package com.niit.backendDAOimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backendDAO.cartDAO;
import com.niit.backendmodel.cart;



@Repository(value="cartDAO")
public class cartDAOimpl implements cartDAO {
	
    @Autowired
	private SessionFactory sessionFactory;
    
    
    public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}


	public void save(cart Cart) {
		Session s=sessionFactory.openSession();
		//s.beginTransaction();
		s.save(Cart);
		//s.getTransaction().commit();
		s.close();
		
		
	}


	public cart getId(String cartid) {
		
		return (cart)sessionFactory.openSession().get(cart.class,cartid);
	}


	public boolean update(cart Cart) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(Cart);
			return true;
			
		}
		catch(Exception e)
		{
			
		System.out.println("exception arised"+e);
			return false;
		}
		
		
	}


	public boolean delete(cart Cart) {
		try {
			sessionFactory.getCurrentSession().delete(Cart);
			return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception arised"+e);
		return false;
	}
	}


	public List<cart> getAll() {
		Session s=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<cart> c=s.createCriteria(cart.class).list();
		System.out.println("----- List of Products-----");
		System.out.println(c);
		s.flush();
		s.close();
		
		return c;
	}


	public cart findById(String cartid) {
		return (cart)sessionFactory.openSession().get(cart.class,cartid);
		

	}


	public boolean add(cart Cart) {
		try
		{
			sessionFactory.getCurrentSession().save(Cart);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception arised"+e);
			return false;
		}
		
	}
    
    
	
}
