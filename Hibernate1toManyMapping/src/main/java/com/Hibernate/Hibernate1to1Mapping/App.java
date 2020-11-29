package com.Hibernate.Hibernate1to1Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration con=new Configuration().configure("hibernate.cfg.xml"); 
        SessionFactory factory=con.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        Address a=new Address();
        a.setColony("new Ashok nagar");
        a.setCity("east delhi");
        a.setState("delhi");
        Employee e=new Employee();
        e.setEmpname("Rahul yadav");
        e.setDesignation("Developer");
        e.setAddresss(a);
        a.setEmployee(e);
        session.save(e);
        t.commit();
        System.out.println("done......");
        
        
        
    }
}
