package com;  
import java.util.*;
import javax.persistence.TypedQuery;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder; 
  
public class FetchData {  
public static void main(String[] args) {  
      
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory factory=meta.getSessionFactoryBuilder().build();
	Session session=factory.openSession();
      
    TypedQuery query=session.createQuery("from Question");  
    List<Question> list=query.getResultList();  
      
    Iterator<Question> itr=list.iterator();  
    while(itr.hasNext()){  
        Question q=itr.next();  
        System.out.println("Question Name: "+q.getQname());  
          
        //printing answers  
        List<Answer> list2=q.getAnswers();  
        Iterator<Answer> itr2=list2.iterator();  
       while(itr2.hasNext())
       {
        Answer a=itr2.next();
            System.out.println(a.getAnswername()+":"+a.getPostedBy());
        }  
    }
    session.close();  
    System.out.println("success");  
}  
}  