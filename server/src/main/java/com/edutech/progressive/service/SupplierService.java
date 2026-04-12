package com.edutech.progressive.service;


import com.edutech.progressive.entity.Supplier;

import java.sql.SQLException;
import java.util.List;

public interface SupplierService {
    List<Supplier> getAllSuppliers();

    int addSupplier(Supplier supplier);

    List<Supplier> getAllSuppliersSortedByName();

    default public void emptyArrayList()  throws SQLException {
    }

    //Do not implement these methods in SupplierServiceImplArraylist.java class
    default void updateSupplier(Supplier supplier)  throws SQLException {
    }

    default void deleteSupplier(int supplierId) throws SQLException {
    }

    default Supplier getSupplierById(int supplierId)  throws SQLException{
        return null;
    }

}