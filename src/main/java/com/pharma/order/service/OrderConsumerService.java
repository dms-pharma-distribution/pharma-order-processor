package com.pharma.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.QueueDoesNotExistException;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;

@Service
public class OrderConsumerService {

	@Value("${app.config.message.queue.topic}")
	String messageQueueTopic;

	AmazonSQS amazonSQSClient;

	OrderService orderService;
	
	@Autowired
	public OrderConsumerService(AmazonSQS amazonSQSClient,
			OrderService orderService) {
		this.amazonSQSClient = amazonSQSClient;
		this.orderService = orderService;
	}

	@Scheduled(fixedDelay = 5000)
	public void consumOrderMessages() {
		String queueUrl = amazonSQSClient.getQueueUrl(messageQueueTopic).getQueueUrl();
		try {
			ReceiveMessageResult receiveMessageResult = amazonSQSClient.receiveMessage(queueUrl);
			if (!receiveMessageResult.getMessages().isEmpty()) {
				receiveMessageResult.getMessages().stream().forEach(message -> {
					orderService.orderCommandProcessor(message.getBody());					
					amazonSQSClient.deleteMessage(queueUrl, message.getReceiptHandle());
				});
			}
		} catch (QueueDoesNotExistException e) {
			System.out.println("Queue does not exist {}" + e.getMessage());
		}
	}
}
