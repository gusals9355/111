package ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionExam4 {
	public static void main(String[] args) {
//		DBUtils du = new DBUtils();
//		Connection con = du.getCon();
		
		//싱글톤 : 프로그램안에서 객체 1개만 만들어지도록 유도
		//2개 이상 만들 수 없도록 한다.
		
		DBUtils du = DBUtils.getInstance();
		DBUtils du2 = DBUtils.getInstance();
		
		System.out.println(du == du2);
		
	}
}

class DBUtils{
	
	private static DBUtils dbUtils=null;
	
	private DBUtils() {}
	
	public static DBUtils getInstance() {
		if(dbUtils == null) {
			dbUtils = new DBUtils();
		}
		return dbUtils;
	}
	
	Connection getCon() {
		Connection con = null;
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver"); //요즘은 굳이 안해도된다고함 url에서 알아서 받는다고함
			final String URL = "jdbc:mysql://localhost:3308/java";
			final String ID = "root";
			final String PW = "koreait";
					
			con = DriverManager.getConnection(URL, ID, PW);
			System.out.println("접속성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}