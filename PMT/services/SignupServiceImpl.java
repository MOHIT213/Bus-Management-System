package com.PMT.services;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;  
import com.PMT.dao.SignupDao;  
import com.PMT.domain.Signup;  

public class SignupServiceImpl implements SignupService {
	 @Autowired  
	 SignupDao signupdao;  
	  
	 @Override  
	 public void insertData(Signup signup) {  
	  signupdao.insertData(signup);  
	 }
}
