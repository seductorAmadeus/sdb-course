package com.sbd.dao;

import com.sbd.entities.OperationHistory;
import java.util.List;
import java.util.UUID;

public interface OperationHistoryDAO {
    public OperationHistory getOperationHistory (UUID id);
    public void createOperationHistory(OperationHistory history);
    public void updateOperationHistory (OperationHistory history);
    public void deleteOperationHistory (UUID id);
    public List<OperationHistory> getAllOperationHistory ();
}
