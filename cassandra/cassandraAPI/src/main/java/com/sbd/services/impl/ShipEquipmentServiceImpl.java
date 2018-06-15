package com.sbd.services.impl;

import com.sbd.dao.ShipEquipmentDAO;
import com.sbd.dao.ShipFeatureDAO;
import com.sbd.entities.ShipEquipment;
import com.sbd.services.ShipEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ShipEquipmentServiceImpl implements ShipEquipmentService {

    @Autowired
    private ShipEquipmentDAO shipEquipmentDAO;

    public ShipEquipmentServiceImpl() {
        super();
    }

    @Override
    public ShipEquipment getShipEquipment(UUID id) {
        return shipEquipmentDAO.getShipEquipment(id);
    }

    @Override
    public void createShipEquipment(ShipEquipment equipment) {
        shipEquipmentDAO.createShipEquipment(equipment);
    }

    @Override
    public void updateShipEquipment(ShipEquipment equipment) {
        shipEquipmentDAO.updateShipEquipment(equipment);
    }

    @Override
    public void deleteShipEquipment(UUID id) {
        shipEquipmentDAO.deleteShipEquipment(id);
    }

    @Override
    public List<ShipEquipment> getAllShipEquipment() {
        return shipEquipmentDAO.getAllShipEquipment();
    }
}
