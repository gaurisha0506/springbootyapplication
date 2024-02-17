package com.streamline.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stream.streamline.model.*;
import com.streamline.repository.Streamlinerepo;
import com.streamline.service.StreamlineService;
@Service
public class StreamlineServiceImpl implements StreamlineService{
	

	@Autowired
	private Streamlinerepo repo;

	@Override
	public void addUser(SignUpModel e) {
		repo.save(e);
	}

}

