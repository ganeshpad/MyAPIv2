package com.optum.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class MyApIv2Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(MyApIv2Application.class, args);
		

	}

}
