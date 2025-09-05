package com.alirizakaygusuz.kafka_email_notify.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MailRequest {

	@NotBlank
	@Email
	private String to;
	
	private String subject;
	private String body;
	
}
