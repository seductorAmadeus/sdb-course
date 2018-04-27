package com.sbd.services;

import com.sbd.entities.FlightHistory;

import java.util.List;
import java.util.UUID;

public interface  FlightHistoryService {
    public FlightHistory getFlightHistory (UUID id);
    public void createFlightHistory (FlightHistory history);
    public void updateFlightHistory (FlightHistory history);
    public void deleteFlightHistory (UUID id);
    public List<FlightHistory> getAllFlightHistory ();
}
