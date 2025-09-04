package com.alirizakaygusuz.kafka_email_notify.producer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MailRequest {

	private String to;
	private String subjectString;
	private String body;
	
}
