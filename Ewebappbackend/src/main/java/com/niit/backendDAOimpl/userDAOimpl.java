package com.niit.backendDAOimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backendDAO.userDAO;
import com.niit.backendmodel.user;

@Repository(value="userDAO")
public class userDAOimpl implements userDAO{

	
	@SuppressWarnings("unused")
	@Autowired
	
	private SessionFactory sessionFactory;

	 public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}
	public void save(user User) {
		Session sf=sessionFactory.openSession();
		sf.save(User);
		sf.close();
		
	}

    public user getId(String user_id) {
    	Session session = sessionFactory.openSession();
		user u = (user) session.get(user.class, user_id);
		session.close();
		return u;	
		
		
	}

	public void update(user User) {
		Session sf=sessionFactory.openSession();
		sf.update(User);
		sf.close();

		
	}

	public void delete(user User) {
		Session sf=sessionFactory.openSession();
		sf.update(User);
		sf.close();
		
	}

	public List<user> getAll() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<user> u = session.createCriteria(user.class).list();
		session.flush();
		session.close();
		return u;

	}

	public user findById(String user_id) {
		
		Session session = sessionFactory.openSession();
		user u = (user) session.get(user.class, user_id);
		session.close();
		return u;
	}

	
}
