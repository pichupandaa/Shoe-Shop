package com.onlineshoe.dao;

import java.util.List;

import com.onlineshoe.pojo.Shoe;

public interface ShoeDao
{
	boolean addShoe(Shoe shoe);
    List<Shoe> getAllShoe(); 
    int getShoeIdByProductId(int productId);
    int getTotalShoe();
    String getShoeNameById(int shoeId);
    boolean deleteShoeById(int shoeId);
}
