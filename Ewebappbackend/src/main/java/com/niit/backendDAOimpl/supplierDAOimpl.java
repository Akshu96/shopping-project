package com.niit.backendDAOimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backendDAO.supplierDAO;
import com.niit.backendmodel.product;
import com.niit.backendmodel.supplier;

@Repository(value="supplier DAO")
public class supplierDAOimpl implements supplierDAO {
	
	@Autowired
private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
    
    public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void save(supplier sup) {
		Session sf=sessionFactory.openSession();
		sf.save(sup);
		//sf.getTransaction().commit();
		sf.close();
		
	}

	public supplier getId(String su_id) {
		Session session = sessionFactory.openSession();
		supplier sup = (supplier) session.get(supplier.class,su_id);
		session.close();
		return sup;	
		
	}

	public void update(supplier sup) {
		Session s=sessionFactory.openSession();
		s.update(sup);
		s.close();
	}

	public void delete(supplier sup) {
		Session s=sessionFactory.openSession();
		s.delete(sup);
		s.close();
		
	}

	public List<supplier> getAll() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<supplier> sup = session.createCriteria(supplier.class).list();
		session.flush();
		session.close();
		return sup;
	}

	public supplier findById(String su_id) {
		Session session = sessionFactory.openSession();
		supplier sup = (supplier) session.get(supplier.class, su_id);
		session.close();
		return sup;
		
	}


}
