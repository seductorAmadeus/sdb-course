package com.sbd.dao;

import com.sbd.entities.ShipFeature;

import java.util.List;
import java.util.UUID;

public interface ShipFeatureDAO {
    public ShipFeature getShipFeature (UUID id);
    public void createShipFeature (ShipFeature feature);
    public void updateShipFeature (ShipFeature feature);
    public void deleteShipFeature (UUID id);
    public List<ShipFeature> getAllShipFeatures ();
}
