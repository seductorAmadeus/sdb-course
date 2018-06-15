package com.sbd.services;

import com.sbd.entities.OperationHistory;
import java.util.List;
import java.util.UUID;

public interface OperationHistoryService {
    public OperationHistory getOperationHistory (UUID id);
    public void createOperationHistory(OperationHistory history);
    public void updateOperationHistory (OperationHistory history);
    public void deleteOperationHistory (UUID id);
    public List<OperationHistory> getAllOperationHistory ();
}
