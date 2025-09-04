package com.alirizakaygusuz.kafka_email_notify.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MailRequest {

	private String to;
	private String subjectString;
	private String body;
	
}
