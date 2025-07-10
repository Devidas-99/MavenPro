package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.Student;
import com.practice.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	Student s = new Student();
    	s.setId(5);
        s.setFname("Nisha");
        s.setLname("Khandave");
        s.setMoNo(877923992);
        s.setGender("Female");
        s.setCity("Nashik");
        // 1. session Factory
       SessionFactory factory= HibernateUtility.getSessionFactory();
       // 2. Session from Session Factory
       Session session = factory.openSession();
       // 3. Transaction from session
       Transaction transaction = session.beginTransaction();
       // 4. save process
       session.persist(s);
       //5. pass to database
       transaction.commit();
       //6. close session
       session.close();
     }
}
