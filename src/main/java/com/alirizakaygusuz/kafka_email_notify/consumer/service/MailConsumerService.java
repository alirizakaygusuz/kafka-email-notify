package com.alirizakaygusuz.kafka_email_notify.consumer.service;

import com.alirizakaygusuz.kafka_email_notify.common.dto.MailRequest;

public interface MailConsumerService {
	public void consume(MailRequest mailRequest);

}
