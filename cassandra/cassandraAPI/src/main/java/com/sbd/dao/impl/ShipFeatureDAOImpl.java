package com.sbd.dao.impl;

import com.sbd.dao.ShipFeatureDAO;
import com.sbd.entities.ShipFeature;
import com.sbd.util.CassandraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class ShipFeatureDAOImpl implements ShipFeatureDAO {

    @Autowired
    private CassandraRepository repository;

    @Override
    public ShipFeature getShipFeature(UUID id) {
        return repository.findById(id, ShipFeature.class);
    }

    @Override
    public void createShipFeature(ShipFeature feature) {
        repository.create(feature);
    }

    @Override
    public void updateShipFeature(ShipFeature feature) {
        repository.update(feature);
    }

    @Override
    public void deleteShipFeature(UUID id) {
        repository.deleteById(id, ShipFeature.class);
    }

    @Override
    public List<ShipFeature> getAllShipFeatures() {
        return repository.findAll(ShipFeature.class, "ship_features");
    }
}
