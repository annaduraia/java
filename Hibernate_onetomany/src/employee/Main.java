package employee;

import java.util.HashSet;
import java.util.Set;

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

			Set<Account> accountNumbers = new HashSet<Account>();
			accountNumbers.add(new Account("savings","32354300153"));
			accountNumbers.add(new Account("current","9889343423"));
			Set<Account> accountNumbers1 = new HashSet<Account>();
			accountNumbers1.add(new Account("savings","32354300153"));
			accountNumbers1.add(new Account("current","9889343423"));


			Employee employee = new Employee("Pandiarajan", accountNumbers);
			Employee employee1 = new Employee("Vinoth", accountNumbers1);
			session.save(employee);
			session.save(employee1);

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
