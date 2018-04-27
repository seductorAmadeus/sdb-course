package com.sbd.services.impl;

import com.sbd.dao.OperationHistoryDAO;
import com.sbd.dao.RegisteredFailureDAO;
import com.sbd.entities.OperationHistory;
import com.sbd.services.OperationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OperationHistoryServiceImpl implements OperationHistoryService {

    @Autowired
    private OperationHistoryDAO operationHistoryDAO;

    public OperationHistoryServiceImpl() { super();  }

    @Override
    public OperationHistory getOperationHistory(UUID id) {
        return operationHistoryDAO.getOperationHistory(id);
    }

    @Override
    public void createOperationHistory(OperationHistory history) {
        operationHistoryDAO.createOperationHistory(history);
    }

    @Override
    public void updateOperationHistory(OperationHistory history) {
        operationHistoryDAO.updateOperationHistory(history);
    }

    @Override
    public void deleteOperationHistory(UUID id) {
        operationHistoryDAO.deleteOperationHistory(id);
    }

    @Override
    public List<OperationHistory> getAllOperationHistory() {
        return operationHistoryDAO.getAllOperationHistory();
    }
}
