package com.streamline.service;

import org.springframework.stereotype.Service;

import com.stream.streamline.model.SignUpModel;

@Service 
public interface StreamlineService {
	
	void addUser(SignUpModel u);

}
