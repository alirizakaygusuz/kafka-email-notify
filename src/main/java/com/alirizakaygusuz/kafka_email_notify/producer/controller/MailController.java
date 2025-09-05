package com.alirizakaygusuz.kafka_email_notify.producer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alirizakaygusuz.kafka_email_notify.dto.MailRequest;
import com.alirizakaygusuz.kafka_email_notify.producer.service.MailProducerService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/mail")
@RequiredArgsConstructor
public class MailController {
	
	private final MailProducerService mailProducerService;
	
	@PostMapping
	public ResponseEntity<String> sendNotication(@Valid @RequestBody MailRequest mailRequest){
		
		mailProducerService.sendMessage(mailRequest);
		
		return ResponseEntity.ok("Message sent to Kafka topic: email-notify");
	}

}
