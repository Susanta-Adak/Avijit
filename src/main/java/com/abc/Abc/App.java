package com.abc.Abc;

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
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Student stu = new Student();
        stu.setId(12354);
        stu.setName("Susanta");
        stu.setCourse("java");
     
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(stu);
        tx.commit();
        session.close();
    }
}
