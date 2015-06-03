package biz;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.User;
public class UserManager implements IUser
{
@Override
public void createUser(User us) 
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	session.beginTransaction();
	session.save(us);
	session.getTransaction().commit();
	session.close();
	
	
}
}
