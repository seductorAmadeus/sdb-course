package com.sbd.controllers;

import com.sbd.entities.OperationHistory;
import com.sbd.entities.RegisteredFailure;
import com.sbd.services.OperationHistoryService;
import com.sbd.services.RegisteredFailureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class OperationHistoryController {
    @Autowired
    private OperationHistoryService service;

    @RequestMapping(value = "/operationhistory", method = RequestMethod.POST)
    void create(@RequestBody OperationHistory history) {
        service.createOperationHistory(history);
    }

    @RequestMapping(value = "/operationhistory/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") UUID id) {
        service.deleteOperationHistory(id);
    }

    @RequestMapping(value = "/operationhistory", method = RequestMethod.GET)
    List<OperationHistory> findAll() {
        return service.getAllOperationHistory();
    }

    @RequestMapping(value = "/operationhistory/{id}", method = RequestMethod.GET)
    OperationHistory findById(@PathVariable("id") UUID id) {
        return service.getOperationHistory(id);
    }

    @RequestMapping(value = "/operationhistory", method = RequestMethod.PUT)
    void update(@RequestBody OperationHistory failure) {
        service.updateOperationHistory(failure);
    }

}
