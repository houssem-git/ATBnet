package backoffice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.AccountType;
import util.HibernateUtil;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				Session session = HibernateUtil.getSessionFactory().getCurrentSession();
				
					// create a student object
					System.out.println("Creating new student object...");
					AccountType acnt = new AccountType(124, "Wall", "paul@luv2code.com");
					
					// start a transaction
					session.beginTransaction();
					
					// save the student object
					System.out.println("Saving the student...");
					session.save(acnt);
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				
				
			}
	

}
