package com.PMT.jdbc;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.ResultSetExtractor;  
import com.PMT.domain.Signup;  
 
public class SignupExtractor implements ResultSetExtractor<Signup> {  
 
public Signup extractData(ResultSet resultSet) throws SQLException,  
  DataAccessException {  
   
 Signup signup = new Signup();  
   
 signup.setContact(resultSet.getString(1));  
 signup.setName(resultSet.getString(2));  
 signup.setPassword(resultSet.getString(3));    
   
 return signup;  
}  
}