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
			Address address1 = new Address("BTL Road", "Dindigul", "TN", "624707");
			Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000");
			Student student1 = new Student("Pandiarajan", address1);
			Student student2 = new Student("vinoth", address2);
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
