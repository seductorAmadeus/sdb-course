package com.sbd.controllers;

import com.sbd.entities.RegisteredFailure;
import com.sbd.entities.ShipEquipment;
import com.sbd.services.RegisteredFailureService;
import com.sbd.services.ShipEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
public class RegisteredFailureController {

    @Autowired
    private RegisteredFailureService service;

    @RequestMapping(value = "/registeredfailure", method = RequestMethod.POST)
    void create(@RequestBody RegisteredFailure failure) {
        service.createRegisteredFailure(failure);
    }

    @RequestMapping(value = "/registeredfailure/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") UUID id) {
        service.deleteRegisteredFailure(id);
    }

    @RequestMapping(value = "/registeredfailure", method = RequestMethod.GET)
    List<RegisteredFailure> findAll() {
        return service.getAllRegisteredFailure();
    }

    @RequestMapping(value = "/registeredfailure/{id}", method = RequestMethod.GET)
    RegisteredFailure findById(@PathVariable("id") UUID id) {
        return service.getRegisteredFailure(id);
    }

    @RequestMapping(value = "/registeredfailure", method = RequestMethod.PUT)
    void update(@RequestBody RegisteredFailure failure) {
        service.updateRegisteredFailure(failure);
    }
}

