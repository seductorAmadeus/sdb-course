package com.sbd.controllers;

import com.sbd.entities.ShipEquipment;
import com.sbd.services.ShipEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
public class ShipEquipmentController {

    @Autowired
    private ShipEquipmentService service;

    @RequestMapping(value = "/shipequipment", method = RequestMethod.POST)
    void create(@RequestBody ShipEquipment equipment) {
        service.createShipEquipment(equipment);
    }

    @RequestMapping(value = "/shipequipment/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") UUID id) {
        service.deleteShipEquipment(id);
    }

    @RequestMapping(value = "/shipequipment", method = RequestMethod.GET)
    List<ShipEquipment> findAll() {
        return service.getAllShipEquipment();
    }

    @RequestMapping(value = "/shipequipment/{id}", method = RequestMethod.GET)
    ShipEquipment findById(@PathVariable("id") UUID id) {
        return service.getShipEquipment(id);
    }

    @RequestMapping(value = "/shipequipment", method = RequestMethod.PUT)
    void update(@RequestBody ShipEquipment equipment) {
        service.updateShipEquipment(equipment);
    }
}
