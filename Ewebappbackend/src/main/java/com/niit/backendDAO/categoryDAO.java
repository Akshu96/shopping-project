package com.niit.backendDAO;

import java.util.List;


import com.niit.backendmodel.category;

public interface categoryDAO
{
	public void save(category cat);
	public category getId(String cat_id);
	public boolean update(category cat);
	public boolean delete(category cat);
	
	public List<category> getAll();
	public category findById(String cat_id);
	
	
	
	

}
