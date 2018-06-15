package com.sbd.dao;

import com.sbd.entities.ShipEquipment;
import java.util.List;
import java.util.UUID;

public interface ShipEquipmentDAO {
    public ShipEquipment getShipEquipment (UUID id);
    public void createShipEquipment  (ShipEquipment equipment);
    public void updateShipEquipment(ShipEquipment equipment);
    public void deleteShipEquipment (UUID id);
    public List<ShipEquipment> getAllShipEquipment ();
}
