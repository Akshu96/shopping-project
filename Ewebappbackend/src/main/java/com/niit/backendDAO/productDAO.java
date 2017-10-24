package com.niit.backendDAO;

import java.util.List;

import com.niit.backendmodel.product;


public interface productDAO {
	
	public void save(product pro);
	public product getId(String pro_id);
    public void update(product pro);
    public void edit(product pro);
    public void delete(String pro_id);
    
    public List<product> getAll();
	public product findById(String pro_id);

}
