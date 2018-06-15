package com.sbd.dao.impl;

import com.sbd.dao.FlightHistoryDAO;
import com.sbd.entities.FlightHistory;
import com.sbd.util.CassandraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class FlightHistoryDAOImpl implements FlightHistoryDAO {

    @Autowired
    private CassandraRepository repository;

    @Override
    public FlightHistory getFlightHistory(UUID id) {
        return repository.findById(id, FlightHistory.class);
    }

    @Override
    public void createFlightHistory(FlightHistory history) {
        repository.create(history);
    }

    @Override
    public void updateFlightHistory(FlightHistory history) {
        repository.update(history);
    }

    @Override
    public void deleteFlightHistory(UUID id) {
        repository.deleteById(id, FlightHistory.class);
    }

    @Override
    public List<FlightHistory> getAllFlightHistory() {
        return repository.findAll(FlightHistory.class, "flights_history");
    }
}
