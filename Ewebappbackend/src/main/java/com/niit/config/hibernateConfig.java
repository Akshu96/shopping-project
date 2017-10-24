package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.backendDAOimpl.cartDAOimpl;
import com.niit.backendDAOimpl.categoryDAOimpl;
import com.niit.backendDAOimpl.orderDAOimpl;
import com.niit.backendDAOimpl.productDAOimpl;
import com.niit.backendDAOimpl.supplierDAOimpl;
import com.niit.backendDAOimpl.userDAOimpl;
import com.niit.backendmodel.cart;
import com.niit.backendmodel.category;
import com.niit.backendmodel.orders;
import com.niit.backendmodel.product;
import com.niit.backendmodel.supplier;
import com.niit.backendmodel.user;


@SuppressWarnings("unused")
@Configuration
@ComponentScan("com.niit.backend")
@EnableTransactionManagement
public class hibernateConfig {
	//@SuppressWarnings("deprecation")
	@Autowired
	@Bean(name="dataSource")
	
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:~/aks");

        dataSource.setUsername("niit");
        dataSource.setPassword("niit");
        System.out.println("Data source created");
        return dataSource;
    }
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "true");
		System.out.println("Table Source Created");
		//properties.put(arg0, arg1)
		return properties;
		}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory sessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
        sessionBuilder.addAnnotatedClass(product.class);
        sessionBuilder.addAnnotatedClass(category.class);
        sessionBuilder.addAnnotatedClass(supplier.class);
        sessionBuilder.addAnnotatedClass(user.class);
        sessionBuilder.addAnnotatedClass(orders.class);
        sessionBuilder.addAnnotatedClass(cart.class);
        return sessionBuilder.buildSessionFactory();
	}
	@Autowired
	@Bean(name="userDAOimpl")
	public userDAOimpl getUserDAO(SessionFactory sessionFactory)
	{
	return new userDAOimpl();
	}
	@Autowired
	@Bean(name="categoryDAOImpl")
	public categoryDAOimpl getCategoryDAO(SessionFactory sessionFactory)
	{
	return new categoryDAOimpl();
	}
	
	@Autowired
	@Bean(name="supplierDaoImpl")
	public supplierDAOimpl getSupplierDAO(SessionFactory sessionFactory)
	{
	return new supplierDAOimpl();
	}

	@Autowired
	@Bean(name="productDaoImpl")
	public productDAOimpl getProductDAO(SessionFactory sessionFactory)
   	{
	return new productDAOimpl();
	}
	@Autowired
	@Bean(name="OrderDaoImpl")
	public orderDAOimpl getOrderDAO(SessionFactory sessionFactory)
	{
	return new orderDAOimpl();
	}

	@Autowired
	@Bean(name="CartDaoImpl")
	public cartDAOimpl getCartDAO(SessionFactory sessionFactory)
	{
	return new cartDAOimpl();
	}
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	return transactionManager;
	}

	
}
   