package com.sbd.services.impl;

import com.sbd.dao.ShipFeatureDAO;
import com.sbd.entities.ShipFeature;
import com.sbd.services.ShipFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ShipFeatureServiceImpl implements ShipFeatureService {

    @Autowired
    private ShipFeatureDAO shipFeatureDAO;

    public ShipFeatureServiceImpl() {
        super();
    }

    @Override
    public ShipFeature getShipFeature(UUID id) {
        return shipFeatureDAO.getShipFeature(id);
    }

    @Override
    public void createShipFeature(ShipFeature feature) {
        shipFeatureDAO.createShipFeature(feature);
    }

    @Override
    public void updateShipFeature(ShipFeature feature) {
        shipFeatureDAO.updateShipFeature(feature);
    }

    @Override
    public void deleteShipFeature(UUID id) {
        shipFeatureDAO.deleteShipFeature(id);
    }

    @Override
    public List<ShipFeature> getAllShipFeatures() { return shipFeatureDAO.getAllShipFeatures();  }
}
