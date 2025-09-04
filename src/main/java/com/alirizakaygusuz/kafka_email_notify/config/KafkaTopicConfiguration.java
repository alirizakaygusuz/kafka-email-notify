package com.alirizakaygusuz.kafka_email_notify.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {
	
	@Value("${app.kafka.topic.email-notify}")
	private String kafkaEmailNotifyTopic;
	
	
	@Bean
	 NewTopic emailNotifyTopic() {
		return TopicBuilder.name(kafkaEmailNotifyTopic)
				.partitions(1)
				.replicas(1)
				.config("retention.ms", "86400000")
				.build();
	}

}
