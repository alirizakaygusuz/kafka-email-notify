package com.alirizakaygusuz.kafka_email_notify.producer.service;

import com.alirizakaygusuz.kafka_email_notify.dto.MailRequest;

public interface MailProducerService {
	public void sendMessage(MailRequest message);

}
