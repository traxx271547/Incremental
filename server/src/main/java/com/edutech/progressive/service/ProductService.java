package com.edutech.progressive.service;

import com.edutech.progressive.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts()throws SQLException  throws SQLException;

    Product getProductById(int productId)throws SQLException  throws SQLException;

    int addProduct(Product product)throws SQLException  throws SQLException;

    void updateProduct(Product product)throws SQLException  throws SQLException;

    void deleteProduct(int productId)throws SQLException  throws SQLException;

    //Do not implement these methods in ProductServiceImplJdbc.java class
    default List<Product> getAllProductByWarehouse(int warehouseId) {
        return null;
    }
}