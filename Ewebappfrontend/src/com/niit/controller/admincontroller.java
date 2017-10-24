package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.niit.backendDAOimpl.cartDAOimpl;
import com.niit.backendDAOimpl.categoryDAOimpl;
import com.niit.backendDAOimpl.orderDAOimpl;
import com.niit.backendDAOimpl.productDAOimpl;
import com.niit.backendDAOimpl.supplierDAOimpl;
import com.niit.backendDAOimpl.userDAOimpl;

@Controller
public class admincontroller {
	
	
@Autowired	
cartDAOimpl cd;
@Autowired
categoryDAOimpl cat;
@Autowired
orderDAOimpl ord;
@Autowired
productDAOimpl pd;
@Autowired
supplierDAOimpl su;
@Autowired
userDAOimpl u;



}
