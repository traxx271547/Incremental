package com.edutech.progressive.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edutech.progressive.config.DatabaseConnectionManager;
import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplJdbc  implements  WarehouseService {

    private Connection connection;

    public WarehouseServiceImplJdbc() {
        this.connection = DatabaseConnectionManager.getConnection();
    }

    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException{
        List<Warehouse> warehouseList = new ArrayList<>();
        String query = "SELECT * FROM warehouse";
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Warehouse warehouse = new Warehouse(rs.getInt("warehouse_id"), rs.getInt("supplier_id"), rs.getString("warehouse_name"), rs.getString("location"), rs.getInt("capacity"));
            warehouseList.add(warehouse);
        }
        return warehouseList;

    }

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException{
        String query = "INSERT INTO warehouse (supplier_id, warehouse_name, location, capacity) VALUES(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, warehouse.getSupplierId());
        ps.setString(2, warehouse.getWarehouseName());
        ps.setString(3, warehouse.getLocation());
        ps.setInt(4, warehouse.getCapacity());
        int check = ps.executeUpdate();
        if(check > 0){
            return 1;
        }
        
        return -1;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        return new ArrayList<>();
    }

}