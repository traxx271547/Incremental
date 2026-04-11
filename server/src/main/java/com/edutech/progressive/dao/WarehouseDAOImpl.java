package com.edutech.progressive.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Warehouse;

public class WarehouseDAOImpl implements WarehouseDAO{

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException{
        return -1;
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) throws SQLException{
        return null;
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) throws SQLException{
        
    }

    @Override
    public void deleteWarehouse(int warehouseId) throws SQLException{
        
    }

    @Override
    public List<Warehouse> getAllWarehouse() throws SQLException{
        return new ArrayList<>();
    }

}
