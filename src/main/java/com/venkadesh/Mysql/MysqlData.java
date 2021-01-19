package com.venkadesh.Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import com.venkadesh.vkfast_food.Ingredients;

public class MysqlData {
	 private Connection con;
	 private PreparedStatement pst;
	 
	public void init()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class found!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/vkfast_foodcentre";
		String name="root";
		String pas="itadmin@1234";
		
		
		try {
			con=DriverManager.getConnection(url,name,pas);
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getName()
	{
		        String sql="select * from food";
		    	Statement stm;
		    	
		    	
		    	try {
		    		 stm = con.createStatement();
					 ResultSet rs=stm.executeQuery(sql);
					
					 
					Ingredients ig=new Ingredients();
					ig.setId(rs.getInt(1));
					ig.setName(rs.getString(2));
					ig.setPrices(rs.getDouble(3));
					ig.setDes(rs.getString(4));
					
					StringBuilder sb=new StringBuilder();
                    sb.append(ig.getId());
                    sb.append(ig.getName());
                    sb.append(ig.getPrices());
                    sb.append(ig.getDes());
                    System.out.println(sb);
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		    	
		    	
		    }
		    
		

}
