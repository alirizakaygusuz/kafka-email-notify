package com.alirizakaygusuz.kafka_email_notify.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {
	
	@Bean
	 NewTopic emailNotifyTopic() {
		return TopicBuilder.name("email-notify")
				.partitions(1)
				.replicas(1)
				.config("retention.ms", "86400000")
				.build();
	}

}
