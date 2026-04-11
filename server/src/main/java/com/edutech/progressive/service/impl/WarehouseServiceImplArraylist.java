package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService{

    List<Warehouse> warehouses = new ArrayList<>();

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouses;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
        return warehouses.size();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        Collections.sort(warehouses);
        return getAllWarehouses();
    }

    public void emptyArrayList(){
        warehouses.clear();
    }
    

}