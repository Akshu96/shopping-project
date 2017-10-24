package com.niit.backendDAO;

import java.util.List;

import com.niit.backendmodel.orders;


public interface ordersDAO {
	
	public void save(orders or);
	public orders getId(String order_id);
	public boolean update(orders or);
	public boolean delete(orders or);
	
	public List<orders> getAll();
	public orders findById(String order_id);

}
