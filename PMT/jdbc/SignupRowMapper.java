package com.PMT.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.jdbc.core.RowMapper;  
import com.PMT.domain.Signup;  
  
public class SignupRowMapper implements RowMapper<Signup> { 
 @Override  
 public Signup mapRow(ResultSet resultSet, int line) throws SQLException {  
  SignupExtractor signupExtractor = new SignupExtractor();  
  return signupExtractor.extractData(resultSet);  
  }  
} 
