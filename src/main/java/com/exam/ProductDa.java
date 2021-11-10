package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDa {
	Connection con;
	PreparedStatement pstmt;
	public List<Product> allProduct() {
		List<Product> pList = new ArrayList<>();
		Product p;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshop", "root", "idb@123456");
			 pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
			//for date type 
			//Take sql.Date in pojo then no need to convert
			//Otherwise convert to sql.Date
			// java.util.Date d = new java.util.Date();
			//java.sql.Date sd = new java.sql.Date(d.getTime());
			
			while (rs.next()) {
				//System.out.println(rs.getInt(1));
				p=new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDate(5),rs.getInt(6),rs.getString(7),rs.getString(8));
				pList.add(p);
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pList;
	}
	
	
	public Product showbyid(int id) {
		//List<Product> pList = new ArrayList<>();
		Product p=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshop", "root", "idb@123456");
			pstmt = con.prepareStatement("select * from product where id="+id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				//System.out.println(rs.getInt(1));
				p = new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDate(5),rs.getInt(6),rs.getString(7),rs.getString(8));
				//stList.add(s);
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	public void insert(Product p) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshop", "root", "idb@123456");
			pstmt = con.prepareStatement("insert into product values(?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, p.id);
			pstmt.setString(2, p.name);
			pstmt.setString(3, p.brand);
			pstmt.setDouble(4, p.price);
			pstmt.setDate(5, p.edate);
			pstmt.setInt(6, p.stock);
			pstmt.setString(7, p.category);
			pstmt.setString(7, p.category);
			int n = pstmt.executeUpdate();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void update(Product p) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshop", "root", "idb@123456");
			pstmt = con.prepareStatement("update product set name=?,brand=?,price=?,edate=?,stock=?,category=? where id=?");
			pstmt.setString(1, p.name);
			pstmt.setString(2, p.brand);
			pstmt.setDouble(3, p.price);
			pstmt.setDate(4, p.edate);
			pstmt.setInt(5, p.stock);
			pstmt.setString(6, p.category);
			pstmt.setInt(7, p.id);
			int n = pstmt.executeUpdate();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deletebyid(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshop", "root", "idb@123456");
			pstmt = con.prepareStatement("delete  from product where id="+id);
			int n = pstmt.executeUpdate();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
