package com.sbd.dao.impl;

import com.sbd.dao.OperationHistoryDAO;
import com.sbd.entities.OperationHistory;
import com.sbd.util.CassandraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class OperationHistoryDAOImpl implements OperationHistoryDAO {

    @Autowired
    private CassandraRepository repository;

    @Override
    public OperationHistory getOperationHistory(UUID id) {
        return repository.findById(id, OperationHistory.class);
    }

    @Override
    public void createOperationHistory(OperationHistory history) {
        repository.create(history);
    }

    @Override
    public void updateOperationHistory(OperationHistory history) {
        repository.update(history);
    }

    @Override
    public void deleteOperationHistory(UUID id) {
        repository.deleteById(id, OperationHistory.class);
    }

    @Override
    public List<OperationHistory> getAllOperationHistory() {
        return repository.findAll(OperationHistory.class, "operations_history");
    }
}
