package com.niit.testbackend;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backendDAO.cartDAO;
import com.niit.backendmodel.cart;





public class cartDAOTest {
 
	static cartDAO cd;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
	
		AnnotationConfigApplicationContext annotationconfigapplicationcontext =new AnnotationConfigApplicationContext();
		annotationconfigapplicationcontext.scan("com.niit");
		annotationconfigapplicationcontext.refresh();
		cd=(cartDAO)annotationconfigapplicationcontext.getBean("cartDAO");
	}
	
	
	@Test
	public void addCartTest()
	{
		cart c=new cart();
	     c.setProductId("A001");
	     c.setCartId("s235");
	     c.setStatus_of_product("NP");
	     c.setQuantity(5);
	     c.setProdprice(10000);
	     
	 // assertTrue("Problem in adding item",cd.add(c));
	     
	}
}
	

