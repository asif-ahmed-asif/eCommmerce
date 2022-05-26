package com.ecommerce.controller;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Mail;
import com.ecommerce.service.MailService;

@RestController
public class MailController {

	
	@Autowired
	 public JavaMailSender emailSender;
	@Autowired
	 public MailService mailService;
	
	
	@PostMapping(value="/mailReg")
	public void sendMail(@RequestBody Mail mail ) throws  UnsupportedEncodingException, MessagingException {
		
		mailService.addMail(mail);
		
		String mailContent="<p>Dear Customer,</p>"
						 + "<p>Please click the link below to verify your email</p>"
						 +"<h3><a href=\"http://localhost:3000/mail/"+mail.getVerificationCode()+"\">VERIFY</a></h3>";
		//<a href="https://www.w3schools.com">Visit W3Schools.com!</a>
		
		
		MimeMessage mimeMsg=  emailSender.createMimeMessage();
		MimeMessageHelper helper= new MimeMessageHelper( mimeMsg);
		
		helper.setFrom("dokan3976@gmail.com", "Dokan Team");
		helper.setTo(mail.getMail());
		helper.setSubject("Mail cofirmation");
		helper.setText(mailContent, true);
		
		System.out.println(mail.getMail());
		
		emailSender.send(mimeMsg);
		System.out.println("Success");
	}
	
	
}
