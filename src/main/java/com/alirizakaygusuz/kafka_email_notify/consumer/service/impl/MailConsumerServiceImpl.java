package com.alirizakaygusuz.kafka_email_notify.consumer.service.impl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.alirizakaygusuz.kafka_email_notify.consumer.service.MailConsumerService;
import com.alirizakaygusuz.kafka_email_notify.dto.MailRequest;
import com.alirizakaygusuz.kafka_email_notify.service.EmailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class MailConsumerServiceImpl implements MailConsumerService {
	
	
	private final EmailService emailService;

	@KafkaListener(topics = "${app.kafka.topic.email-notify}", groupId = "${spring.kafka.consumer.group-id}")
	@Override
	public void consume(MailRequest mailRequest) {
		
		log.info("Kafka consumed: {}", mailRequest);
		emailService.send(mailRequest);
	}

}
