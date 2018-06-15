package com.sbd.services.impl;

import com.sbd.dao.FlightHistoryDAO;
import com.sbd.dao.OperationHistoryDAO;
import com.sbd.entities.FlightHistory;
import com.sbd.services.FlightHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FlightHistoryServiceImpl implements FlightHistoryService{

    @Autowired
    private FlightHistoryDAO flightHistoryDAO;

    public FlightHistoryServiceImpl() { super();  }

    @Override
    public FlightHistory getFlightHistory(UUID id) {
        return flightHistoryDAO.getFlightHistory(id);
    }

    @Override
    public void createFlightHistory(FlightHistory history) {
        flightHistoryDAO.createFlightHistory(history);
    }

    @Override
    public void updateFlightHistory(FlightHistory history) {
        flightHistoryDAO.updateFlightHistory(history);
    }

    @Override
    public void deleteFlightHistory(UUID id) {
        flightHistoryDAO.deleteFlightHistory(id);
    }

    @Override
    public List<FlightHistory> getAllFlightHistory() {
        return flightHistoryDAO.getAllFlightHistory();
    }
}
