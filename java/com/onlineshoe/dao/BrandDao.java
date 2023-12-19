package com.onlineshoe.dao;

import java.util.List;

import com.onlineshoe.pojo.*;

public interface BrandDao
{
	boolean addBrand(Brand brand);
    List<Brand> getAllBrand(); 
    int getBrandIdByProductId(int productId);
    int getTotalBrand();
    String getBrandNameById(int brandId);
    boolean deleteBrandById(int brandId);
}
