package com.sbd.controllers;

import com.sbd.entities.FlightHistory;
import com.sbd.entities.OperationHistory;
import com.sbd.services.FlightHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class FlightHistoryController {

    @Autowired
    private FlightHistoryService service;

    @RequestMapping(value = "/flighthistory", method = RequestMethod.POST)
    void create(@RequestBody FlightHistory history) {
        service.createFlightHistory(history);
    }

    @RequestMapping(value = "/flighthistory/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") UUID id) {
        service.deleteFlightHistory(id);
    }

    @RequestMapping(value = "/flighthistory", method = RequestMethod.GET)
    List<FlightHistory> findAll() {
        return service.getAllFlightHistory();
    }

    @RequestMapping(value = "/flighthistory/{id}", method = RequestMethod.GET)
    FlightHistory findById(@PathVariable("id") UUID id) {
        return service.getFlightHistory(id);
    }

    @RequestMapping(value = "/flighthistory", method = RequestMethod.PUT)
    void update(@RequestBody FlightHistory failure) {
        service.updateFlightHistory(failure);
    }

}
