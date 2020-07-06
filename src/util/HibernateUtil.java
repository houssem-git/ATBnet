package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
		private static final SessionFactory sessionFactory = buildSessionFactory();

	    private static SessionFactory buildSessionFactory() {
	        // TODO Auto-generated method stub

	        Configuration configuration = new Configuration();
	        configuration.configure("hibernate.cfg.xml");

	     
	        return configuration.buildSessionFactory();
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	}

