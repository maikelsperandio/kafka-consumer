package br.com.maikelsoft.poc.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OnlineSalesListener {

	@KafkaListener(topics = "${application.params.consumer-topic}", groupId = "${application.params.group-id}")
	public void processOnlineSales(String message) {
		System.out.println(message);
	}
}
