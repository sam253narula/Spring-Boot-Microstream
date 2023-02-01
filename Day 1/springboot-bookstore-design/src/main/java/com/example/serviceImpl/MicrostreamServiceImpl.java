package com.example.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.model.MicroStream;
import com.example.service.MicrostreamService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MicrostreamServiceImpl implements MicrostreamService {

	@Override
	public MicroStream getInfo() {
		log.info("Inside getInfo() Method"); 
		return new MicroStream("Spring Boot and Spring Cloud", "Information Technology",
			"Samarth Narula");
//		return new MicroStream("Spring Boot and Spring Cloud", "Information Technology",
//				new FullName("Samarth", "Narula"));
	}

	@Override
	public MicroStream getCustomInfo(String courseName, String courseType, String instructorName) {
		log.info("Inside getCustomInfo() Method");
		return new MicroStream(courseName, courseType, instructorName);
	}
}
