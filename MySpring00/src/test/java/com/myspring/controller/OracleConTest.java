package com.myspring.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleConTest {
	
	private static final String DRIVER="oracle.jdbc.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@cocoafe.com:1521:xe";
	private static final String USER="week2";
	private static final String PWD="week2";
	
	@Test
	public void TestCon() throws Exception{
		Class.forName(DRIVER);//오라클 연결 드라이버 클래스 로드
		try(Connection con = DriverManager.getConnection(URL, USER, PWD)) {
			System.out.println(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
