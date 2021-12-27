package com.CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;



@SpringBootApplication

public class CrudApplication {
	   @Autowired
	    private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
        String sql = "INSERT INTO library (bookid, bookname, author, available) VALUES (001, 'SPring', 'ss', 'Y')";
         
        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }
    }
 
	
}
