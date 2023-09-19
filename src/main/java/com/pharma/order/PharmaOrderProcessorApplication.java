package com.pharma.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

@SpringBootApplication
@EnableScheduling
public class PharmaOrderProcessorApplication {
	
	@Value("${app.config.aws.access-key-id}")
	private String awsAccessKeyId;

	@Value("${app.config.aws.secret-key-id}")
	private String awsSecretKeyId;
	
	@Value("${app.config.aws.region}")
	private String region;
	
	public static void main(String[] args) {
		SpringApplication.run(PharmaOrderProcessorApplication.class, args);
	}
	
	@Bean
	public AmazonSQS amazonSQSClient() {
		BasicAWSCredentials awsCredentials = new BasicAWSCredentials(awsAccessKeyId, awsSecretKeyId);
		return AmazonSQSClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
				.withRegion(region).build();
	}
	
	@Bean
	@Primary
	public ObjectMapper objectMapper() {
		return new ObjectMapper()
				.registerModule(new ParameterNamesModule())
				.registerModule(new JavaTimeModule());				  
				//.setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}

}
