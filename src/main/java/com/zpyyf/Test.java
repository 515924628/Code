package com.zpyyf;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {


	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = (JdbcTemplate) new ClassPathXmlApplicationContext("app.xml")
				.getBean("jdbcTemplate");

	}
}
