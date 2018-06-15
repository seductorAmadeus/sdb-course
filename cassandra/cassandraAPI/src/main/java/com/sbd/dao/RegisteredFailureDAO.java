package com.sbd.dao;

import com.sbd.entities.RegisteredFailure;
import com.sbd.entities.ShipEquipment;

import java.util.List;
import java.util.UUID;

public interface RegisteredFailureDAO {
    public RegisteredFailure getRegisteredFailure (UUID id);
    public void createRegisteredFailure (RegisteredFailure failure);
    public void updateRegisteredFailure (RegisteredFailure failure);
    public void deleteRegisteredFailure (UUID id);
    public List<RegisteredFailure> getAllRegisteredFailure ();
}
