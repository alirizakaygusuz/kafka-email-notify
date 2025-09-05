package com.alirizakaygusuz.kafka_email_notify.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.alirizakaygusuz.kafka_email_notify.dto.MailRequest;
import com.alirizakaygusuz.kafka_email_notify.service.EmailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailServiceImpl  implements EmailService{
	
	private final JavaMailSender javaMailSender;
	
	
	@Value("${spring.mail.username}")
	private String from;
	
	@Override
	public void send(MailRequest mailRequest) {
		if(mailRequest == null || mailRequest.getTo() ==null || mailRequest.getTo().isBlank()) {
			throw new IllegalArgumentException("MailRequest.to cannot empty");
		}
		
		try {
			
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			
			mailMessage.setFrom(from);
			mailMessage.setTo(mailRequest.getTo());
			mailMessage.setSubject(mailRequest.getSubject());
			mailMessage.setText(mailRequest.getBody());
			
			javaMailSender.send(mailMessage);
			
		}catch (Exception e) {
			throw new MailSendException("Email sending failed:"+e.getMessage());
		}
	
		
	}

}
