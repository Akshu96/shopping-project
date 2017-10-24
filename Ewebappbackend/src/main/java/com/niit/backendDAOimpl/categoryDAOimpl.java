package com.niit.backendDAOimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendDAO.categoryDAO;
import com.niit.backendmodel.cart;
import com.niit.backendmodel.category;

@Repository
public class categoryDAOimpl implements categoryDAO {
	
	
	 @Autowired
		private SessionFactory sessionFactory;

	 public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}

	 //save dao implemented
	 @Transactional
	public void save(category cat) {
		Session sf=sessionFactory.openSession();
		//sf.beginTransaction();
		
		sf.save(cat);
		//sf.getTransaction().commit();
		sf.close();	
	}

	
	//getid dao implemented
	public category getId(String cat_id) {
		Session session = sessionFactory.openSession();
		 category cat=(category) session.get(category.class,cat_id);
		 session.close();
		 return cat;
		
	}

	
	//update dao implemented
	@Transactional
	public boolean update(category cat) {
		try
		{
			sessionFactory.getCurrentSession().update(cat);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception arised"+e);
			return false;
		}
	}

	
	//delete dao implemented
	public boolean delete(category cat) {
		try
		{
			sessionFactory.getCurrentSession().delete(cat);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception rised"+e);
			return false;
		}
	}

	public List<category> getAll() {
		
		Session s=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<category> l=s.createCriteria(category.class).list();
		s.close();
		
		return l;
	}

	public category findById(String cat_id) {
	
		return (category)sessionFactory.openSession().get(cart.class,cat_id);
	}
	
	

}
