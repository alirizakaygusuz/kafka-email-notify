package com.alirizakaygusuz.kafka_email_notify.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alirizakaygusuz.kafka_email_notify.producer.dto.MailRequest;
import com.alirizakaygusuz.kafka_email_notify.producer.service.MailProducerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/notify")
@RequiredArgsConstructor
public class MailController {
	
	private final MailProducerService mailProducerService;
	
	@Value("${email-notify}")
	private String topic;
	
	
	@PostMapping
	public ResponseEntity<String> sendNotication(@RequestBody MailRequest mailRequest){
		mailProducerService.sendMessage(mailProducerService);
		
		return ResponseEntity.ok("Message sent to Kafka topic: email-notify");
	}

}
