package com.alirizakaygusuz.kafka_email_notify.service;

import com.alirizakaygusuz.kafka_email_notify.dto.MailRequest;

public interface EmailService {

	public void send(MailRequest mailRequest);
}
