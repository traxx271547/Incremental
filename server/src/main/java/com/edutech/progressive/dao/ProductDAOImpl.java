package com.edutech.progressive.dao;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Product;

public class ProductDAOImpl implements ProductDAO{



    @Override
    public int addProduct(Product product) throws SQLException{
        return -1;
    }

    @Override
    public Product getProductById(int productId) throws SQLException{
       return null;
    }

    @Override
    public void updateProduct(Product product) throws SQLException{
       
    }

    @Override
    public void deleteProduct(int productId) throws SQLException{
        
    }

    @Override
    public List<Product> getAllProducts() throws SQLException{
        return new ArrayList<>();
    }

}
