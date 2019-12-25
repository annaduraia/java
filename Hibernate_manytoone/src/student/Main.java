package student;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Address address = new Address("BTL Road", "Dindigul", "TN", "624707");
			//Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");

			Student student1 = new Student("pandiarajan", address);
			Student student2 = new Student("vinoth", address);
			session.save(student1);
			session.save(student2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}