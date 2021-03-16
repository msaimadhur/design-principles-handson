package com.cts.handson2.singleton;

public class App {

	public static void main(String[] args) {
		DBConn db1 = DBConn.getInstance();
		DBConn db2 = DBConn.getInstance();
		System.out.println(db1.equals(db2));
	}
}
