package com.Email.EmailServer.Controller;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EmailService")
public class EmailController {
	
	
	
	@RequestMapping(value = "/sendemail/{name}/{from}/{subject}/{message}")
	public String sendEmail(@PathVariable String name,@PathVariable String from ,@PathVariable String subject,@PathVariable String message) {
		
		try {
			sendmail(name, from, subject, message);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	      return "Email sent successfully";
	} 

	
	
	
	private void sendmail(String name , String from ,String subject ,String message) throws AddressException, MessagingException, IOException {
		   Properties props = new Properties();
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.starttls.enable", "true");
		   props.put("mail.smtp.host", "smtp.gmail.com");
		   props.put("mail.smtp.port", "587");
		   
		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		         return new PasswordAuthentication("ruzaikmohomad@gmail.com", "rzktechnology@123");
		      }
		   });
		   Message msg = new MimeMessage(session);
		   msg.setFrom(new InternetAddress(from, false));

		   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ruzaikmohomad@gmail.com"));
		   msg.setSubject(subject);
		   msg.setContent(name+":"+message, "text/html");
		   msg.setSentDate(new Date());

		 
		   Transport.send(msg);   
		}

}
