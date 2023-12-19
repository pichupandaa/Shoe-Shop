package com.onlineshoe.dao;

import java.util.List;

import com.onlineshoe.pojo.Product;

public interface ProductDao
{
   boolean addProduct(Product product);
   boolean updateProduct(Product product);
   List<Product> getAllProduct();
   List<Product> getProductByCategory(int categoryId);
   List<Product> getProductByShoe(int shoeId);
   List<Product> getSearchedProduct(String productName);
   List<Product> getSearchedProduct(String productFor,int brandId,int shoeId,int productRange);
   Product getProductById(int productId);
   int getTotalProduct();
   boolean deleteProductById(int productId);
   boolean deleteProductByCategoryId(int categoryId);
   boolean deleteProductByShoeId(int shoeId);
   int getQuantityByProductId(int productId);
   void updateQuantityAfterOrder(int productId,int productQuantity);
   int getTotalProductOfCategoryById(int categoryId);
   int getTotalProductOfShoeById(int shoeId);
   List<Product> getProductByBrandAndFor(String productFor,int shoeId); 
}




