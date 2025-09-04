package com.alirizakaygusuz.kafka_email_notify.consumer.service.impl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.alirizakaygusuz.kafka_email_notify.common.dto.MailRequest;
import com.alirizakaygusuz.kafka_email_notify.consumer.service.MailConsumerService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MailConsumerServiceImpl implements MailConsumerService {

	@KafkaListener(topics = "${app.kafka.topic.email-notify}", groupId = "${app.kafka.consumer.groupId}")
	@Override
	public void consume(MailRequest mailRequest) {
		log.info("Kafka consumed: {}", mailRequest);
	}

}
