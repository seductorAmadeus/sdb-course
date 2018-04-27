package com.sbd.controllers;

import com.sbd.entities.ShipFeature;
import com.sbd.services.ShipFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ShipFeatureController {

    @Autowired
    private ShipFeatureService service;

    @RequestMapping(value = "/shipfeature", method = RequestMethod.POST)
    void create(@RequestBody ShipFeature feature) {
        service.createShipFeature(feature);
    }

    @RequestMapping(value = "/shipfeature/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") UUID id) {
        service.deleteShipFeature(id);
    }

    @RequestMapping(value = "/shipfeature", method = RequestMethod.GET)
    List<ShipFeature> findAll() {
        return service.getAllShipFeatures();
    }

    @RequestMapping(value = "/shipfeature/{id}", method = RequestMethod.GET)
    ShipFeature findById(@PathVariable("id") UUID id) {
        return service.getShipFeature(id);
    }

    @RequestMapping(value = "/shipfeature", method = RequestMethod.PUT)
    void update(@RequestBody ShipFeature feature) {
        service.updateShipFeature(feature);
    }
}
