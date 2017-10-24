package com.niit.backendDAO;

import java.util.List;


import com.niit.backendmodel.supplier;

public interface supplierDAO {
	

	
	public void save(supplier sup);
	public supplier getId(String su_id);
	public void update(supplier sup);
	public void delete(supplier sup);
	 public List<supplier> getAll(); 
	 public supplier findById(String su_id);
	
	
}
