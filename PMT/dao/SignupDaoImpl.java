package com.PMT.dao;

import java.util.ArrayList;  
import java.util.List;  
import javax.sql.DataSource;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import com.PMT.domain.Signup;  
import com.PMT.jdbc.SignupRowMapper;

public class SignupDaoImpl implements SignupDao{
	
	@Autowired
	DataSource dataSource;
	
	public void insertData(Signup signup) {
		String sql = "INSERT INTO passenger" + "(contact,name,password) values (?,?,?)";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource); 
		
		jdbcTemplate.update(sql,new Object[] {signup.getContact(),signup.getName(),signup.getPassword() });
	
	}
}
