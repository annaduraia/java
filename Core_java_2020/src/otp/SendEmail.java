package otp;

//Java program to send email 
//with attachments 

import java.util.*; 
import javax.mail.*; 
import javax.mail.internet.*; 
import javax.activation.*; 
import javax.mail.Session; 
import javax.mail.Transport; 


public class SendEmail 
{ 
	
	public static void main(String [] args) 
	{ 
		// email ID of Recipient. 
		String recipient = "annadurai.mca10@gmail.com"; 
	
		// email ID of Sender. 
		String sender = "annadurai.mca10@gmail.com"; 
	
		// using host as localhost 
		String host = "smtp.gmail.com"; //"127.0.0.1"; 
	
		// Getting system properties 
		Properties properties = System.getProperties(); 
	
		// Setting up mail server 
		properties.setProperty("mail.smtp.host", host); 
	
		// creating session object to get properties 
		Session session = Session.getDefaultInstance(properties); 
	
		try
		{ 
			// MimeMessage object. 
			MimeMessage message = new MimeMessage(session); 
	
			// Set From Field: adding senders email to from field. 
			message.setFrom(new InternetAddress(sender)); 
	
			// Set To Field: adding recipient's email to from field. 
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); 
	
			// Set Subject: subject of the email 
			message.setSubject("This is Suject"); 
			
			// creating first MimeBodyPart object 
			BodyPart messageBodyPart1 = new MimeBodyPart(); 
			messageBodyPart1.setText("This is body of the mail"); 
			
			// creating second MimeBodyPart object 
			//BodyPart messageBodyPart2 = new MimeBodyPart(); 
			//String filename = "attachment.txt"
			//DataSource source = new FileDataSource(filename); 
			//messageBodyPart2.setDataHandler(new DataHandler(source)); 
			//messageBodyPart2.setFileName(filename); 
			
			// creating MultiPart object 
			Multipart multipartObject = new MimeMultipart(); 
			multipartObject.addBodyPart(messageBodyPart1); 
			//multipartObject.addBodyPart(messageBodyPart2); 
	
	
	
			// set body of the email. 
			message.setContent(multipartObject); 
	
			// Send email. 
			Transport.send(message); 
			System.out.println("Mail successfully sent"); 
		} 
		catch (MessagingException mex) 
		{ 
			mex.printStackTrace(); 
		} 
	} 
} 
