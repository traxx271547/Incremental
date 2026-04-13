package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplJpa implements WarehouseService {

    List<Warehouse> warehouses = new ArrayList<>();

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouses;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        return -1;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity(){
        return List.of();
    }

    public void updateWarehouse(Warehouse warehouse){

    }

    public void deleteWarehouse(int warehouse){

    }

    public Warehouse getWarehouseById(int warehouseId){
        return null;

    }

    public List<Warehouse> getWarehouseBySupplier(int supplierId){
        return null;
    }

}