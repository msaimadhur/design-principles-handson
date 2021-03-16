package com.cts.handson2.singleton;

public class DBConn {
	private static DBConn instance = new DBConn();
	
	private DBConn() {
		
	}
	
	public static DBConn getInstance()
	{
		return instance;
	}
	
	
}
