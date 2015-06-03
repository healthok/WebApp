package hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User us=new User();
		us.setEmailId("fghfgggf");
		us.setFirstName("ashish");
		us.setLastName("upadhyay");
		us.setPassword("@1AAAsss");
		us.setPhoneNo("65454555");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		ss.beginTransaction();
		ss.save(us);
	    ss.getTransaction().commit();

	}

}
