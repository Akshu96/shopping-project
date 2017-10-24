package com.niit.backendDAO;

import java.util.List;

import com.niit.backendmodel.cart;

public interface cartDAO {
	
	public boolean add(cart Cart);
	public void save(cart Cart);
    public cart getId(String cartid);
	public boolean update(cart Cart);
	public boolean delete(cart Cart);
	public List<cart> getAll();
	
	public cart findById(String cartid);
}
