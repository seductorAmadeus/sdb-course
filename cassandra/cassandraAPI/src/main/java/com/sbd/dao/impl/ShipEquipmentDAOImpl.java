package com.sbd.dao.impl;

import com.sbd.dao.ShipEquipmentDAO;
import com.sbd.entities.ShipEquipment;
import com.sbd.util.CassandraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class ShipEquipmentDAOImpl implements ShipEquipmentDAO {

    @Autowired
    private CassandraRepository repository;

    @Override
    public ShipEquipment getShipEquipment(UUID id) {
        return repository.findById(id, ShipEquipment.class);
    }

    @Override
    public void createShipEquipment(ShipEquipment equipment) {
        repository.create(equipment);
    }

    @Override
    public void updateShipEquipment(ShipEquipment equipment) {
        repository.update(equipment);
    }

    @Override
    public void deleteShipEquipment(UUID id) {
        repository.deleteById(id, ShipEquipment.class);
    }

    @Override
    public List<ShipEquipment> getAllShipEquipment() {
        return repository.findAll(ShipEquipment.class, "ship_equipment");
    }
}
