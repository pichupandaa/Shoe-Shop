package com.onlineshoe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.onlineshoe.dbUtility.DBUtility;
import com.onlineshoe.pojo.Shoe;

public class ShoeDaoImp implements ShoeDao
{
	@Override
	public boolean addShoe(Shoe shoe)
	{
		int row=0;
    	Connection con=DBUtility.getConnection();
    	String query="insert into Shoe(shoeTitle,shoeDescription) values(?,?)";
    	try
    	{
    	    PreparedStatement stmt= con.prepareStatement(query);
    	    stmt.setString(1,shoe.getShoeTitle());
    	    stmt.setString(2,shoe.getShoeDescription());
    	    row=stmt.executeUpdate();
    	}
    	
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    	
    	if(row>0)
    	   return true;
    	else
    	   return false;
	}

	@Override
	public List<Shoe> getAllShoe()
	{
		Connection con=DBUtility.getConnection();
		String query="select * from shoe";
		ResultSet rs;
		Statement stmt;
		Shoe shoe;
		List<Shoe> li=new ArrayList<>();
		
		try
    	{
    	    stmt=con.createStatement();
    	    rs=stmt.executeQuery(query);
    	    
    	    while(rs.next())
    	    {
    	    	shoe=new Shoe(rs.getString("shoeTitle"), rs.getString("shoeDescription"));
    	    	shoe.setShoeId(rs.getInt("shoeId"));
    	       li.add(shoe);
    	    }
    	}
    	
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    	
    	return li;
		
	}

	@Override
	public int getShoeIdByProductId(int productId)
	{
		Connection con=DBUtility.getConnection();
		String query="select shoeId from product where productId="+productId;
		ResultSet rs;
		Statement stmt;
		int shoeId=0;
		try
    	{
    	    stmt=con.createStatement();
    	    rs=stmt.executeQuery(query);
    	    
    	    while(rs.next())
    	    {
    	    	shoeId=rs.getInt("shoeId");
    	    }
    	}
    	
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    	
    	return shoeId;
	}

	@Override
	public int getTotalShoe() {
		int totalShoe=0;
		   ResultSet rs;
	 	   
	 	   Connection con=DBUtility.getConnection();
	        String query="select count(shoeId) from shoe";
	        
	 	   try 
	 	   {
	 		Statement stmt=con.createStatement();
	 	    rs=stmt.executeQuery(query);
	 	    while(rs.next())
	 		{
	 	    	  totalShoe=rs.getInt("count(shoeId)");
	 		}
	 	   }
	 	   catch (SQLException e) 
	 	   {
	 		e.printStackTrace();
	 	   }
	 	  
		 
		return totalShoe;  
	}

	@Override
	public String getShoeNameById(int shoeId)
	{
		   String shoeName=null;
		   ResultSet rs;
	 	   
	 	   Connection con=DBUtility.getConnection();
	        String query="select shoeTitle from Shoe where shoeId="+shoeId;
	        
	 	   try 
	 	   {
	 		Statement stmt=con.createStatement();
	 	    rs=stmt.executeQuery(query);
	 	    while(rs.next())
	 		{
	 	    	shoeName=rs.getString("shoeTitle");
	 		}
	 	   }
	 	   catch (SQLException e) 
	 	   {
	 		e.printStackTrace();
	 	   }
	 	  
		 
		return shoeName; 
	}

	@Override
	public boolean deleteShoeById(int shoeId)
	{
		int row=0;
    	Connection con=DBUtility.getConnection();
    	String query="delete from shoe where shoeId=?";
    	try
    	{
    	    PreparedStatement stmt= con.prepareStatement(query);
    	    stmt.setInt(1, shoeId);
    	    row=stmt.executeUpdate();
    	}
    	
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    	
    	if(row>0)
    	   return true;
    	else
    	   return false;
	}
}
