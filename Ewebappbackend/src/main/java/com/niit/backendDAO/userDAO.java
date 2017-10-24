package com.niit.backendDAO;

import java.util.List;

import com.niit.backendmodel.user;


public interface userDAO {
	public void save(user User);
	public user getId(String user_id);
	public void update(user User);
	public void delete(user User);
	 public List<user> getAll(); 
	 public user findById(String user_id);
	
	
	
}
