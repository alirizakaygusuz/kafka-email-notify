package com.alirizakaygusuz.kafka_email_notify.producer.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.alirizakaygusuz.kafka_email_notify.dto.MailRequest;
import com.alirizakaygusuz.kafka_email_notify.producer.service.MailProducerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MailProducerServiceImpl implements MailProducerService {

	private final KafkaTemplate<String, MailRequest> kafkaTemplate;
	
	@Value("${app.kafka.topic.email-notify}")
	private String kafkaEmailNotifyTopic;
	
	@Override
	public void sendMessage(MailRequest message) {
		kafkaTemplate.send(kafkaEmailNotifyTopic , message);
	}
}
