package com.niit.backendDAOimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backendDAO.productDAO;
import com.niit.backendmodel.product;

@Repository
public class productDAOimpl implements productDAO {
	
	 @Autowired
		private SessionFactory sessionFactory;
	 

		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}
		
		
	 public void setSessionFactory(SessionFactory se){
			this.sessionFactory = se;		
		}
	 
	 
	public void save(product pro) {
		Session sf=sessionFactory.openSession();
		sf.save(pro);
		//sf.getTransaction().commit();
		sf.close();			
	}


	public product getId(String pro_id) {
		Session session = sessionFactory.openSession();
		product pro = (product) session.get(product.class, pro_id);
		session.close();
		return pro;	
	}

	
	
    //to edit the product list
	public void edit(product pro) {
		Session session = sessionFactory.openSession();
		session.update(pro);
		session.flush();
		session.close();	
	}
	
	
    // to update the product list after editing
	public void update(product pro) {
		Session s=sessionFactory.openSession();
		s.update(pro);
		s.close();		
	}


	
// to delete the items
	public void delete(String pro_id) {
		Session session = sessionFactory.openSession();
		product prod = (product) session.get(product.class,pro_id);
		session.delete(prod);
		session.flush();
		session.close();
		
	}


	public List<product> getAll() {
		
				Session session = sessionFactory.openSession();
				@SuppressWarnings("unchecked")
				List<product> pro = session.createCriteria(product.class).list();
				System.out.println("----- List of Products-----");
				System.out.println(pro);
				session.flush();
				session.close();
				return pro;

	}


	public product findById(String pro_id) {
		
				Session session = sessionFactory.openSession();
				product product = (product) session.get(product.class, pro_id);
				session.close();
				return product;
	
	}
}
