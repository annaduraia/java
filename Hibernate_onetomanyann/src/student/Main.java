package student;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import java.util.*;;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Scanner boom = new Scanner(System.in);


		try {
			transaction = session.beginTransaction();
String nam1,nam2;
System.out.println("Enter a student name1: ");
nam1 = boom.nextLine();
System.out.println("Enter a student name2: ");
nam2=boom.nextLine();
Set<Phone> phoneNumbers = new HashSet<Phone>();
			phoneNumbers.add(new Phone("LANDLINE", "2556415"));
			phoneNumbers.add(new Phone("MOBILE", "9962988408"));
			phoneNumbers.add(new Phone("OFFICE MOBILE", "8608079503"));
			Set<Phone> phoneNumbers1= new HashSet<Phone>();
			phoneNumbers1.add(new Phone("LANDLINE", "2556200"));
			phoneNumbers1.add(new Phone("MOBILE", "9047313018"));

			Student student = new Student(nam1, phoneNumbers);
			Student student1 = new Student(nam2, phoneNumbers1);
			session.save(student);
			session.save(student1);

			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}


