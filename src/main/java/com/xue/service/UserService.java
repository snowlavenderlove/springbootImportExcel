package com.xue.service;

import org.springframework.web.multipart.MultipartFile;

public interface UserService {
	
	public int addUser(MultipartFile file) throws Exception;

}
