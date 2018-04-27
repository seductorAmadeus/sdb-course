package com.sbd.services.impl;

import com.sbd.dao.RegisteredFailureDAO;
import com.sbd.dao.ShipEquipmentDAO;
import com.sbd.entities.RegisteredFailure;
import com.sbd.services.RegisteredFailureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class RegisteredFailureServiceImpl implements RegisteredFailureService {

    @Autowired
    private RegisteredFailureDAO registeredFailureDAO;

    public RegisteredFailureServiceImpl() { super(); }

    @Override
    public RegisteredFailure getRegisteredFailure(UUID id) {
        return registeredFailureDAO.getRegisteredFailure(id);
    }

    @Override
    public void createRegisteredFailure(RegisteredFailure failure) {
        registeredFailureDAO.createRegisteredFailure(failure);
    }

    @Override
    public void updateRegisteredFailure(RegisteredFailure failure) {
        registeredFailureDAO.updateRegisteredFailure(failure);
    }

    @Override
    public void deleteRegisteredFailure(UUID id) {
        registeredFailureDAO.deleteRegisteredFailure(id);
    }

    @Override
    public List<RegisteredFailure> getAllRegisteredFailure() {
        return registeredFailureDAO.getAllRegisteredFailure();
    }
}
