package com.sbd.dao;

import com.sbd.entities.FlightHistory;
import com.sbd.entities.OperationHistory;

import java.util.List;
import java.util.UUID;

public interface FlightHistoryDAO {
    public FlightHistory getFlightHistory (UUID id);
    public void createFlightHistory (FlightHistory history);
    public void updateFlightHistory (FlightHistory history);
    public void deleteFlightHistory (UUID id);
    public List<FlightHistory> getAllFlightHistory ();
}
